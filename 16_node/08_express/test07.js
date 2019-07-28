const express = require("express");
const board = require("./board");
const app = express();
const port = 3000;

// 라우터를 특정 경로에 매핑하기
// localhost:3000/board/list.do
app.use("/board", board);

app.get("/", function (request, response) {
    response.send("최초 메인");
});


app.listen(port, function () {
    console.log("서버 구동중...");
});