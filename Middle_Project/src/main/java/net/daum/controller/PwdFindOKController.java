package net.daum.controller;

import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.daum.dto.MemberDTO;
import net.daum.service.MemberService;
import net.daum.service.MemberServiceImpl;
import pwdconv.PwdChange;


/* 비번착기 결과 컨트롤러 */

public class PwdFindOKController implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		response.setContentType("text/html;charset=UTF-8"); //웹 브라우저에 출력되는 문자와 태그, 언어 코딩 타입을 설정
		PrintWriter out = response.getWriter(); //출력스트림 out 생성
		MemberService memberService = new MemberServiceImpl(); //업캐스팅
		MemberDTO m = new MemberDTO();
		ActionForward forward = new ActionForward();
		
		String pwd_id = request.getParameter("pwd_id");
		String pwd_name = request.getParameter("pwd_name");
		
		m.setMem_id(pwd_id); m.setMem_name(pwd_name);
		
		MemberDTO pm = memberService.pwdMember(m); //아이디와 회원이름을 기준으로 DB로 부터 회원정보 검색
		
		if(pm == null) {
			out.println("<script>");
			out.println("alert('회원정보를 찾을 수 없습니다')");
			out.println("history.back()");
			out.println("</script>");
		} else {
			Random r = new Random();
			int pwd_random = r.nextInt(100000); //1이상 10만 미만 사이의 랜덤 정수
			String ran_pwd = Integer.toString(pwd_random); //임시정수 비번을 문자열로
			m.setMem_pwd(PwdChange.getPassWordToXEMD5String(ran_pwd)); //임시비번 암호화
			
			memberService.updatePwd(m); //오라클의 DB 비번을 암호화 된 임시비번으로 수정
			request.setAttribute("ran_pwd", ran_pwd); //ran_pwd 키이름에 암호화 되기 전 임시비번을 저장
			return forward;
		}
		return null;
	}
}
