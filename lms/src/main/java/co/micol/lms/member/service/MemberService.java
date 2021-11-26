package co.micol.lms.member.service;

import java.util.List;

public interface MemberService {
	List<MemberVO> memberSelectList(String status);	//상태값에 따라 선택적으로 멤버를 보여주기 위함.
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
	boolean isCheckId(String id);	//존재하면 false, 그렇지 않으면 true;
	
}
