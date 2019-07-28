package kr.co.mlec.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.board.dao.BoardMapper;
import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.common.file.FileUtil;

@WebServlet("/board/write.do")
public class WriteBoardController extends HttpServlet {
	
	private BoardMapper mapper;
	
	public WriteBoardController() {
		mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		// 파라미터 정보를 읽어 데이터베이스에 저장하기
		BoardVO board = new BoardVO();
		board.setTitle(request.getParameter("title"));
		board.setWriter(request.getParameter("writer"));
		board.setContent(request.getParameter("content"));
		mapper.insertBoard(board);

		// 화면 결과처리 페이지 
		String result = FileUtil.readFile(
				request.getServletContext().getRealPath("/html/result.html")
		);
		result = result.replaceAll("#result", "게시글이 등록되었습니다");
		
		// 화면에 출력할 html 내용 가져와서 사용자에게 결과 전송하기
		PrintWriter out = response.getWriter();
		out.println(result);
		out.close();
	}
}


