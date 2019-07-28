// test.txt 파일의 내용을 읽어서 testcopy.txt 에 저장
// 비동기 방식으로 코딩
const fs = require("fs");

fs.readFile("test.txt", "utf-8", function (err, data) {
    if (err) {
        console.log("파일 읽기 중 에러");
        console.log(err);
        return;
    }
    fs.writeFile("testcopy.txt", data, "utf-8", function (err) {
        if (err) {
            console.log("파일 쓰기 중 에러");
            console.log(err);
            return;
        }
        console.log("파일 복사 성공"); 
    });
});