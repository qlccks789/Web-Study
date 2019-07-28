/*
    객체 이해하기 - 4

    일반적으로 함수내에서의 this는 함수를 호출한 객체이다..
*/
var m1 = {name: "김연아"};
var m2 = {name: "아사다마오"};

function play() {
    console.log(this);
    console.log(this.name + "님이 등장하십니다.");
}

m1.play = play;
m2.play = play;

play();
m1.play();
m2.play();