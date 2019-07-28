package file;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/file/exam01.do")
public class Exam01 extends HttpServlet {

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
		String oriName = mRequest.getOriginalFileName("attachFile");
		String sysName = mRequest.getFilesystemName("attachFile");
		String oriName2 = mRequest.getOriginalFileName("attachFile2");
		String sysName2 = mRequest.getFilesystemName("attachFile2");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>msg : " + msg + "</h1>");
		out.println("<h1>oriName : " + oriName + "</h1>");
		out.println("<h1>sysName : " + sysName + "</h1>");
		out.println("<h1>oriName2 : " + oriName2 + "</h1>");
		out.println("<h1>sysName2 : " + sysName2 + "</h1>");
		out.close();
	}
	
}















