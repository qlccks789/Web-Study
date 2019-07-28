// npm install body-parser
const express = require("express");
const app = express();
const pug = require("pug");
// POST 방식의 요청 파라미터를 request.body 속성을 추가하여 처리함
const bodyParser = require("body-parser");

app.use(bodyParser.json());  // JSON 데이터 처리
app.use(bodyParser.urlencoded({extended:true}));  // POST 데이터 처리

app.get("/", function (request, response) {
    response.send(pug.renderFile("views/form.pug"));
});

app.post("/form.do", function (request, response) {
    // request.body를 사용하기 위해서는 
    // bodyParser 미들웨어를 use를 통해서 등록해야 한다.
    response.send(
        `<h1>${request.body.jumin1}</h1>
         <h1>${request.body.jumin2}</h1>
        `
    );
});

app.listen(3000, function () {
    console.log("서버 구동됨");
});