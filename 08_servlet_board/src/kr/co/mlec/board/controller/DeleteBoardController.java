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

@WebServlet("/board/delete.do")
public class DeleteBoardController extends HttpServlet {
	
	private BoardMapper mapper;
	
	public DeleteBoardController() {
		mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");

		// 데이터베이스 처리하기
		mapper.deleteBoard(Integer.parseInt(request.getParameter("no"))); 
		
		// 화면에 출력할 html 내용 가져와서 사용자에게 결과 전송하기
		String result = FileUtil.readFile(
				request.getServletContext().getRealPath("/html/result.html")
		);
		result = result.replaceAll("#result", "게시글이 삭제되었습니다");

		PrintWriter out = response.getWriter();
		out.println(result);
		out.close();
	}
}


