/*
    자바스크립트 문자열 - 2

    - 문자열과 숫자 타입의 + 연산의 결과는 문자열
    - 문자열과 숫자 타입의 + 연산 이외의 결과는 숫자
*/
"use strict"

console.log(1 + "20");    // "120"
console.log("1" + "20");  // "120"
console.log("1" + 20);    // "120"
console.log("100" - 20);  // 80
console.log("100" * 20);  // 2000