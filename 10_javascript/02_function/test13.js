/*
    콜백함수 이해하기 - 3

    - 함수를 리턴하기
*/
function fn() {
    /*
    function cb() {
        return "hello~ callback";
    }
    return cb;
    */
    return function () {
        console.log("hello~ callback");
    };
}
var result = fn();
console.log(result());