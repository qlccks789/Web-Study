// querystring : 문자열이 파라미터 형태일때 파싱처리
const qs = require("querystring");
let data = "id=test&pass=1234";
let param = qs.parse(data);
console.log(param);
console.log(param.id);
console.log(param.pass);
