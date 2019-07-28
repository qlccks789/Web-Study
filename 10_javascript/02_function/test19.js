/*
    ES6 추가된 Arrow Function(화살표 함수)

    - 함수를 심플하게 정의할 수 있게 한다.
    - 형태
      (매개변수) => { 명령어, ... }
      
    - 순서
      1. function 키워드를 삭제
      2. () 안에 파라미터 이름을 넣는다.
      3. => 키워드를 소괄호 다음에 입력한다.  
      4. {}을 작성하고 블럭안에 실행될 코드를 넣는다.
*/
"use strict";

var fn1 = function () {
    console.log("fn 호출");
}; 
fn1();

fn1 = () => { console.log("화살표 fn1 호출"); };
fn1();

var fn2 = function (num) {
    console.log("fn2", num);
};
fn2();

fn2 = (num) => { console.log("화살표 fn2", num); };
fn2();

// 파라미터가 하나일 경우 소괄호를 뺄수 있음..
fn2 = num => { console.log("화살표 fn2", num); };
fn2();

var fn3 = function (num1, num2) {
    console.log("fn3", num1, num2);
};

fn3 = (num1, num2) => {
    console.log("fn3", num1, num2);
};

fn3();










