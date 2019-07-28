/*
    객체 이해하기 - 2

    객체를 생성시에 초기화하고 프로퍼티를 삭제
*/
var member = {};
var member2 = new Object();

var member3 = {"id": "hong", email: "hong@a.com"};

member3.name = "홍길동";
console.log(member3);

// 프로퍼티 삭제 : delete 객체.프로퍼티명
delete member3.email;
console.log(member3);

// 객체 자체는 삭제 불가능
delete member3;
console.log(member3);

// JSON : 자바스크립트 객체임... 단, 프로퍼티명에 "" 를 붙여야 한다.
var member4 = {"id": "hong", "name": "홍길동"};