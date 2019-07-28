package kr.co.mlec.board.dao;

import java.util.List;

import kr.co.mlec.board.vo.BoardVO;

public interface BoardMapper {
	/** 전체 게시물 목록 가져오기 */
	public List<BoardVO> selectBoard();
	
	/** 게시글 상세 정보 가져오기 */
	public BoardVO selectBoardByNo(int no);
	
	/** 게시글 등록 */
	public void insertBoard(BoardVO board);

	/** 조회수 증가시키기 */
	public void updateViewCnt(int no);
	
	/** 게시글 삭제 */
	public void deleteBoard(int no);

	/** 게시글 수정 */
	public void updateBoard(BoardVO board);
}