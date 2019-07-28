// 호이스팅 퀴즈..
"use strict";
function foo() {
    console.log(1);
}
foo();
var foo = function () {
    console.log(2);
};
foo();
function foo() {
    console.log(3);
}
/*
function foo() {
    console.log(3);
}  
foo();
foo = function () {
    console.log(2);
};
foo();
*/