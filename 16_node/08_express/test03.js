const app = require("express")();
const port = 3000;

// next : 다음 미들웨어를 호출..
app.use(function (request, response, next) {
    console.log("첫번째 미들웨어");
    request.msg = "first";

    // 다음 미들웨어 호출...
    next();
});

app.use(function (request, response, next) {
    console.log("두번째 미들웨어");
    request.msg += " second";
    next();
});

app.get("/", function (request, response) {
    response.send("<h1>" + request.msg + "</h1>");
});

app.use(function (request, response, next) {
    response.send("<h1>404 - Not Found</h1>");
});

app.listen(port, function () {
    console.log("서버 구동중...");
});