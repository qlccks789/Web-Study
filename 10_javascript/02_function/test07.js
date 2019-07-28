"use strict";

function sum(arr, start, end) {
    if (!arr) return 0;
    start = start || 0;
    end = end || arr.length;

    let result = 0;
    for (let i = start; i < end; i++) {
        if (typeof (arr[i]) != 'number') continue;
        result += arr[i];
    }
    return result;
}

let arr = [1, 2, '홍', 4, 5];
console.log( sum(arr, 0, arr.length) );  // 12
console.log( sum(arr, 0, 4) );           // 7
console.log( sum(arr, 0) );              // 12
console.log( sum(arr, 2) );              // 9
console.log( sum(arr) );                 // 12
console.log( sum() );                    // 0