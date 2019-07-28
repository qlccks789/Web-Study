const http = require("http");
const fs = require("fs");
const port = 10001;

http.createServer(function (request, response) {
    let callUrl = request.url;
    if (callUrl == '/favicon.ico') {
        response.end();
        return;
    }

    switch (callUrl) {
        case "/html.do":
            fs.readFile("data/test.html", function (err, data) {
                if (err) {
                    response.end("<h1>Server Error</h1>");
                    return ;
                }
                response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
                response.end(data);
            });
            break;
        case "/image.do":
            fs.readFile("data/test.jpg", function (err, data) {
                if (err) {
                    response.end("<h1>Server Error</h1>");
                    return ;
                }
                response.writeHead(200, {"Content-Type": "image/jpeg"});
                response.end(data);
            });        
            break;
        case "/audio.do":
            fs.readFile("data/test.mp3", function (err, data) {
                if (err) {
                    response.end("<h1>Server Error</h1>");
                    return ;
                }
                response.writeHead(200, {"Content-Type": "audio/mp3"});
                response.end(data);
            });            
            break;
        default:
            response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
            response.end("<h1>요청한 URI에 대한 페이지를 찾을 수 없습니다.</h1>");
            return ;                    
    }
})
.listen(port, function () {
    console.log(`${port} 로 구동`);
});