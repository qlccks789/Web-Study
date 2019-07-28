module.exports = function () {
    return {
        get() {
            console.log("get 호출");
        },
        post() {
            console.log("post 호출");
        }
    };
};