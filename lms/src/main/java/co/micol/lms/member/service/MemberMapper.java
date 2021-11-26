package co.micol.lms.member.service;

import java.util.List;

public interface MemberMapper {
	List<MemberVO> memberSelectList(String status);
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
	boolean isCheckId(String id);
}
