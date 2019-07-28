// npm install body-parser
const express = require("express");
const app = express();
const fs = require("fs");

// POST 방식의 요청 파라미터를 request.body 속성을 추가하여 처리함
const bodyParser = require("body-parser");

app.use(bodyParser.json());  // JSON 데이터 처리
app.use(bodyParser.urlencoded({extended:true}));  // POST 데이터 처리

app.get("/", function (request, response) {
    /*
    fs.readFile("data/form.html", function (err, data) {
        response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
        response.end(data);
    });
    */
    response.sendFile(__dirname + "/data/form.html");
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