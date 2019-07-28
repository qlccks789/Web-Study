package kr.co.mlec.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.board.dao.BoardMapper;
import kr.co.mlec.board.vo.CommentVO;
import kr.co.mlec.common.db.MyAppSqlConfig;

@WebServlet("/board/comment-update.do")
public class CommentUpdateController extends HttpServlet {

	private BoardMapper mapper;
	
	public CommentUpdateController() {
		mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
	}
	
	@Override
	public void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// EncodingFilter 에서 대체
//		request.setCharacterEncoding("utf-8");
		
		CommentVO comment = new CommentVO();
		comment.setContent(request.getParameter("content"));
		comment.setCommentNo(Integer.parseInt(request.getParameter("commentNo")));
		mapper.updateComment(comment);
		
		response.sendRedirect("detail.do?no=" + Integer.parseInt(request.getParameter("no")));
	}
}










