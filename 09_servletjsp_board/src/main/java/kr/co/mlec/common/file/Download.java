package kr.co.mlec.common.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download.do")
public class Download extends HttpServlet {
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 파라미터 정보 추출하기
		// path(저장된 파일의 경로), name(실제 저장된 파일이름)
		String uploadRoot = "c:/bit2019/upload";
		
		String path = request.getParameter("path");
		String name = request.getParameter("name");
		// 다운로드 할 파일 이름
		String dName = request.getParameter("dname");
		
		System.out.println("path : " + path);
		System.out.println("name : " + name);
		
		File f = new File(uploadRoot + path, name);
		
		// 전송하는 데이터의 해석 정보
		if (dName == null) {
			response.setHeader("Content-Type", "image/jpg");
		} else {
			response.setHeader(
				"Content-Type", "application/octet-stream"
			);
			
			// 한글 이름 처리하기
			dName = new String(dName.getBytes("utf-8"), "8859_1");

			response.setHeader(
				"Content-Disposition", "attachment;filename=" + dName
			);
		}
		
		// 파일을 읽고 사용자에게 전송
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		OutputStream out = response.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(out);
	
		while (true) {
			int ch = bis.read();
			if (ch == -1) break;
			
			bos.write(ch);
		}
		
		bis.close();  fis.close();
		bos.close();  out.close();
	}
}






















