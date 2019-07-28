package kr.co.mlec.db.board.service;

import java.util.List;

import kr.co.mlec.db.repository.vo.Board;

public interface BoardService {
	List<Board> retrieveBoard() throws Exception;
	void updateBoard(Board board) throws Exception;
}
