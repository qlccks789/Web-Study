/*
    자바스크립트 변수 - 4
    - 변수의 중복 선언이 가능
    - 이전에 선언한 변수를 덮어쓴다.
*/
"use strict"
var id = "hong";
console.log("id = ", id);

// 중복 선언
var id = "kim";
console.log("id = ", id);

/*
    자바스크립트 변수 - 5
    변수에 값이 없는 경우 : undefined
*/
var name;
console.log(name);  // undefined