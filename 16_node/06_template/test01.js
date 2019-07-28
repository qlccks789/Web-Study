/*
    1. handlebars
    2. pug - jade(이전)
    3. ejs


    - PUG 문법 이해하기

    띄워쓰기 주의사항
    탭과 스페이스바 둘중에 하나만 사용해야 함(둘 모두 사용시 에러발생)

    1. 태그 작성시 태그의 이름만 명시한다.
       <h1></h1> -> h1
    2. 태그내에 내용을 입력할 경우에는 태그 이름뒤에 명시한다.
       <h1>hello</h1> -> h1 hello
    3. 만약, 여러줄을 입력하고 싶다면..
       태그명 뒤에 "." 을 사용하거나 또는 태그명 밑에 "|"를 입력해서 사용
       h1.
          Hello~ 
          Hello~ 

       h1
         | Hello    
         | Hello    
    4. 태그의 속성을 작성할 경우 태그명 뒤에 "()"를 사용해서 작성
       <a href='http://www.naver.com'>네이버</a>
       ->
       a(href='http://www.naver.com') 네이버
    
    5. 주석문
       // 주석문 처리됨...       

*/
const pug = require("pug");
const fs = require("fs");
const http = require("http");
const port = 3001;
http.createServer(function (request, response) {
    // pug 파일을 읽은 다음 처리
    fs.readFile("./view/test01.pug", "utf-8", function (err, data) {
        console.log(data);
        // pug 문법에 맞추어 작성한 내용을 html로 컴파일 해야 한다.
        let html = pug.render(data);
        console.log(html);
        response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
        response.end(html);
    });
})
.listen(port, function () {
    console.log(port + "번 구동중");
});
