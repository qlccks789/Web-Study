/**
 * OutputStream 사용하기
 * 
 * - 파일다운로드 기능 구현시, 이미지 다운로드 등등..
 */
package kr.co.mlec.servlet.basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/basic/test06.do")
public class Test06 extends HttpServlet {
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 전송하려는 문서의 타입 : 이미지로 설정
		response.setContentType("image/jpg");
		
		OutputStream out = response.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(out);
		
		FileInputStream fis = new FileInputStream(
				"c:/bit2019/data/test1.jpg"
		);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		while (true) {
			int ch = bis.read();
			if (ch == -1) break;
			
			bos.write(ch);
		}
		
		bis.close();  bos.close();
		fis.close();  out.close();
	}
}
















