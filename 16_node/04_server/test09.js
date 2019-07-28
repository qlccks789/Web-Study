const http = require("http");
const fs = require("fs");
const qs = require("querystring");
const port = 10001;

http.createServer(function (request, response) {
    if (request.method == "GET") {
        fs.readFile("data/post.html", function (err, data) {
            response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
            response.end(data);
        });
    }
    else if (request.method == "POST") {
        // 전송한 파라미터 : id, pass 값을 추출

        // body에 전송되어 온 파라미터 값을 읽을 때 자동 호출됨..
        let paramData = "";
        request.on("data", function (data) {
            paramData += data;
        });

        // 파라미터 내용을 다 읽은 다음에 호출된다.
        request.on("end", function () {

            let param = qs.parse(paramData);
            
            response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
            response.end(
                `<h2>id : ${param.id}</h2>
                 <h2>pass : ${param.pass}</h2>`
            );
        });

    }
})
.listen(port, function () {
    console.log(`${port} 번으로 구동중...`);
});
