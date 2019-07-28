package kr.co.mlec.board.controller;

import java.util.List;

import org.springframework.web.ModelAndView;
import org.springframework.web.WebConstants;
import org.springframework.web.annotation.Controller;
import org.springframework.web.annotation.RequestMapping;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.common.page.PageResult;
import kr.co.mlec.repository.domain.Board;
import kr.co.mlec.repository.domain.Comment;
import kr.co.mlec.repository.domain.Page;
import kr.co.mlec.repository.mapper.BoardMapper;

@Controller
public class BoardController {

	private BoardMapper mapper = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardMapper.class);
	
	@RequestMapping("/board/comment-list.json")
	public List<Comment> commentList(int no) {
		return mapper.selectCommentByNo(no);
	}
	
	//  "/jsp" + "/board/writeForm" + ".jsp"
	@RequestMapping("/board/writeForm.do")
	public void writeForm() {
		System.out.println("writeForm");
	}
	
	@RequestMapping("/board/write.do")
	public String write(Board board) {
		mapper.insertBoard(board);
		return WebConstants.REDIRECT + "list.do";
	}
	
	@RequestMapping("/board/updateForm.do")
	public ModelAndView updateForm(int no) {
		ModelAndView mav = new ModelAndView("board/updateForm");
		mav.addObject("board", mapper.selectBoardByNo(no));
		return mav;
	}
	
	@RequestMapping("/board/update.do")
	public String update(Board board) {
		mapper.updateBoard(board);
		return WebConstants.REDIRECT + "list.do";
	}
	
	@RequestMapping("/board/delete.do")
	public String delete(int no) {
		mapper.deleteBoard(no);
		return WebConstants.REDIRECT + "list.do";
	}	
	
	@RequestMapping("/board/detail.do")
	public ModelAndView detail(int no) {
		ModelAndView mav = new ModelAndView("board/detail");
		mav.addObject("board", mapper.selectBoardByNo(no));
		return mav;
	}
	
	@RequestMapping("/board/list.do")
	public ModelAndView list(Page page) {
		ModelAndView mav = new ModelAndView("board/list");
		// model에 추가될 데이터 처리
		mav.addObject("list", mapper.selectBoard(page));
		mav.addObject("pageResult", new PageResult(
				page.getPageNo(), mapper.selectBoardCount()
		));
		return mav;
	}
}






