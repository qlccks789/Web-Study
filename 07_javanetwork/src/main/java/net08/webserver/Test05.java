/**
 *   아래와 같이 사용자가 호출할 수 있다..
 *   
 *   http://localhost:8000/board/list
 *   http://localhost:8000/board/delete?no=1
 *   http://localhost:8000/board/update?no=1&title=aaa
 *   http://localhost:8000/board/writeForm
 *   
 *   각각의 호출에 대해서 아래와 같이 사용자에게 응답하도록 코드 작성
 *   http://localhost:8000/board/list 호출이 오면 
 *   사용자에게 "게시판 목록 페이지 요청" 메세지를 응답한다.
 *   사용자에게 "게시판 삭제 페이지 요청" 메세지를 응답한다.
 *   사용자에게 "게시판 수정 페이지 요청" 메세지를 응답한다.
 *   사용자에게 "게시판 등록폼 페이지 요청" 메세지를 응답한다.
 *   
 *   만약, 위의 지정된 URL 이외의 페이지 호출시에는 
 *   "요청 페이지가 존재하지 않습니다" 메세지를 응답한다.
 */
package net08.webserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test05 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				Socket client = server.accept();
				
				BufferedReader br = new BufferedReader(
					new InputStreamReader(
						client.getInputStream(), "utf-8"
					)
				);
				
				// GET /path?query HTTP/1.1
				String reqStartline = br.readLine();
				String path = reqStartline.split(" ")[1].split("\\?")[0];
				String resMsg = "요청된 페이지는 존재하지 않습니다.";
				switch (path) {
				case "/board/list": resMsg = "게시판 목록 페이지 요청"; break;
				case "/board/delete": resMsg = "게시판 삭제 페이지 요청"; break;
				case "/board/update": resMsg = "게시판 수정 페이지 요청"; break;
				case "/board/writeForm": resMsg = "게시판 등록폼 페이지 요청"; break;
				}
				
				String msg = "<!DOCTYPE html>"
						   + "<html>"
						   + "  <head>"
						   + "    <meta charset='utf-8'>"
						   + "    <title>웹서버 구현</title>"
						   + "  </head>"
						   + "  <body>"
						   + "    <h1>" + resMsg + "</h1>"
						   + "  </body>"
						   + "</html>";
				
				String startline = "HTTP/1.1 200 OK\r\n";
				String headers = 
						"Content-Type: text/html; charset=utf-8\r\n"
					  + "Content-Length: " + msg.getBytes("utf-8").length + "\r\n\r\n";
				String body = msg;
				
				String data = startline + headers + body;
				
				OutputStream out = client.getOutputStream();
				out.write(data.getBytes("utf-8"));
				out.close();				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}




















