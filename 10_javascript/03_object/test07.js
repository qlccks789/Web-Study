/*
    생성자란??

    - 일반 함수와 동일하게 선언한다.
    - 생성자 함수를 사용할 때 "new"와 함께 사용해야 한다.
    - new 와 함께 사용하면 생성자 함수를 실행 후 객체를 만들어서 넘겨준다.
    - 함수 이름을 대문자로 사용하는 것을 권장한다.
    - 생성자 함수 안에서의 this는 생성된 객체를 나타낸다.
*/
"use strict";

// 생성자 역활의 함수 정의
function Member() {
    console.log(this);
    this.id = "hong";
    this.name = "홍길동";
    this.setId = function (id) {
        this.id = id;
    };
}
// var m1 = Member();
var m2 = new Member();

// console.log(m1);
console.log(m2);














