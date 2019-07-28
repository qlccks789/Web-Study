/*
    if, switch, for 
*/
let no = 3;
if (no == 3) {
    console.log("no == 3");
} else {
    console.log("no != 3");
}

let msg = "";
switch (no) {
    case 1: msg = "1입니다."; break;
    case 2: msg = "2입니다."; break;
    case 3: msg = "3입니다."; break;
    default: msg = "1 ~ 3 사이의 수가 아닙니다.";
}
console.log("msg =", msg);

for (let i = 1; i <= 10; i++) {
    console.log("i =", i);
}