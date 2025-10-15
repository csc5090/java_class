package net.daum.controller;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/* 회원관리에서 로그아웃 컨트롤러 클래스 */
public class MemberLogOutController implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		session.invalidate();
		
		out.println("<script>");
		out.println("alert('로그아웃 되었습니다.');");
		out.println("location='member_login.do';");
		out.println("</script>");
		
		return null;
	}

}
