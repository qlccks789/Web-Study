"use strict"

var arr = [10, 20, 30];

// 배열에 데이터를 마지막에 추가
arr[arr.length] = 40;
arr.push(50);
console.log("arr", arr);

var arr2 = arr;
console.log("arr2", arr2);

arr2.push(100);
console.log("arr", arr);
console.log("arr2", arr2);


// 배열 데이터를 삭제
// splice(삭제할 인덱스, 삭제할 개수)
arr2.splice(1, 1);
console.log("arr", arr);
console.log("arr2", arr2);

