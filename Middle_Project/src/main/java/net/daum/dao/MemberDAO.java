package net.daum.dao;

import java.util.List;

import net.daum.dto.MemberDTO;
import net.daum.dto.ZipcodeDTO;

public interface MemberDAO {

	MemberDTO idCheck(String id);

	List<ZipcodeDTO> zipFind(String dong);

	void insertMember(MemberDTO member);
	

}
