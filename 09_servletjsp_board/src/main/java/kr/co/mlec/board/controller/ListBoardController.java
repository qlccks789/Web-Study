package kr.co.mlec.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.board.dao.BoardMapper;
import kr.co.mlec.board.vo.PageVO;
import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.common.page.PageResult;

@WebServlet("/board/list.do")
public class ListBoardController extends HttpServlet {

	private BoardMapper mapper;
	
	public ListBoardController() {
		mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PageVO page = new PageVO();
		int pageNo = 1;
		try {
			pageNo = Integer.parseInt(
					request.getParameter("pageNo"));
			page.setPageNo(pageNo);
		} catch (Exception e) {}
		
		// 게시물 목록 가져오기
		request.setAttribute("list", mapper.selectBoard(page));
		request.setAttribute("pageResult", new PageResult(
				pageNo, mapper.selectBoardCount()
		));
		
		request.getRequestDispatcher("list.jsp")
	           .forward(request, response);
	}
}













