const http = require("http");
const port = 10001;

const server = http.createServer(function (request, response) {
    console.log(request.url);

    if (request.url == "/favicon.ico") {
        response.end();
        return;
    }

    response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
    response.write("<h1>강사 - kangsa</h1>");
    response.end();
});

server.listen(port, function () {
    console.log(`http://localhost:${port} 번으로 구동중`);
});