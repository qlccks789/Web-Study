const http = require("http");
const port = 10001;

// 서버 생성
const server = http.createServer();

// 사용자가 접속했을때 실행
server.on("request", function () {
    console.log("사용자 요청 들어옴");
});

// 10001 번으로 구동
server.listen(port);

console.log(`${port}번으로 구동중..`);