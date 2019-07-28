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

@WebServlet("/board/comment-regist.do")
public class CommentRegistController extends HttpServlet {

	private BoardMapper mapper;
	
	public CommentRegistController() {
		mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
	}
	
	@Override
	public void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int no = Integer.parseInt(request.getParameter("no"));
		
		// 게시판과 파일 테이블에 저장할 글번호를 조회
		CommentVO comment = new CommentVO();
		comment.setNo(no);
		comment.setContent(request.getParameter("content"));
		comment.setWriter(request.getParameter("writer"));
		
		// 게시물 저장 처리 부탁..
		mapper.insertComment(comment);
		
		response.sendRedirect("detail.do?no=" + no);
	}
}		












