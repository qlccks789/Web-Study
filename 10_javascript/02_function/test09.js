// 함수에서의 호이스팅
"use strict";

function fn() {
    var i = 100;
    if (i % 2 == 0) {
        var msg = "짝수";
    }
    console.log(msg);  // 짝수

    console.log(`k = ${k}`);
    for (var k = 0; k < 3; k++) {
        // console.log(i + "는 " + msg + "입니다.");
        console.log(`${i}는 ${msg}입니다.`);
    }

    /*
    var i;
    var msg;

    i = 100;
    if (i % 2 == 0) {
        msg = "짝수";
    }
    console.log(msg);
    */
}
fn();