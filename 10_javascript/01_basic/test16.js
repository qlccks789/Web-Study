/*
    자바스크립트 문자열 - 3
    - 여러줄 입력 처리방식..
*/
"use strict"

var msg = "저의 " +
"이름은 " +
"김연아 입니다.";
console.log(msg);

msg = "저의 \
이름은 \
김연아 입니다.";
console.log(msg);

// 템플릿 리터럴
msg = `저의 
이름은 
김연아 입니다.`;
console.log(msg);

let name = "김연아";
let age = 30;
msg = "저의 이름은 " + name + " 입니다.";
console.log(msg);

msg = `저의 이름은 ${name}이고 나이는 ${age} 입니다.`;
console.log(msg);

