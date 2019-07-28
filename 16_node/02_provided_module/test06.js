// fs : 파일을 읽거나 쓰거나 할 때 사용함..
// Sync 가 함수이름에 붙은 경우 : 동기적처리
const fs = require("fs");

fs.readFile("test.txt", "utf-8", function (err, data) {
    if (err) {
        console.log("읽기 중 에러발생");
        console.log(err);
        return;
    }
    console.log("비동기 읽은 데이터");
    console.log(data);
});
console.log("비동기 읽기 호출 후...");

try {
    let result = fs.readFileSync("test.txt", "utf-8");
    console.log("동기 파일 읽기 호출 후");
    console.log(result);
} catch (e) {
    console.log("동기 읽기 중 에러 발생");
    console.log(e);
}