/*
    객체 이해하기 - 3

    객체를 변수에 저장하게 되면 변수에 객체의 주소가 저장됨..
*/
"use strict";

var member1 = {id: "hong", email: "hong@a.com"};

var member2 = member1;

member2.id = "king";

console.log(member1);
console.log(member2);

// 객체의 정보를 확인하기 : for ~ in 반복문
console.log("-------------------");
for (let key in member1) {
    console.log(key, member1[key]);
}

// 객체는 값으로 모든 타입을 다 사용할 수 있다.
var obj = {
    name: "홍길동",
    age: 33,
    hobby: ["훔치기", "때리기", "담넘어다니기"],
    info: function () {
        return "홍길동은 대단한 사람이다.";
    }
};







