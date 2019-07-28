var express = require("express");
var app = express();
var server = require('http').createServer(app);
var io = require('socket.io')(server);

app.use(express.static("public"));

app.get('/', function(req, res) {
	res.sendFile(__dirname + '/view/chat.html');
});

io.on("connection", function (socket) {  
  socket.on("msg", function (data) {
    socket.broadcast.emit("msg", data);
  });
});

server.listen(10001, function() {
  console.log('Socket IO server listening on port 10001');
});

