package net.daum.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberJoinController implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String[] phone = {"010", "011", "019"};
		String[] email = {"naver.com", "daum.net", "gmail.com", "직접 입력"};
		
		request.setAttribute("phone", phone);
		request.setAttribute("email", email);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/views/member/member_Join.jsp");
		return forward;
	}

}
