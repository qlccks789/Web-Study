// 서버가 시작되었습니다.
const app = require("./express")();
const fs = require("fs");

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
  fs.readFile("test.html", function (err, data) {
    response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
    response.end(data);
  });
});
app.get("/test", function (request, response) {
  response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
  response.end(
    `<h2>test - GET 호출</h2>
     <h2>name : ${request.query.name}</h2>
     <h2>age : ${request.query.age}</h2>`
  );
});
app.post("/test", function (request, response) {
  response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
  response.end(
    `<h2>test - POST 호출</h2>
     <h2>name : ${request.body.name}</h2>
     <h2>age : ${request.body.age}</h2>`
  );
});

app.listen(3000, function () {
    console.log("서버가 시작되었습니다.");
});