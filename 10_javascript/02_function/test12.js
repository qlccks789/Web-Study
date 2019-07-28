/*
    콜백함수 이해하기 - 2

    - 매개변수(파라미터)에 함수 넘기기
*/
function fn(callback) {
    console.log ( typeof (callback) );  // function
    callback();
}

function myFn() {
    console.log("myFn 함수 호출되었음..");
}

// fn( myFn() );
fn( myFn );

// 익명함수로 값 넘기기

var fn2 = function () { 
    console.log("익명함수 넘김..");  
};
fn( fn2 );

fn(function () { 
    console.log("익명함수 넘김..");  
});