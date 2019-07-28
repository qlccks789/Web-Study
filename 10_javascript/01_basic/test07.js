// 호이스팅 이해 퀴즈
"use strict"
console.log(id);

var id = "테스트";
console.log(id);

/*
    undefined
    테스트

    호이스팅 과정

    1. 컴파일
    var id;

    2. 실행
    console.log(id);
    id = "테스트";
    console.log(id);
*/