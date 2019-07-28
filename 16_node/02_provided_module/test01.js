// 글로벌 객체
console.log("__dirname" + __dirname);
console.log("__filename" + __filename);

let msg = "Hello Node JS";
let member = {"name": "홍길동", "age": 22};

console.log("메세지 : %s", msg);
// %j : json 객체
console.log("회원 : %j", member);
// %d
console.log("나이 : %d", member.age);

// 시간측정 : time(구분이름) - 시작, timeEnd(구분이름) - 종료
console.time("time");
let sum = 0;
for (let i = 0; i < 10000000; i++) {
    sum += i;
}
console.log("합계 : %d", sum);
console.timeEnd("time");