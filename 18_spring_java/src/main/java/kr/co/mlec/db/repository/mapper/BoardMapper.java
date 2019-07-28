package kr.co.mlec.db.repository.mapper;

import java.util.List;

import kr.co.mlec.db.repository.vo.Board;

public interface BoardMapper {
	List<Board> selectBoard() throws Exception;
	void insertBoard(Board board) throws Exception;
	void updateBoard(Board board) throws Exception;
	void deleteBoard(int no) throws Exception;
}
