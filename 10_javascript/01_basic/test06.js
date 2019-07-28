/*
    자바스크립트 변수 - 6

    변수의 호이스팅(hoisting)
    - 자바스크립트 엔진이 스크립트를 해석하는 단계
      : 컴파일 이후 실행
      : 컴파일 시에 변수에 대한 정보를 먼저 설정한다.
*/
"use strict"

var id = "hong";
console.log(id);  // hong

var id = "kim";
console.log(id);  // kim

var name;
console.log(name);  // undefined

/* 실행 단계 생각해 보기(호이스팅)

   1. 컴파일
      var id;   
      var name;

   2. 실행
      id = "hong";
      console.log(id);
      id = "kim";
      console.log(id);
      console.log(name);
      
*/