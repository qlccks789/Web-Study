/*
    함수의 호이스팅과 오버로딩

    - 함수의 오버로딩 지원하지 않는다.

    함수의 매개변수 개수에 상관없이 호출이 가능(이름기준)
*/
"use strict";

var fn = function () {
    console.log(1);
};
fn();

function fn() {
    console.log(2);
}
fn();

function fn(num1, num2, num3) {
    console.log(3);
}
fn(1, 2, 3);


function fn2(num) {
    console.log(num);
}
fn2();
fn2(100);
fn2(100, 200);



/*
function fn(num1, num2, num3) {
    console.log(3);
}

fn = function () {
    console.log(1);
};
fn();
fn();
fn(1, 2, 3);
*/