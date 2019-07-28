package kr.co.mlec.login.dao;

import kr.co.mlec.login.vo.MemberVO;

public interface LoginMapper {
	MemberVO selectLogin(MemberVO member);
}