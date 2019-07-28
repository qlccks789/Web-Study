/*
    클로저

    - 함수내의 지역변수를 함수 외부에서 사용할 수 있게 하는 기술
    - 생명주기가 종료된 함수의 변수를 참조하는 기술
*/
function outer(val) {
    var msg = "당신의 메세지 : " + val;
    return function () { return msg; };
}

var fn = outer("하이~");
console.log(fn);
console.log(fn());
console.log(fn());