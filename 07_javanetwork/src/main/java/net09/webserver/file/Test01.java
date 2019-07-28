package net09.webserver.file;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import server.FileUtil;
import server.HttpServletRequest;
import server.HttpServletResponse;

public class Test01 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				Socket client = server.accept();
				HttpServletRequest request = new HttpServletRequest(
						client.getInputStream()
				); 
				HttpServletResponse response = new HttpServletResponse(
						client.getOutputStream()
				);
				
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println(FileUtil.readFile("WebContent/html/test.html"));
				out.close();
				
				response.send();
				
				client.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}











