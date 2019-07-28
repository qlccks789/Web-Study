// 함수에 매개변수의 타입이 기본 타입인 경우 원본 데이터에 영향을 주지 않는다.
"use strict";

var i = 100;

function fn(i) {
    i = i + 100;
    console.log("i :", i);
}
fn(i);  // fn(100)

console.log("i :", i);