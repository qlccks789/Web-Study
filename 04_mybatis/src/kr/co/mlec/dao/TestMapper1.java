package kr.co.mlec.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.domain.Member;
import kr.co.mlec.domain.Search;

// BoardDAO 개념의 클래스
public class TestMapper1 {
	// mybatis를 사용하기 위해서 SqlSession 객체를 얻어오기
	private SqlSession session = MyAppSqlConfig.getSqlSession();
	private final static String NS = "kr.co.mlec.dao.TestMapper1.";
			
	public Member selectMemberInfo1(String id) {
		return session.selectOne(NS + "selectMemberInfo1",id);
	}
	
	public Member selectMemberInfo2(Member member) {
		return session.selectOne(NS + "selectMemberInfo2", member);
	}
	
	public String selectMemberInfo3(String id) {
		return session.selectOne(NS + "selectMemberInfo3", id);
	}
	
	public int selectMemberInfo4() {
		return session.selectOne(NS + "selectMemberInfo4");
	}
	
	public List<Member> selectMemberList1() {
		return session.selectList(NS + "selectMemberList1");
	}
	
	public List<Member> selectMemberList2() {
		return session.selectList(NS + "selectMemberList2");
	}
	
	public void insertMember(Member member) {
		session.insert(NS + "insertMember", member);
	}
	
	public void updateMember(Member member) {
		session.update(NS + "updateMember", member);
	}
	
	public void deleteMember(String id) {
		session.update(NS + "deleteMember", id);
	}
	
	public List<Member> selectMemberIteratorList(Member member) {
		return session.selectList(NS + "selectMemberIteratorList", member);
	}
	
	public List<Member> selectMemberIncludeList() {
		return session.selectList(NS + "selectMemberIncludeList");
	}
	
	public int selectMemberIncludeListCount() {
		return session.selectOne(NS + "selectMemberIncludeListCount");
	}
	
	public List<Member> selectMemberSearchList(Search search) {
		return session.selectList(NS + "selectMemberSearchList", search);
	}
	
	public List<Member> selectMemberSearchList2(Member member) {
		return session.selectList(NS + "selectMemberSearchList2", member);
	}
}






















