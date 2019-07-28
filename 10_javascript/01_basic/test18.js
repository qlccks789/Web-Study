/*
    자바스크립트 - 형변환  
*/
"use strict"

console.log(true, Number(true));    // 명시적형변환
console.log(false, Number(false));  

console.log(true + 1);  // 2   -  묵시적(암묵적) 형변환
console.log(true + false);  // 1

// 문자열을 숫자로 변환
console.log("", Number(""));  // 0
console.log("12", Number("12"));  // 12
console.log("hello", Number("hello"));  // NaN
console.log("123만원", Number("123만원"));  // NaN
console.log("$123", parseInt("$123"));  // NaN


console.log("", parseInt(""));  // NaN
console.log("12", parseInt("12"));  // 12
console.log("hello", parseInt("hello"));  // NaN
console.log("123만원", parseInt("123만원"));  // 123
console.log("$123", parseInt("$123"));  // NaN















