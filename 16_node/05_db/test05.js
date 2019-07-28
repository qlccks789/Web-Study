// delete 처리 코드 작성
// 4번 게시물을 삭제하라..
const mysql = require("mysql");

const con = mysql.createConnection({
    user: "bit2019",
    password: "bit2019",
    database: "bitdb"
});

let sql = "delete from tb_board where no = ? ";

con.query(sql, [4], function (err, result) {
    if (err) {
        throw err;
    }
    console.log("삭제되었습니다.");
});          

con.end();