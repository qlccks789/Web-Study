package kr.co.mlec.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.dao.TestMapper3;
import kr.co.mlec.domain.Board;
import kr.co.mlec.domain.Comment;
import kr.co.mlec.domain.File;
import kr.co.mlec.domain.Member;

public class Test3 {
	private TestMapper3 mapper;
	public Test3() {
		SqlSession session = MyAppSqlConfig.getSqlSession();
		mapper = session.getMapper(TestMapper3.class);
	}
	
	// association 테스트 예제
	public void test01() {
		List<Member> list = mapper.selectMemberList();
		/*
		// association 추가한 다음 주석처리
		for (Member m : list) {
			m.setAccount(
					mapper.selectAccountById(m.getId())
			);
		}
		*/
		// 설정된 Account 확인
		for (Member m : list) {
			System.out.println(
				m.getName() + "-" + m.getAccount().getMoney()
			);
		}
		
	}
	
	// collection 테스트 예제
	public void test02() {
		Board board = mapper.selectBoardByNo(2);
		System.out.println("게시글 정보");
		System.out.println("-------------------");
		System.out.println("번호 : " + board.getNo());
		System.out.println("제목 : " + board.getTitle());
		System.out.println("내용 : " + board.getContent());
		System.out.println("-------------------");
		System.out.println("댓글 정보 출력");
		System.out.println("-------------------");
		List<Comment> list = board.getCommentList();
		for (Comment c : list) {
			System.out.println(
					c.getCommentNo() + "-" + c.getContent());
		}
	}
	
	// 등록 처리
	public void test03() {
		Board board = new Board();
		board.setWriter("테스터");
		board.setTitle("저장 테스트");
		board.setContent("게시물 내용 저장");
		mapper.insertBoard(board);
		System.out.println(board.getNo() + "번 저장되었습니다.");
		
		// 생성된 게시물 번호를 받아서 저장한다.
		File file = new File();
		file.setFileName("연습.txt");
		file.setFileSize(1000);
		file.setNo(board.getNo());
		mapper.insertFile(file);
		System.out.println("파일이 저장되었습니다.");
	}
	
	public static void main(String[] args) {
		Test3 t = new Test3();
//		t.test01();
//		t.test02();
		t.test03();
	}
}















