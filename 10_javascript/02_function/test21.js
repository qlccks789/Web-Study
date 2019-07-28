/*
    - 특정한 시간뒤에 함수를 실행시킨다.

    // 한번만 수행
    var id = setTimeout(콜백함수, 밀리세컨드);
    clearTimeout(id);
    
    // 지정된 시간마다 지속적으로 수행
    var id = setInterval(콜백함수, 밀리세컨드);
    clearInterval(id);


*/

function fn1() {
    // 현재 날짜 정보 가져오기
    var date = new Date();
    // 날짜 객체에서 시간 정보 가져오기
    var time = date.toLocaleTimeString();
    console.log(time);
    // setTimeout(fn1, 1000);
}
fn1();

var id = setInterval(fn1, 1000);
setTimeout(function () { clearInterval(id); }, 10000);