/*
    자바스크립트 변수 - 9

    동적변수를 지원하기 때문에 하나의 변수에 다양한 타입의 값을 
    대입 할 수 있다.
*/
"use strict"
var val = 10;
console.log(val, typeof (val));   // 10 number

val = 10.3;
console.log(val, typeof (val));   // 10.3 number

val = "hello~";
console.log(val, typeof (val));   // hello~ string

val = true;
console.log(val, typeof (val));   // true boolean
