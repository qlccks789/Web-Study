// 화살표함수를 실행문장 중심으로 살펴보기
"use strict";

var fn1 = function (num) {
    return num * num;
};
console.log(fn1(10));

fn1 = (num) => { return num * num; };
console.log(fn1(10));

// return을 {} 과 같이 생략할 수 있음.
fn1 = (num) => num * num;
console.log(fn1(10));

fn1 = (num) => console.log(num * num);
console.log(fn1(10));

var fn2 = (num) => {
    console.log(num);
    return num * num;
};
console.log(fn2(10));

var fn3 = function (num) {
    return function () {
        console.log("^^");
    };
};

fn3 = (num) => {
    return () => { console.log("^^"); };
};

fn3 = num => () => console.log("^^");

// 객체를 넘기고 싶다면...
var fn4 = () => { return {"id": "hong"}; };

var fn5 = () => ({"id": "hong"}); 