package kr.co.mlec.board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.board.dao.BoardMapper;
import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.common.file.FileUtil;

@WebServlet("/board/detail.do")
public class DetailBoardController extends HttpServlet {

	private BoardMapper mapper;
	
	public DetailBoardController() {
		mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String content = FileUtil.readFile(request.getServletContext().getRealPath("/html/detail.html"));
		
		// 게시물 상세 정보 조회하기
		int no = Integer.parseInt(request.getParameter("no"));
		mapper.updateViewCnt(no); 
		BoardVO board = mapper.selectBoardByNo(no); 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		content = content.replaceAll("#no", board.getNo() + "");
		content = content.replaceAll("#title", board.getTitle());
		content = content.replaceAll("#writer", board.getWriter());
		content = content.replaceAll("#content", board.getContent());
		content = content.replaceAll("#viewCnt", board.getViewCnt() + "");
		content = content.replaceAll("#regDate", sdf.format(board.getRegDate()));
		out.println(content);
		out.close();
	}
}











