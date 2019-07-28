// 매개변수에 객체타입을 넘기는 경우에는 원본 데이터에 영향이 발생한다.
"use strict";

var arr = [10, 20, 30, 40];

function fn(arr) {
    arr.push(50);
}
fn(arr);

console.log(arr);