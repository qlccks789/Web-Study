/*
    선언적 함수와 익명 함수 - 1

    선언적 함수 

    - 함수의 이름이 존재하는 것
    - 컴파일 시점에 함수 정보를 등록(함수의 호이스팅)
    - 함수를 선언하기 이전에 사용이 가능
    - 함수가 별도의 return문을 사용하지 않은 경우 디폴트로 undefined가 
      반환
*/
"use strict";

function fn1(num1, num2) {
    return num1 + num2;
}

let fn1Result = fn1(100, 200);
console.log("fn1 :", fn1Result);


// 함수의 선언 전에 호출이 가능함...
let fn2Result = fn2(100, 200);
console.log("fn2 :", fn2Result);

function fn2(num1, num2) {
    return num1 + num2;
}

function fn3() {}
// 함수의 return 이 없는 경우 디폴트 반환결과 : undefined
console.log(fn3());

/*
function fn1(num1, num2) {
    return num1 + num2;
}
function fn2(num1, num2) {
    return num1 + num2;
}
function fn3() {}

let fn1Result = fn1(100, 200);
console.log("fn1 :", fn1Result);

let fn2Result = fn2(100, 200);
console.log("fn2 :", fn2Result);

console.log(fn3());

*/


