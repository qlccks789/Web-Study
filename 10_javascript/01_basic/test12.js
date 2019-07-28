/*
    자바스크립트 변수 - 11(ES6 추가)

    let
    - 선언된 블럭에서만 사용 가능
    - 호이스팅 대상에서 제외
*/
"use strict"
var msg = 1;
if (msg == 1) {
    let msg = 2;
    console.log(msg);
}
console.log(msg);

{
    let msg2 = 3;
}

// ReferenceError: msg2 is not defined
console.log(msg2);