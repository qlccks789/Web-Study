const fs = require("fs");
let msg = "테스트 입니다.";

fs.writeFile("text1.txt", msg, "utf-8", function (err) {
    if (err) {
        console.log("비동기 파일 쓰기 에러발생");
        console.log(err);
        return;
    }
    console.log("비동기 파일 쓰기 성공");
});

try {
    fs.writeFileSync("text1_sync.txt", msg, "utf-8");
    console.log("동기 파일 쓰기 성공");
} catch (e) {
    console.log("동기 파일 쓰기중 에러 발생");
    console.log(e);
}