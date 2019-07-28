/*
    자바스크립트 변수 - 10

    변수의 범위

    var로 선언된 변수는 글로벌 변수(전역 변수)
    블록의 제한을 받지 않는다.
*/
"use strict"
var msg = 1;
if (msg == 1) {
    var msg = 2;
    console.log(msg);  // 2
}

console.log(msg);  // 2

{
    var msg2 = 3;
}
console.log(msg2);  // 3

for (var i = 1; i < 10; i++) {
    console.log(i);
}

console.log(i);

/*
컴파일
var msg;
var msg2;

실행
msg = 1;
if (msg == 1) {
    msg = 2;
    console.log(msg);
}
console.log(msg);
{
    msg2 = 3;
}
console.log(msg2);



*/












