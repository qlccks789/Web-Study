/*
    글로벌 변수와 로컬 변수

    - 글로벌 변수 : 함수밖에 선언, 전체 영역에서 사용이 가능
    - 로컬 변수 : 함수안에 선언, 함수 내에서만 사용이 가능
                함수 호출이 종료되면 자동 제거된다.
*/
"use strict";

var msg = "글로벌 변수";
var msg2 = "글로벌2";
console.log("msg :", msg);

function fn() {
    var localMsg = "로컬변수";
    var msg2 = "로컬2";
    console.log("localMsg :", localMsg);
}
fn();

// ReferenceError: localMsg is not defined
// console.log("localMsg :", localMsg);
console.log("fn 함수 호출 후 msg2 :", msg2);













