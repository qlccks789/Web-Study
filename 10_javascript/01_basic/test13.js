/*
    자바스크립트 변수 - 12(ES6 추가)

    let
    - 중복선언이 불가능

    const
    - 상수로 사용(값을 할당하면 값을 변경할 수 없다.)
    - 선언시에 값을 할당해야 한다.
    - 블록({}) 범위가 적용된다.
    - 호이스팅 대상에서 제외
    
    * let와의 차이점 : 값의 변경 부분을 제외하면 기능적으로 동일
*/
var msg = 1;
var msg = 2;
console.log(msg); // 2

let msg2 = 3;
// let msg2 = 4;  // SyntaxError: Identifier 'msg2' has already been declared
console.log(msg2);

const msg3 = "상수";
// msg3 = "변경";  // TypeError: Assignment to constant variable.
console.log(msg3);

/*
const msg4;  // SyntaxError: Missing initializer in const declaration
console.log(msg4);
*/
