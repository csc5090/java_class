package net.daum.service;

import java.util.List;

import net.daum.dto.MemberDTO;
import net.daum.dto.ZipcodeDTO;

public interface MemberService {

	MemberDTO idCheck(String id);//public abstgract가 생략된 추상메서드 ->{}가 없고 실행문장이 없다. 호출 불가능
	
	List<ZipcodeDTO> zipFind(String dong);

	void insertMember(MemberDTO member);

	void updatePwd(MemberDTO m);

	MemberDTO pwdMember(MemberDTO m);

	MemberDTO loginCheck(String id);

	MemberDTO getMember(String id);

	void editMember(MemberDTO m);

	void delMem(MemberDTO dm);
		
}
