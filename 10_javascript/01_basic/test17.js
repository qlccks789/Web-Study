/*
    자바스크립트의 false를 나타내는 데이터

    - undefined, null, 0, '', NaN(Not a Number)
*/
"use strict"

console.log("0", 0);
console.log("!0", !0);
console.log("!!0", !!0);
console.log("!!''", !!'');
console.log("!!null", !!null);
console.log("!!undefined", !!undefined);
console.log("!!NaN", !!NaN);
console.log("!!abc", !!"abc");

let id;
// let id = "lee";
// id에 값이 없는 경우 설정
// if (!id) {
if (id == undefined) {
    id = "kim";
}
console.log("id = ", id);

// 데이터의 논리형 값을 출력할 때 : !!, Boolean
console.log("!!0", !!0);
console.log("Boolean(0)", Boolean(0));
console.log("Boolean('')", Boolean(""));
console.log("Boolean('abc')", Boolean("abc"));
