/*
이벤트를 연결 할 수 있는 모든 객체는 EventEmitter 객체를 상속을 받아야 한다.
사용자가 이벤트를 정의하고 처리하려면 EventEmitter를 상속 받아야 한다.

on   : 이벤트 설정
emit : 이벤트 호출
*/
const EventEmitter = require("events").EventEmitter;
const util = require("util");

// 이벤트를 설정할 객체
let Member = function () {};

// 이벤트를 설정하려면 Member 객체가 EventEmitter를 상속해야 한다.
util.inherits(Member, EventEmitter);

Member.prototype.join = function () {
    console.log("join 함수 호출");
    // this.emit("myjoin");
};
Member.prototype.list = function () {
    this.emit("mylist", 10);
};

// 이벤트를 설정할 객체 생성
let m = new Member();

// 이벤트 설정
m.on("myjoin", function () {
    console.log("myjoin 이벤트 호출됨..");
});

m.join();

m.on("mylist", function (pageNo) {
    console.log("mylist 이벤트 호출됨");
    console.log(pageNo + " 페이지 요청함");
});

m.list();












