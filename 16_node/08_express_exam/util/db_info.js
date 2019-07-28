var mysql = require("mysql");

var con = mysql.createConnection({
	user: "bit",
	password: "bit",
	database: "bitdb"
});

con.connect();

module.exports.getConnection = () => con