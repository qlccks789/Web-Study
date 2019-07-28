/*
    require 에 찾는 파일의 확장자가 없는 경우

    만약, .js 파일이 없는 경우에는 
    1. 이름에 해당하는 디렉토리를 찾고 
    2. 디렉토리 하위에서 index.js 파일을 찾는다.
*/
/*
const cal = require("./test04_module");
console.log("add : " + cal.add(1, 2));
console.log("sub : " + cal.sub(1, 2));
*/

const {add, sub} = require("./test04_module");
console.log("add : " + add(1, 2));
console.log("sub : " + sub(1, 2));
