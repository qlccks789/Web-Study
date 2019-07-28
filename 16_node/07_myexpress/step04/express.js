const http = require("http");
const url = require("url");

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

    cb(request, response);
});

function error404 (request, response) {
    response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
    response.end("<h1>404 - 요청한 URI에 대한 페이지를 찾을 수 없습니다.</h1>");
}

module.exports = function () {
    return {
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