package net.daum.controller;

import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.daum.dto.Zipcode2DTO;
import net.daum.dto.ZipcodeDTO;
import net.daum.service.MemberService;
import net.daum.service.MemberServiceImpl;

//DB로부터 우편주소 검색 결과 컨트롤러

public class ZipFindOKController implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		
		MemberService memberService = new MemberServiceImpl(); //업캐스팅
		ActionForward forward = new ActionForward();

		String dong = request.getParameter("dong").trim();//양쪽 공백을 제거하면서 입력한 길,읍,면,동을 저장
		
		List<ZipcodeDTO> zlist = memberService.zipFind("%"+dong+"%");
		//%는 오라클 DB에서 와일드 카드 문자로 하나 이상의 임의의 문자와 매핑 대응한다. 주로 검색할 때 사용한다. 검색어를 몰라도 모두 검색됨.
		
		List<Zipcode2DTO> zlist2 = new ArrayList<>();
		
		for(ZipcodeDTO z:zlist) {
			Zipcode2DTO z2=new Zipcode2DTO();
			
			z2.setZipcode(z.getZipcode()); //우편번호 저장
			z2.setAddr(z.getSido()+" "+z.getGugun()+" "+z.getDong());//시도 구군 동 저장
			zlist2.add(z2); //컬렉션 추가
		}
		request.setAttribute("zipcodelist", zlist2); //zipcodelist 키이름에 컬렉션 zlist2저장
		request.setAttribute("dong", dong);
		
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/views/member/zip_find.jsp");
		return forward;
	}

}
