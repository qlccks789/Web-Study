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
import javax.servlet.jsp.PageContext;

import kr.co.mlec.board.dao.BoardMapper;
import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.common.file.FileUtil;

@WebServlet("/board/list.do")
public class ListBoardController extends HttpServlet {

	private BoardMapper mapper;
	
	public ListBoardController() {
		mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		ServletContext context = request.getServletContext();
		String path = context.getRealPath("/html/list.html");
		System.out.println(path);
		
		String content = FileUtil.readFile(path);
		System.out.println(content);
		
		// 게시물 목록 가져오기
		List<BoardVO> list = mapper.selectBoard(); 
		System.out.println("size : " + list.size());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String tdata = "";
		for (BoardVO board : list) {
			tdata += "<tr>";
			tdata += "  <td>" + board.getNo() + "</td>";
			tdata += "  <td><a href='/06_servlet_board/board/detail.do?no=" + board.getNo() + "'>" + board.getTitle() + "</a></td>";
			tdata += "  <td>" + board.getWriter() + "</td>";
			tdata += "  <td>" + board.getViewCnt() + "</td>";
			tdata += "  <td>" + sdf.format(board.getRegDate()) + "</td>";
			tdata += "</tr>";
		}
		out.println(content.replaceAll("#tdata", tdata));
		out.close();
	}
}













