// http://localhost:10001/login.do?id=aaa&pass=1234
/*
    호출 경로 : /login.do
    파라미터
    id : aaa
    pass: 1234 

*/
const http = require("http");
const url = require("url");
const port = 10001;

const server = http.createServer(function (request, response) {
    console.log(request.url);
    if (request.url == "/favicon.ico") {
        response.end();
        return;
    }

    var urlObj = url.parse(request.url, true);

    response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
    response.write(
       `<h1>호출 경로 : ${urlObj.pathname}</h1>
        <h1>파라미터</h1>
        <h1>id : ${urlObj.query.id}</h1>
        <h1>pass : ${urlObj.query.pass}</h1>`
    );
    response.end();
});

server.listen(port, function () {
    console.log(`http://localhost:${port} 번으로 실행중..`);
});