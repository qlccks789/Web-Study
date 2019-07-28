/*
function MyMap() {  
    this.put = function (key, value) {

    };    
}
*/

function MyMap() {  
    this.count = 0;
    this.data = {};
}
MyMap.prototype = {
    put(key, value) {
        this.count++;
        this.data[key] = value;
    },
    size() {
        return this.count;
    },
    get(key) {
        return this.data[key];
    },
    del(key) {
        delete this.data[key];
        this.count--;
    },
    clear() {
        this.count = 0;
        this.data = {};
    } 
};
var mData = new MyMap();
mData.put("id", "sss");
mData.put("name", "홍길동");
console.log(mData.size());  // 2
console.log(mData.get("id"));  // sss
mData.del("id");
console.log(mData.get("id"));  // undefined
mData.clear();
console.log(mData.size());  // 0


/*
MyMap.prototype = {
    put: function (key, value) {

    },
    size: function () {

    } 
};
*/
/*
MyMap.prototype.put = function (key, value) {

};
MyMap.prototype.size = function () {

};
*/



