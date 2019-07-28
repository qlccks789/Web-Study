package server;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

public class HttpServletResponse {
	
	public static void main(String[] args) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		pw.println("aaaa");
		pw.println(11111);
		pw.println(3.14);
		pw.println("bbbb");
		pw.close();
		
		System.out.println(sw.toString());
	}
	
	private OutputStream out;
	private StringWriter sw = new StringWriter();
	private PrintWriter pw = new PrintWriter(sw);
	private String contentType;
	public HttpServletResponse(OutputStream out) {
		this.out = out;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public OutputStream getOutputStream() {
		return out;
	}
	public PrintWriter getWriter() {
		return pw;
	}
	/**
	 * 사용자가 출력하고자 하는 내용을 응답처리하는 메서드
	 */
	public void send() throws Exception {
		String msg = sw.toString();
		String startline = "HTTP/1.1 200 OK\r\n";
		String headers = 
				"Content-Type: " + contentType + "\r\n"
			  + "Content-Length: " + msg.getBytes("utf-8").length + "\r\n\r\n";
		String body = msg;
		
		String data = startline + headers + body;
		
		out.write(data.getBytes("utf-8"));
		out.close();
	}
	
	public void sendByte(byte[] buffer) throws Exception {
		String startline = "HTTP/1.1 200 OK\r\n";
		String headers = 
				"Content-Type: " + contentType + "\r\n"
			  + "Content-Length: " + buffer.length + "\r\n\r\n";
		out.write(startline.getBytes());
		out.write(headers.getBytes());
		out.write(buffer);
		out.close();		
	}
}






















