/*
      6. pug에서 동적 데이터 처리
         - code 를 작성

      7. pug 파일로 동적으로 값 전달
         pug.renderFile("pug파일", {});

         pug file : #{title}

         {title: "aaa"}

      8. 반복
         each val, index in ["a", "b", 3]   

*/
const pug = require("pug");
const fs = require("fs");
const http = require("http");
const port = 3001;
http.createServer(function (request, response) {
   let html = pug.renderFile(
      "./view/test02.pug", 
      {
         title: "동적값 전달",
         url: "http://www.naver.com",
         arr: [1, 2, 3]
      }
   );
   response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
   response.end(html);
    /*
    // pug 파일을 읽은 다음 처리
    fs.readFile("./view/test02.pug", "utf-8", function (err, data) {
        console.log(data);
        // pug 문법에 맞추어 작성한 내용을 html로 컴파일 해야 한다.
        let html = pug.render(
           data, 
           {
              title: "동적값 전달",
              url: "http://www.naver.com",
              arr: [1, 2, 3]
           }
         );
        console.log(html);
        response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
        response.end(html);
    });
    */
})
.listen(port, function () {
    console.log(port + "번 구동중");
});
