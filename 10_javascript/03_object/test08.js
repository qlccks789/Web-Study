"use strict";

function Member(id, name, email) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.info = function () {
        console.log(this.id, this.name, this.email);
    };
}

var m1 = new Member("hong", "홍길동", "hong@a.com");
var m2 = new Member("park", "박카스", "park@a.com");

m1.info();
m2.info();