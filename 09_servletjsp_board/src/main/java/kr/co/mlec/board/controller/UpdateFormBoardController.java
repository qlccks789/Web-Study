package kr.co.mlec.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.board.dao.BoardMapper;
import kr.co.mlec.common.db.MyAppSqlConfig;

@WebServlet("/board/updateform.do")
public class UpdateFormBoardController extends HttpServlet {

	private BoardMapper mapper;
	
	public UpdateFormBoardController() {
		mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 게시물 상세 정보 조회하기
		request.setAttribute(
			"board", mapper.selectBoardByNo(
				Integer.parseInt(request.getParameter("no"))
			)
		);
		request.getRequestDispatcher("updateform.jsp")
	           .forward(request, response);
	}
}











