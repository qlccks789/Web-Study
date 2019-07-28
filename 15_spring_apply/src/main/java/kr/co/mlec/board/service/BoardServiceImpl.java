package kr.co.mlec.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.common.page.PageResult;
import kr.co.mlec.repository.domain.Board;
import kr.co.mlec.repository.domain.Comment;
import kr.co.mlec.repository.domain.Page;
import kr.co.mlec.repository.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper mapper = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardMapper.class);
	
	public List<Comment> commentList(int no) {
		return mapper.selectCommentByNo(no);
	}
	
	public void write(Board board) {
		mapper.insertBoard(board);
	}
	
	public Board updateForm(int no) {
		return mapper.selectBoardByNo(no);
	}
	
	public void update(Board board) {
		mapper.updateBoard(board);
	}
	
	public void delete(int no) {
		mapper.deleteBoard(no);
	}	
	
	public Board detail(int no) {
		return mapper.selectBoardByNo(no);
	}
	
	public Map<String, Object> list(Page page) {
		Map<String, Object> result = new HashMap<>();
		result.put("list", mapper.selectBoard(page));
		result.put("pageResult", new PageResult(
				page.getPageNo(), mapper.selectBoardCount()
		));
		return result;
	}
}














