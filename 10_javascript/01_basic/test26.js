/*
    자바스크립트 예외처리
*/
"use strict"
function isMan(juminNo) {

    if (juminNo.length != 13) {
        throw new Error("주민번호는 13자리 입니다.");
    }

    return juminNo.charAt(6) == 1 || juminNo.charAt(6) == 3;
}

try {
    let result = isMan("1234561");
    console.log(result ? "남자" : "여자");
} catch (e) {
    console.log("예외발생함");
    console.log(e);
}

console.log("실행 종료됨..");