// node에서 mysql database 사용하기
// npm install mysql 
const mysql = require("mysql");

const con = mysql.createConnection({
    // host: "localhost",
    // port: 3306,
    user: "bit2019",
    password: "bit2019",
    database: "bitdb"
});

let sql = `select no, title, writer 
             from tb_board 
            order by no desc 
            limit ?, ?`;

con.query(sql, [2, 2], function (err, rows, fields) {
    // select 수행 시 에러발생
    if (err) {
        console.log(err);
        throw err;
    }

    // 수행된 결과 확인하기
    console.log("실행된 결과보기");

    for (let i = 0; i < rows.length; i++) {
        let board = rows[i];
        console.log(board.no, board.title, board.writer);
    }

});

con.end(function (err) {
    console.log("데이터베이스가 정상적으로 종료되었습니다.");
});