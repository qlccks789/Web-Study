package kr.co.mlec.dao;

import java.util.List;

import kr.co.mlec.domain.Member;
import kr.co.mlec.domain.Search;

public interface TestMapper2 {
	Member selectMemberInfo1(String id);
	Member selectMemberInfo2(Member member);
	String selectMemberInfo3(String id);
	int selectMemberInfo4();
	List<Member> selectMemberList1();
	List<Member> selectMemberList2();
	void insertMember(Member member);
	void updateMember(Member member);
	void deleteMember(String id);
	List<Member> selectMemberIteratorList(Member member);
	List<Member> selectMemberIncludeList();
	int selectMemberIncludeListCount();
	List<Member> selectMemberSearchList(Search search);
	List<Member> selectMemberSearchList2(Member member);
}






















