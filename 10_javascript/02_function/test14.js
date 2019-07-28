let arr = [17, 2, 37, 4, 15];
let sum = 0;
for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
}
console.log("sum :", sum);

for (let i = 0; i < arr.length; i++) {
    if (arr[i] > 10) {
        console.log(`10보다 큰 수 : ${i} 번째, ${arr[i]}`);
    }
}

function forEach(arr, cb) {
    for (let i = 0; i < arr.length; i++) {
        cb(arr[i], i);
    }
}

sum = 0;
forEach(arr, function (val) {
    sum += val;
    // 배열의 위치와 값
    // console.log("호출됨...", val, index);
});
console.log("sum :", sum);

forEach(arr, function (val, index) {
    if (val > 10) {
        console.log(index, val);
    }
});