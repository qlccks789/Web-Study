package kr.co.mlec.dao;

import java.util.List;

import kr.co.mlec.domain.Account;
import kr.co.mlec.domain.Board;
import kr.co.mlec.domain.File;
import kr.co.mlec.domain.Member;

public interface TestMapper3 {
	List<Member> selectMemberList();
	Account selectAccountById(String id);
	
	// collection 테스트
	Board selectBoardByNo(int no);
	
	// 게시물 등록
	void insertBoard(Board board);
	
	// 파일 등록
	void insertFile(File file);
}






















