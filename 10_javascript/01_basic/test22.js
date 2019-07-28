/*
    자바스크립트 배열 - 1

    - 한번에 여러개의 메모리를 준비
    - 배열 생성 : [] 또는 Array() 활용
*/
"use strict"
let arr1 = [];
let arr2 = new Array();

console.log("arr1.length", arr1.length);
console.log("arr2.length", arr2.length);
console.log(arr1[0], arr2[0]);  // undefined, undefined

/*
배열의 크기는 동적으로 변경된다.
크기가 지정되어 있지 않은 경우에도 데이터의 입력 가능
배열의 길이는 가장 큰 인덱스 + 1 한 값이다.
*/
arr1[0] = 10;
arr1[2] = 20;
// 10 undefined, 20
console.log(arr1[0], arr1[1], arr1[2]);
console.log(arr1.length);  // 3

/*
    배열은 여러가지 타입을 하나의 배열에 입력할 수 있다.
*/
arr1[3] = "abcd";
arr1[4] = {};
arr1[5] = [1, 2, 3];
arr1[6] = true;
arr1[7] = function () {};
console.log(arr1.length);  // 8

arr1["msg"] = "hello"; 
console.log(arr1.length);  // 8

arr1["99"] = "마지막";
console.log(arr1.length);  // 100
















