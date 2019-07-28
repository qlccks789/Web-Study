package kr.co.mlec.db.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.mlec.db.repository.mapper.BoardMapper;
import kr.co.mlec.db.repository.vo.Board;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper mapper;
	
	public List<Board> retrieveBoard() throws Exception {
		return mapper.selectBoard();
	}
	
	@Transactional(rollbackFor=Exception.class)
	public void updateBoard(Board board) throws Exception {
		// 트랜잭션 시작코드
		// 트랜잭션 테스트용
		mapper.insertBoard(board);
		// 테이블명을 잘못 작성한 상태 : 실행시 에러발생함..
		mapper.deleteBoard(8);
		// 트랜잭션 커밋
	}
	
}















