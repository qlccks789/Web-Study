// 내장 모듈(path) 
// path : 경로에 대한 다양한 처리
const path = require("path");

console.log(path.join("c:/test", "/aa/bb", "/index.js"));
console.log(path.join("c:/test/", "/aa/bb", "index.js"));

let fileName = "c:/test/aa/bb/index.js";
// 디렉토리 경로 : c:/test/aa/bb
console.log("디렉토리 : " + path.dirname(fileName));

// 확장자 : .js
console.log("확장자 : " + path.extname(fileName));

// 파일명 : index.js
console.log("확장자 : " + path.basename(fileName));

// 파일명(확장자 제외) : index
console.log("파일명(확장자 제외) : " + path.basename(fileName, ".js"));
console.log("파일명(확장자 제외) : " + path.basename(fileName, path.extname(fileName)));