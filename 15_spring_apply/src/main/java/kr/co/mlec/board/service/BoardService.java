package kr.co.mlec.board.service;

import java.util.List;
import java.util.Map;

import kr.co.mlec.repository.domain.Board;
import kr.co.mlec.repository.domain.Comment;
import kr.co.mlec.repository.domain.Page;

public interface BoardService {
	public List<Comment> commentList(int no);
	public void write(Board board);
	public Board updateForm(int no);
	public void update(Board board);
	public void delete(int no);
	public Board detail(int no);
	public Map<String, Object> list(Page page);
}













