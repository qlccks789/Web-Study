"use strict";

var scope = "전역";

function fn() {
    console.log(scope);
    var scope = "지역";
    function inner() {
        console.log(scope);
    }
    inner();
}
fn();