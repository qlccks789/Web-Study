// 외부 모듈 사용하기
// npmjs.com 가서 사용할 모듈 검색한다.(request)
// 검색된 모듈 선택하면 npm 설치 방법이 나옴..
const request = require("request");
request("http://www.naver.com", function (err, response, body) {
    if (err) {
        console.log("요청시 에러 발생함");
        return;
    }
    if (response.statusCode !== 200) {
        console.log("서버 처리중 에러 발생함");
        return;
    }

    // 읽은 데이터
    console.log(body);
});