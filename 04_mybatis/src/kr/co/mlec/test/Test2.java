package kr.co.mlec.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.dao.TestMapper2;
import kr.co.mlec.domain.Member;

public class Test2 {
	
	private TestMapper2 dao;
	
	public Test2() {
		// myBatis으로 부터 TestMapper2 인터페이스의 구현 객체를 얻기
		SqlSession session = MyAppSqlConfig.getSqlSession();
		dao = session.getMapper(TestMapper2.class);
	}
	
	// 데이터를 조회하기 : 하나의 로우를 반환
	private void test01() {
//		Member m = dao.selectMemberInfo1("member-3");
		/*
		Member member = new Member();
		member.setId("member-3");
		member.setName("jsp");
		Member m = dao.selectMemberInfo2(member);
		if (m != null) {
			System.out.println(m.getId());
			System.out.println(m.getName());
			System.out.println(m.getEmail());
			System.out.println(m.getAddr());
		}
		
		String name = dao.selectMemberInfo3("member-3");
		System.out.println("이름 : " + name);
		 */
		
		int count = dao.selectMemberInfo4();
		System.out.println("회원수 : " + count);
	}
	
	// 여러개의 로우를 결과로 받기
	private void test02() { 
//		List<Member> list = dao.selectMemberList1();
		List<Member> list = dao.selectMemberList2();
		for (Member m : list) {
			System.out.print(m.getName() + "\t");
			System.out.print(m.getAddr() + "\t");
			System.out.println(m.getJoinDate());
		}
	}

	// 회원 등록
	private void insertMember() {
		Member member = new Member();
		member.setId("member-5");
		member.setName("aaa");
		member.setEmail("a@a.com");
		member.setAddr("서울");
		dao.insertMember(member);
		
		System.out.println("회원 등록 성공");
	}
	
	// 회원 수정
	private void updateMember()  {
		// member-5 인 사람의 이름을 홍길동 변경
		Member member = new Member();
		member.setId("member-5");
		member.setName("홍길동");
		dao.updateMember(member);
		System.out.println("회원 정보가 수정되었습니다.");
	}
	
	// 회원 삭제
	private void deleteMember() {
		// member-5 인 회원을 삭제
		dao.deleteMember("member-5");
		
		System.out.println("회원을 삭제하였습니다.");
	}
	
	// 동적 쿼리 처리방식
	private void dynamicSearch() {
		/*
		Member member = new Member();
		member.setAddrs(new String[] {"busan", "seoul"});
		List<Member> list = dao.selectMemberIteratorList(member);
		*/
		/*
		int count = dao.selectMemberIncludeListCount();
		System.out.println("전체 : " + count);

		List<Member> list = dao.selectMemberIncludeList();
		*/
		
		/*
		Search search = new Search();
		search.setSearchType("email");
		search.setSearchType("id");
		search.setSearchType("name");
		
		search.setSearchWord("j");
		
		List<Member> list = dao.selectMemberSearchList(search);
		*/
		Member member = new Member();
		member.setId("member-1");
		List<Member> list = dao.selectMemberSearchList2(member);
		for (Member m : list) {
			System.out.println(m.getName() + ":" + m.getAddr());
		}
	}
	
	
	public static void main(String[] args) {
		try {
			Test2 t = new Test2();
//			t.test01();  // 결과가 하나인 경우
//			t.test02();  // 결과가 여러개인 경우
//			t.insertMember();
//			t.updateMember();
//			t.deleteMember();
			t.dynamicSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}










