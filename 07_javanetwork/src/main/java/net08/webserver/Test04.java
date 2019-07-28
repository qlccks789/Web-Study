/**
 *   페이지 호출을 아래와 같이 
 *   
 *   http://localhost:8000/board/list
 *   
 *   Method : GET
 *   RequestURI : /board/list
 *   Parameter
 *   없음
 *   
 *   http://localhost:8000/board/login?id=hong&pass=1234
 *   
 *   Method : GET
 *   RequestURI : /board/login
 *   Parameter
 *   id : hong
 *   pass : 1234
 */
package net08.webserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Test04 {
	public static void main(String[] args) {
		// 요청 시의 HTTP 규약 확인하기
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				Socket client = server.accept();
				
				BufferedReader br = new BufferedReader(
					new InputStreamReader(
							client.getInputStream(), "utf-8"     
					)
				);		
				
				// 요청 시작라인 
				String reqStartline = br.readLine();
				String[] arr = reqStartline.split(" ");
				String method = arr[0];
				String url = arr[1];
				
				// /board/delete
				String[] urlArr = url.split("\\?");
				String path = urlArr[0];
				System.out.println("path : " + path);
				
				String msg = "<!DOCTYPE html>"
						   + "<html>"
						   + "  <head>"
						   + "    <meta charset='utf-8'>"
						   + "    <title>웹서버 구현</title>"
						   + "  </head>"
						   + "  <body>"
						   + "    <div>"
						   + "      <h2>"
						   + "		  Method : " + method
						   + "      </h2>"
						   + "      <h2>"
						   + "		  RequestURI : " + path
						   + "      </h2>"
						   + "      <h2>Parameter</h2>"
						   + "      <div>";
				if (urlArr.length == 2) {
					String query = urlArr[1];
					String[] paramArr = query.split("&");
					for (String param : paramArr) {
						String[] paramInfo = param.split("=");
						msg += paramInfo[0] + ":" + paramInfo[1] + "<br>"; 
					}
				} else {
					msg += "없음";
				}
				msg += "      </div>";
				msg += "    </div>";
				msg += "  </body>";
				msg += "</html>";
				
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














