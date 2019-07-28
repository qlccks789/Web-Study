var express = require('express');
var router = express.Router();

var mysql = require("mysql");
var db = require("../util/db_info");
var con = db.getConnection();

router.get('/list.do', (req, res, next) => {
	var sql = "select no, title, writer " +
			  "  from tb_board         " +
			  " order by no desc        ";
	con.query(sql, function (err, rows, fields) {
		// 에러가 존재할 경우 
		if (err) {
			next(err);
			return;
		}
		res.render("board/list", {rows: rows});
	});
});

router.post('/write.do', (req, res, next) => {
	var param = req.body;
	var sql = "insert into tb_board(writer, title, content) values(?, ?, ?) ";
	con.query(
		sql, 
		[param.writer, param.title, param.content], 
		function (err, result) {
			if (err) {
				next(err);
				return;
			}
			res.redirect("list.do");
		}
	);
});

router.get('/writeForm.do', (req, res) => {
	res.render("board/writeForm");	
});

router.get('/updateform.do', (req, res, next) => {
	con.query(
		"select * from tb_board where no = ? ", 
		[req.query.no],
		function (err, rows) {
			if (err) {
				next(err);
				return;
			}
			res.render("board/updateForm", rows[0]);	
		}
	);
});

router.post('/update.do', (req, res, next) => {
	var param = req.body;
	var sql = "update tb_board set title = ?, content = ? where no = ? ";
	con.query(
			sql, 
			[param.title, param.content, param.no], 
			function (err, result) {
				if (err) {
					next(err);
					return;
				}
				res.redirect("list.do");
			}
	);
});

router.get('/detail.do', (req, res, next) => {
	con.query(
		"select * from tb_board where no = ? ", 
		[req.query.no],
		function (err, rows) {
			if (err) {
				next(err);
				return;
			}
			res.render("board/detail", rows[0]);	
		}
	);
});

router.get('/delete.do', (req, res, next) => {
	con.query(
		"delete from tb_board where no = ? ", 
		[req.query.no],
		function (err, result) {
			if (err) {
				next(err);
				return;
			}
			res.redirect("list.do");
		}
	);
});

module.exports = router;