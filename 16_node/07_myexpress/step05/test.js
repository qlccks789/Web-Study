// 서버가 시작되었습니다.
const app = require("./express")();

// 미들웨어
app.use(function (req, res) {
  console.log(1);
  req.msg = "a";
});
app.use(function (req, res) {
  console.log(2);
  req.msg += "b";
});

app.get("/", function (request, response) {
  console.log("msg : " + request.msg);
  response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
  response.end("<h2>안녕하세요</h2>");
});
app.get("/test", function (request, response) {
  response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
  response.end("<h2>test - GET 호출</h2>");
});
app.post("/test", function (request, response) {
  response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
  response.end("<h2>test - POST 호출</h2>");
});

app.listen(3000, function () {
    console.log("서버가 시작되었습니다.");
});