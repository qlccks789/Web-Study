import socket
import sys
import json


class stt_sock():
    def __init__(self):
        self.host = "127.0.0.1"
        self.port = 7000
        self.socket = None

    def start(self):
        try:
            self.socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
            print("Starting STT server on {host}:{port}".format(host=self.host, port=self.port))
            self.socket.bind((self.host, self.port))
            print("STT Server started on port {port}.".format(port=self.port))
        except Exception:
            print("Error: Could not bind to port {port}".format(port=self.port))
            self.shutdown()
            sys.exit(-1)
        self.listen_(10)

    def listen_(self, backlog):
        self.socket.listen(backlog)
        while True:
            (conn, address) = self.socket.accept()
            conn.settimeout(60)
            print("Recieved connection from {addr}".format(addr=address))
            data = conn.recv(4096)
            print(data)
            succ_ = verify(data)
            print(succ_)
            if not succ_:
                send_ = json.dumps({"success": True})
                conn.send(str.encode(send_))
            else:
                send_ = json.dumps({"success": False})
                conn.send(str.encode(send_))

    def shutdown(self):
        self.socket.shutdown(socket.SHUT_RDWR)


def verify(data):
    jdata = json.loads(data.decode('utf-8'))
    if "content" not in jdata.keys():
        return False
    if "lang" not in jdata.keys():
        return False
    else:
        if jdata["lang"] == "kor":
            return True
        elif jdata["lang"] == "eng":
            return True
        else:
            return False


if __name__ == "__main__":
    server = stt_sock()
    try:
        print("Press Ctrl+C to shut down server.")
        server.start()
    except Exception as e:
        print("Error")
        print(e)
        server.shutdown()
