package kr.co.mlec.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.mlec.board.dao.BoardMapper;
import kr.co.mlec.board.vo.CommentVO;
import kr.co.mlec.board.vo.FileVO;
import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.login.vo.MemberVO;

@WebServlet("/board/detail.do")
public class DetailBoardController extends HttpServlet {

	private BoardMapper mapper;
	
	public DetailBoardController() {
		mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
	}
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 게시물 상세 정보 조회하기
		int no = Integer.parseInt(request.getParameter("no"));
		// 조회수 증가
		mapper.updateViewCnt(no); 
		// 게시물 상세 정보
		request.setAttribute("board", mapper.selectBoardByNo(no));
		
		// 댓글 목록 공유
		List<CommentVO> commentList = mapper.selectCommentsByNo(no);
		request.setAttribute("commentList", commentList);
		
		// 파일 목록 공유
		List<FileVO> fileList = mapper.selectFilesByNo(no);
		request.setAttribute("fileList", fileList);
		
		request.getRequestDispatcher("detail.jsp")
               .forward(request, response);		
	}
}











