// npm install supervisor -g 
// 실행 : supervisor test03
const http = require("http");
const port = 10001;

// 서버생성
const server = http.createServer(function (request, response) {
    console.log("사용자 요청 들어옴...");

    // 응답하기 
    response.end();
});

// 포트번호로 구동
server.listen(port);

console.log(`http://localhost:${port} 번으로 구동중...`);