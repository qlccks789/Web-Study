/*
    prompt-sync 모듈 다운로드 후 사용하기

    npm 명령어를 이용한 다운로드(Node 설치시 같이 설치됨)

    npmjs.com 사이트에 들어가서 정보 살펴보기
    npm install prompt-sync
*/
"use strict";

var prompt = require('prompt-sync')();

var n = prompt('How many more times? ');

console.log("n =", n);