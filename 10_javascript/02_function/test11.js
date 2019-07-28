/*
    콜백함수 이해하기 - 1

    - 함수도 데이터 타입의 일종이다.
    - 따라서 값처럼 주고 받을 수 있다.
*/
function fn() {
    console.log("fn 호출");
}
fn();

var fn2 = fn();  // undefined

var fn3 = fn;    // fn이 가리키는 함수의 주소를 같이 참조

fn3();