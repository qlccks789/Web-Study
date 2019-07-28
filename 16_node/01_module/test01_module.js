/*
    모듈 만들기
    - 재활용 가능한 기능이나 객체를 별도의 파일로 관리
    - 자바에서는 API 를 생각하자..

    - 사용하려는 파일에서는 모듈을 부를때는 "require 함수를 이용"

    사용자 정의 모듈 만들기
    1. 종류 : 일반 값, 함수, 객체...
    2. exports 객체의 속성이나 메서드로 정의
*/
function add(i, j) {
    return i + j;
}
function sub(i, j) {
    return i - j;
}
module.exports.add = add;
module.exports.sub = sub;