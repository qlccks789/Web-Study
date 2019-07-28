// url 모듈 사용
// url : url 정보를 분석
const url = require("url");
let urlObj = url.parse(
    "http://localhost:8000/list.do?id=aaa&name=홍길동", true
);
console.dir(urlObj);
console.dir(urlObj.pathname); // /list.do
console.dir(urlObj.query);  // id=aaa&name=홍길동
console.dir(urlObj.query.id);  
console.dir(urlObj.query.name);  
