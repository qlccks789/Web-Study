// 여러개의 객체 관리하자..
"use strict";

/*
var m1 = {name: "김연아", age: 29, gender: "여자"};
var m2 = {name: "심권호", age: 33, gender: "남자"};
var m3 = {name: "김동성", age: 37, gender: "남자"};
var m4 = {name: "이상화", age: 30, gender: "여자"};
*/

function createMember(name, age, gender) {
    return {name: name, age: age, gender: gender};
}

var m1 = createMember("김연아", 29, "여자");
var m2 = createMember("심권호", 33, "남자");
var m3 = createMember("김동성", 37, "남자");
var m4 = createMember("이상화", 30, "여자");