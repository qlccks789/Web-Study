/*
    ES6 - 파라미터 디폴트 설정하기

    파라미터에 값이 안 온 경우 초기값을 설정한다.
*/
function fn1(num1, num2) {
    if (!num1) num1 = 0;
    num2 = num2 || 0;

    console.log(num1 + num2);
}

fn1();
fn1(100);
fn1(100, 200);

function fn2(num1 = 0, num2 = 0) {
    console.log(num1 + num2);
}

fn2();
fn2(100);
fn2(100, 200);