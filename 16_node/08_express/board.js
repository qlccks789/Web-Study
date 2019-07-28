// 라우터 파일
const express = require("express");
const router = express.Router();

router.get("/list.do", function (request, response) {
    response.send("목록 페이지");
});
router.get("/write.do", function (request, response) {
    response.send("GET 방식 등록 페이지");
});
router.get("/detail.do", function (request, response) {
    response.send("상세 페이지");
});
router.post("/write.do", function (request, response) {
    response.send("POST 방식 등록 페이지");
});

module.exports = router;