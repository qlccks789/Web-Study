/*
    함수의 매개변수 처리하기

    - 함수내에는 arguments 객체가 자체적으로 생성되서 제공됨
    - 유사배열객체 : length 프로퍼티를 가지고 있는 객체
*/

function fn() {
    console.log("=========================");
    console.log(arguments.length);
    for (let i = 0; i < arguments.length; i++) {
        console.log(arguments[i]);
    }
}



fn(1);
fn(1, 10, 100);

// 화살표 함수에서 arguments 사용 불가능
// rest 연산자(ES6 제공) 
// : 함수의 매개변수 선언시 ...이름 형태로 사용
// : 배열 형태로 데이터를 관리한다.
var fn2 = (...arg) => {
    for (let i = 0; i < arg.length; i++) {
        console.log(arg[i]);
    }
};
fn2(1);
fn2(1, 10, 100);

