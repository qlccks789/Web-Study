package kr.co.mlec.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.mlec.board.dao.BoardMapper;
import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.login.vo.MemberVO;

@WebServlet("/board/delete.do")
public class DeleteBoardController extends HttpServlet {
	
	private BoardMapper mapper;
	
	public DeleteBoardController() {
		mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 데이터베이스 처리하기
		mapper.deleteBoard(Integer.parseInt(request.getParameter("no"))); 
		response.sendRedirect("list.do");
	}
}


