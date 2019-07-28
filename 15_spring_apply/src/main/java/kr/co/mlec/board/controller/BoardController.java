package kr.co.mlec.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.repository.domain.Board;
import kr.co.mlec.repository.domain.Comment;
import kr.co.mlec.repository.domain.Page;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService service;
	
	@RequestMapping("/comment-list.do")
	@ResponseBody
	public List<Comment> commentList(int no) {
		return service.commentList(no);
	}
	
	@RequestMapping("/writeForm.do")
	public void writeForm() {}
	
	@RequestMapping("/write.do")
	public String write(Board board) {
		service.write(board);
		return UrlBasedViewResolver.REDIRECT_URL_PREFIX + "list.do";
	}
	
	@RequestMapping("/updateForm.do")
	public void updateForm(int no, Model model) {
		model.addAttribute("board", service.updateForm(no));
	}
	
	@RequestMapping("/update.do")
	public String update(Board board) {
		service.update(board);
		return UrlBasedViewResolver.REDIRECT_URL_PREFIX + "list.do";
	}
	
	@RequestMapping("/delete.do")
	public String delete(int no) {
		service.delete(no);
		return UrlBasedViewResolver.REDIRECT_URL_PREFIX + "list.do";
	}	
	
	@RequestMapping("/detail.do")
	public void detail(int no, Model model) {
		model.addAttribute("board", service.detail(no));
	}
	
	@RequestMapping("/list.do")
	public void list(Page page, Model model) {
		Map<String, Object> result = service.list(page);
		// model에 추가될 데이터 처리
		model.addAttribute("list", result.get("list"));
		model.addAttribute("pageResult", result.get("pageResult"));
	}
}
















