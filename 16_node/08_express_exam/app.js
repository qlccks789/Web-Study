var express = require("express");
var pug = require("pug");
var app = express();
var bodyParser = require("body-parser");

app.use(bodyParser.json());  // json 데이터 처리
app.use(bodyParser.urlencoded({extended:true}));

// 라우터 등록하기
app.use('/', require('./routes/index'));
app.use('/board', require('./routes/board'));

// 뷰페이지 설정으로 pug 설정
app.set('views', './views');  // view 루트 디렉토리
app.set('view engine', 'pug');

// 모든 미들웨어가 동작하지 않았다면...
app.use(function (req, res, next) {
	// res.status(404).send(pug.renderFile("view/error/error404.pug"));	
	res.status(404);
	res.render("error/error404");	
});

app.use(function (err, req, res, next) {
	console.log("에러 처리 미들웨어 실행...")
	console.log(err);
	res.status(500).send("서버 오류 발생");
});

app.listen(3000, function (err) {
	console.log("localhost:3000 번으로 서버 구동중");
});
