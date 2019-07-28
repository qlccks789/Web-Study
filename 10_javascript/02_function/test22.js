"use strict";

const actor = [
    "김연아", "조진웅", "구공탄", "김유정", "박보검",
    "김태희", "박보영", "손예진", "이제훈", "박서준"
];

var count = 10;
var id = setInterval(() => {
    if (count == 0 ) {
        var no = parseInt(Math.random() * actor.length);
        console.log(actor[no]);
        clearInterval(id);
        return;
    }
    console.log(count--);
}, 1000);















