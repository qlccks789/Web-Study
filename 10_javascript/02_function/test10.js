/*
    내부함수

    - 함수안에 선언된 함수
    - 선언된 외부함수안에서만 호출이 가능
*/
"use strict";

function outerFn() {
    console.log("outerFn");

    function innerFn() {
        console.log("innerFn");
    }
    innerFn();
}
outerFn();
// innerFn(); (X)







