const mysql = require("mysql");

const con = mysql.createConnection({
    user: "bit2019",
    password: "bit2019",
    database: "bitdb"
});

let sql = "insert into tb_board(title, writer, content) " +
          "values(?, ?, ?)";

con.query(
    sql, 
    ['동적 추가', 'node', '노드에서 추가'], 
    function (err, result) {
        if (err) {
            throw err;
        }
        console.log("게시물이 등록되었습니다.");
        console.log("추가된 글번호 : " + result.insertId);
    }
);

con.end();