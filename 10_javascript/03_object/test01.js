/*
    객체 이해하기 - 1
    : 객체는 문자열로 이름을 붙인 값들의 집합이다.
*/
"use strict";

// 빈 객체 생성하기
let member = {};

// 객체에 저장하는 값을 프로퍼티라고 한다.
// 문자열을 사용해서 값을 저장한다.
// 객체이름.프로퍼티명 = 값
// 객체이름["프로퍼티명"] = 값
member.id = "hong";
member["email"] = "hong@hong.com";

console.log(member);

// 객체의 프로퍼티 확인
// 객체.프로퍼티명
// 객체["프로퍼티명"]
console.log(member.id, member["email"]);

// 회원 객체에 home-page 정보를 설정한다.(myhome.a.com)
// member.home-page = "myhome.a.com";
member["home-page"] = "myhome.a.com";

// console.log(member.home-page);
console.log(member["home-page"]);




















