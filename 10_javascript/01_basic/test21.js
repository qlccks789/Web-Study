"use strict"

let arr = [10, 20, 30, 40, 50];

for (let i = 0; i < arr.length; i++) {
    console.log(i, arr[i]);
}

// forEach 반복
console.log("======================");
console.log("forEach 반복문");
arr.forEach(function (val, index, array) {
    console.log(val, index, array);
    // if (val > 30) break;
});

// ES6 : for ~ of : value값을 가져오기 위한 반복문
console.log("======================");
console.log("for~of 반복문");
for (let val of arr) {
    console.log(val);

    if (val > 30) break;
}
