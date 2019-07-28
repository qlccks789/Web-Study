package kr.co.mlec.board.dao;

import java.util.List;

import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.board.vo.CommentVO;
import kr.co.mlec.board.vo.FileVO;
import kr.co.mlec.board.vo.PageVO;

public interface BoardMapper {
	/** 전체 게시물 목록 가져오기 */
	public List<BoardVO> selectBoard(PageVO page);
	
	/** 전체 게시물 수 가져오기 */
	public int selectBoardCount();
	
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
	
	/* 
	 	========================
	 	댓글 파트 추가
	 	========================
	 */
	/** 댓글 목록 */
	List<CommentVO> selectCommentsByNo(int no);
	
	/** 댓글 등록 */
	void insertComment(CommentVO comment);
	
	/** 댓글 삭제 */
	void deleteComment(int commentNo);
	
	/** 댓글 수정 */
	void updateComment(CommentVO comment);	

	/* 
	 	========================
	 	파일 파트 추가
	 	========================
	 */
	void insertFile(FileVO file);
	
	List<FileVO> selectFilesByNo(int no);
}














