package net.daum.controller;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.daum.dto.MemberDTO;
import net.daum.service.MemberService;
import net.daum.service.MemberServiceImpl;

public class MemberIDCheckController implements Action {

	//비동기식 아이디 중복 검색 컨트롤러
	
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			 throws Exception {
		
		response.setContentType("text.html;charset=UTF-8"); //웹브라우저에 출력되는 문자와 태그 언어 코딩 타입을 설정
		PrintWriter out = response.getWriter(); //출력 스트림 객체 out 생성
		MemberService memberService = new MemberServiceImpl(); //부모 인터페이스 타입으로 업캐스팅 하면서 memberService 인스턴스 생성
		
		String id = request.getParameter("id"); //비동기식 post방식으로 전달된 아이디값을 가져와 좌측 변수에 저장
		
		MemberDTO db_id = memberService.idCheck(id); //DB로부터 아이디 중복 검색
		
		int re = -1; //중복 아이디가 없는 경우 반환값
		
		if(db_id != null) {//중복 아이디가 있는 경우 반환값
			re = 1;
		}
		
		
		out.println(re);
		return null;
	}

}
