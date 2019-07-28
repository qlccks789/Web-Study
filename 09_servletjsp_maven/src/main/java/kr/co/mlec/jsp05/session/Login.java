/*
create table tb_member (
    id  varchar2(20) primary key,
    pass varchar2(20) not null,
    name    varchar2(30) not null
);

insert into tb_member(id, pass, name) values('admin', '1111', '관리자');
insert into tb_member(id, pass, name) values('kim', '1111', '김연아');
commit;

select * from tb_member;
 */
package kr.co.mlec.jsp05.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.mlec.common.db.MyAppSqlConfig;

@WebServlet("/jsp05/session/login.do")
public class Login extends HttpServlet {
	
	private LoginMapper mapper;
	
	public Login() {
		mapper = MyAppSqlConfig.getSqlSession().getMapper(LoginMapper.class);
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPass(pass);
		MemberVO user = mapper.selectLogin(member);
		// 사용자 입력이 정확하지 않다.
		if (user == null) {
			response.sendRedirect("loginform.do");
			return;
		}
		// 로그인 성공 처리 해야한다.
		// 세션에 사용자 정보를 등록시킨다.
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		// 메인페이지로 이동하기
		response.sendRedirect("main.do");
	}
}

























