const http = require("http");
const port = 10001;

const server = http.createServer(function (request, response) {
    response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
    response.write("<h1>화면에 데이터 전송하기</h1>");
    response.write("<h1>노드를 이용한 응답하기</h1>");
    response.end("<h1>Hello~ NodeJS 노드제이에스</h1>");
});

server.listen(port, function () {
    console.log(`http://localhsot:${port} 번으로 구동중`);
});