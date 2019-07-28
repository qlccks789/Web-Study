/*
    함수 : 자바의 메서드, 기능(명령어들을 묶은것)
    
    function [함수명] ([매개변수, ...]) {
        명령어.
        명령어.
        ...
        [return 반환값;]
    }
*/
"use strict";
// 4가지의 형태
// 1. 파라미터와 반환값이 모두 없는 경우
function fn1() {
   console.log("1번"); 
}
fn1();

// 2. 파라미터는 없고 반환값이 있는 경우
function fn2() {
    console.log("2번");
    return "fn2 함수";
}
let fn2Result = fn2();
console.log(fn2Result);

// 3. 파라미터가 있고 반환값이 없는 경우
function fn3(val) {
    console.log("3번", val);
}
fn3(100);

// 4. 파라미터와 반환값 모두 있는 경우
function fn4(val) {
    console.log("4번");
    return val * val;
}
console.log(fn4(100));









