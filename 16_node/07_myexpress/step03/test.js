// 서버가 시작되었습니다.
const app = require("./express")();
app.listen(3000, function () {
    console.log("서버가 시작되었습니다.");
});