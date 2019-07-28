const express = require("express");
const app = express();
const port = 3000;

app.use(express.static("public"));

app.get("/", function (request, response) {
    response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
    response.write("<h1>정적 파일 테스트</h1>");
    response.write("<img src='/images/pic1.jpg' width='400' height='300'>");
    response.end();
});

app.listen(port, function () {
    console.log("서버 구동중...");
});