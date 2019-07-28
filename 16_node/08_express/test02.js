const app = require("express")();
const port = 3000;

app.get("/", function (request, response) {
    console.log("최초 메인");
});
app.get("/board/list.do", function (request, response) {
    console.log("목록 페이지");
});
app.get("/board/write.do", function (request, response) {
    console.log("GET 방식 등록 페이지");
});
app.get("/board/detail.do", function (request, response) {
    console.log("상세 페이지");
});
app.post("/board/write.do", function (request, response) {
    console.log("POST 방식 등록 페이지");
});
app.listen(port, function () {
    console.log("서버 구동중...");
});