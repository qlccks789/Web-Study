const http = require("http");
const fs = require("fs");
const port = 10001;

http.createServer(function (request, response) {
    // 파일읽기 : data/test.html
    fs.readFile("data/test.html", function (err, data) {
        if (err) {
            response.end("<h1>Server Error</h1>");
            return;
        }
        response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
        response.end(data);
    });
})
.listen(port, function () {
    console.log(`${port}번으로 서버 구동중 `);
});