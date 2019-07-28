// update 처리 코드 작성
// 4번 게시물의 제목을 '코드에서 변경' 으로 수정함
const mysql = require("mysql");

const con = mysql.createConnection({
    user: "bit2019",
    password: "bit2019",
    database: "bitdb"
});

let sql = "update tb_board " +
          "   set title = ? " +
          " where no = ?  ";

con.query(sql, ['코드에서 변경', 4], function (err, result) {
    if (err) {
        throw err;
    }
    console.log("수정되었습니다.");
});          

con.end();