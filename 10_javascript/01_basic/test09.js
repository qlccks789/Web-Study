/*
    자바스크립트 변수 - 8

    변수의 자료형 검사

    typeof 데이터   -> 데이터타입을 문자열로 반환
    typeof (데이터)

    - 오래된 버그??
    null 데이터 타입은 "null" 이 아닌 "object" 반환
*/
"use strict"
console.log(typeof ("test"));  // string
console.log(typeof (10));      // number
console.log(typeof (true));    // boolean
console.log(typeof (null));    // null(X), object
console.log(typeof (a));       // undefined
console.log(typeof ({}));      // object
// function : 기능을 가진 객체
console.log(typeof (function () {}));  // function





