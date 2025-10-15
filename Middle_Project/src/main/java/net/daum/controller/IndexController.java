package net.daum.controller;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/* 로그인 인증 이후 메인화면 이동 컨트롤러 */
public class IndexController implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		response.setContentType("text/html;charset=UTF-8"); //웹브라우저에 출력되는 문자와 태그, 언어코딩 타입을 설정
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		String id = (String)session.getAttribute("id"); 
		
		if(id==null) {
			out.println("<script>");
			out.println("alert('다시 로그인 하세요');");
			out.println("location='member_login.do';");
			out.println("</script>");
		} else {
			ActionForward forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("/WEB-INF/views/member/member_Login.jsp");
			return forward;
		}	
		return null;
	}

}
