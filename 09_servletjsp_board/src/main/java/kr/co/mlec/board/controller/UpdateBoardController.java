package kr.co.mlec.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.board.dao.BoardMapper;
import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.common.db.MyAppSqlConfig;

@WebServlet("/board/update.do")
public class UpdateBoardController extends HttpServlet {
	
	private BoardMapper mapper;
	
	public UpdateBoardController() {
		mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// EncodingFilter 에서 대체
//		request.setCharacterEncoding("utf-8");

		// 파라미터 정보를 읽어 데이터베이스에 저장하기
		BoardVO board = new BoardVO();
		board.setNo(Integer.parseInt(request.getParameter("no")));
		board.setTitle(request.getParameter("title"));
		board.setWriter(request.getParameter("writer"));
		board.setContent(request.getParameter("content"));
		mapper.updateBoard(board);

		response.sendRedirect("list.do");
	}
}


