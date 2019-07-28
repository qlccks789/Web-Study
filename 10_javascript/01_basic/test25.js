// undefined, null, NaN
"use strict"

// undefined : 값을 직접 비교, 변수를 undefined로 만들수 있음
var msg1;
if (msg1 == undefined) console.log("변수는 존재, 값은 없음");

var msg2 = 20;
msg2 = undefined;  // 변수에 직접 undefined 상태를 만들수 있다.

var msg3 = null;  // 객체가 주소를 가리키지 않는것을 나타낸다.
if (msg3 == null) console.log("null은 직접 비교 가능함");

var msg4 = 10 - "a";
console.log("msg4", msg4, typeof (msg4));

// NaN은 직접 비교를 할 수 없다.
if (msg4 == NaN) console.log("msg4 == NaN 임");

// NaN의 값을 비교하기 위해서는 isNaN(값)를 이용한다.
if (isNaN(msg4)) console.log("msg4는 NaN 입니다.");


    