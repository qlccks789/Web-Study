package kr.co.mlec.repository.mapper;

import java.util.List;

import kr.co.mlec.repository.domain.Board;
import kr.co.mlec.repository.domain.Comment;
import kr.co.mlec.repository.domain.Page;

public interface BoardMapper {
	public List<Board> selectBoard(Page page);
	public int selectBoardCount();
	void insertBoard(Board board);
	Board selectBoardByNo(int no);
	int deleteBoard(int no);	
	int updateBoard(Board board);
	
	List<Comment> selectCommentByNo(int no);
}