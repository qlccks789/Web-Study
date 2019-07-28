package net10.webservice.exam;

import java.io.PrintWriter;

import kr.co.mlec.common.db.MyAppSqlConfig;
import login.LoginMapper;
import login.LoginVO;
import server.FileUtil;
import server.HttpServlet;
import server.HttpServletRequest;
import server.HttpServletResponse;

public class LoginController extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		System.out.println("id : " + id);
		System.out.println("password : " + password);
		
		// 데이터베이스 확인 작업
		LoginVO login = new LoginVO();
		login.setId(id);
		login.setPassword(password);
		
		LoginMapper mapper = 
				MyAppSqlConfig.getSqlSession().getMapper(
						LoginMapper.class);
		int count = mapper.selectLogin(login);
		if (count == 0) {  // 로그인 실패
			String html = FileUtil.readFile(
					"WebContent/html/loginform.html"
			);
			out.println(html);
		} else {
			out.println("<h1>로그인 성공</h1>");			
		}
		out.close();
	}
}














