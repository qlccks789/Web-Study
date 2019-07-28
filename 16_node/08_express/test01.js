// npm install express
const app = require("express")();
const port = 3000;

app.get("/", function (request, response) {
    response.send("Hello World!");
});

app.listen(port, function () {
    console.log("서버 구동됨");
});