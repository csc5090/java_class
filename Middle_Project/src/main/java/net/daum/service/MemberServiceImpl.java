package net.daum.service;

import java.util.List;

import net.daum.dao.MemberDAO;
import net.daum.dao.MemberDAOImpl;
import net.daum.dto.MemberDTO;
import net.daum.dto.ZipcodeDTO;

public class MemberServiceImpl implements MemberService {

	/*
	 * 컨트롤러와 DAO사이에 service를 넣는 이유는 데이터베이스 작업(여러 DAO 메서드 호출 등)에 트랜잭션(rollback,
	 * commit) 을 걸고 싶을 때 주로 Service 계층에서 처리하기 때문이다. Service 계층이 없으면 Controller이 직접
	 * DB 처리 로직을 호출해야 하므로 코드가 복잡하고 유지보수가 어렵다. Controller 요청 처리, DAO는 DB 처리, Service는
	 * 비즈니스 로직 처리 하고 유지보수성 향상,로직이 분리되어 변경 및 디버깅이 쉬움,테스트 용이 고객의 추가 요구 사항 반영
	 * (애프터 서비스라고 생각하면 쉽다.) 컨트롤러와 DAO사이 중간 매개체 역할.
	 * 
	 */
	
	private MemberDAO memberDao = MemberDAOImpl.getInstance();
	
	@Override
	public MemberDTO idCheck(String id) {
		return memberDao.idCheck(id);
	}
		
	@Override
	public List<ZipcodeDTO> zipFind(String dong){
	    return memberDao.zipFind(dong); 
	}
	
	@Override
	public void insertMember(MemberDTO member) {
		memberDao.insertMember(member);
	}

	@Override
	public void updatePwd(MemberDTO m) {
		memberDao.updatePwd(m);
		
	}//암호화 된 임시비번 수정

	@Override
	public MemberDTO pwdMember(MemberDTO m) {
		
		return memberDao.pwdMember(m);
	}//아이디와 회원번호를 기준으로 회원정보 검색(비번 찾기)

	@Override
	public MemberDTO loginCheck(String id) {
		return memberDao.loginCheck(id);
	}

	@Override
	public MemberDTO getMember(String id) {
		return memberDao.getMember(id);
	} //아이디에 해당하는 회원정보 가져오기

	@Override
	public void editMember(MemberDTO m) {
		 memberDao.editMember(m);
		
	}

	@Override
	public void delMem(MemberDTO dm) {
		memberDao.delMem(dm);
		
	}
	
}
