"use strict";

/*
    class Member {
        String id = "hong";
        String name = "홍길동";
        public void setId(String id) {
            this.id = id;
        }
    }
    Member m1 = new Member();
*/
var member = {
    id: "hong",
    name: "홍길동",
    setId: function (id) {
        this.id = id;
    },
    getId: function () {
        return this.id;   
    }
};
console.log(member.getId());
member.setId("kim");
console.log(member.getId());