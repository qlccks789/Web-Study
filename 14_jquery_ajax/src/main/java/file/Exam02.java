package file;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/file/exam02.do")
public class Exam02 extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");

		MultipartRequest mRequest = new MultipartRequest(
				request, 
				"c:/bit2019/upload", 
				1024 * 1024 * 100,
				"utf-8", 
				new DefaultFileRenamePolicy()
		);
		String msg = mRequest.getParameter("msg");

		PrintWriter out = response.getWriter();
		out.println("<h1>msg : " + msg + "</h1>");
		
		Enumeration<String> fileNames = mRequest.getFileNames();
		while (fileNames.hasMoreElements()) {
			String fileName = fileNames.nextElement();
			String oriName = mRequest.getOriginalFileName(fileName);
			String sysName = mRequest.getFilesystemName(fileName);
			out.println("<h1>oriName : " + oriName + "</h1>");
			out.println("<h1>sysName : " + sysName + "</h1>");
		}
		out.close();
	}
	
}















