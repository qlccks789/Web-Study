package kr.co.mlec.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.board.dao.BoardMapper;
import kr.co.mlec.common.db.MyAppSqlConfig;

@WebServlet("/board/comment-delete.do")		
public class CommentDeleteController extends HttpServlet {

	private BoardMapper mapper;
	
	public CommentDeleteController() {
		mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
	}
	
	@Override
	public void service(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		mapper.deleteComment(
				Integer.parseInt(
						request.getParameter("commentNo")));
		response.sendRedirect("detail.do?no=" + Integer.parseInt(request.getParameter("no")));
		
	}
}	












