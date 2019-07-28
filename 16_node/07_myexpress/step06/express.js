const http = require("http");
const url = require("url");
const qs = require("querystring");

let middleware = [];
let getMap = [];
let postMap = [];

const server = http.createServer(function (request, response) {
    let urlInfo = url.parse(request.url, true);
    let cb = null;  // url 요청에 대한 처리 콜백 함수 
    if (request.method == "GET") {
        cb = getMap[urlInfo.pathname];
    } else if (request.method == "POST") {
        cb = postMap[urlInfo.pathname];
    }

    // 사용자가 잘못된 URL을 호출한 경우 처리
    if (cb == null) {
        error404(request, response);
        return;
    }

    // use로 등록요청한 미들웨어를 실행한다.
    for (let i = 0; i < middleware.length; i++) {
        middleware[i](request, response);
    }

    // 파라미터 처리하기
    if (request.method == "GET") {
        request.query = urlInfo.query;
        // 사용자가 요청한 url에 대한 콜백 함수 실행
        cb(request, response);
    } else if (request.method == "POST") {
        let param = "";
        request.on("data", function (data) {
            param += data;
        });
        request.on("end", function () {
            request.body = qs.parse(param);
            cb(request, response);
        });
    }


   
});

function error404 (request, response) {
    response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
    response.end("<h1>404 - 요청한 URI에 대한 페이지를 찾을 수 없습니다.</h1>");
}

module.exports = function () {
    return {
        use(fn) {
            middleware.push(fn);
        },
        get(url, cb) {
            getMap[url] = cb;
        },
        post(url, cb) {
            postMap[url] = cb;
        },
        listen(port, cb) {
            server.listen(port, cb);
        }
    };
};