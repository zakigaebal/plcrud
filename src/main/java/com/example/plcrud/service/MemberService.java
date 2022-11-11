package com.example.plcrud.service;

import com.example.plcrud.vo.MemberVO;

import java.util.List;

public interface MemberService {

	List<MemberVO> selectAllMembers();

	void insertMember(MemberVO member);

	void updateMember(int id, MemberVO member);

	void deleteMember(int id);
	
}
