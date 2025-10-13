package net.daum.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/* 우편 검색 공지창을 띄우는 컨트롤러 */

public class ZipFindController implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/views/member/zip_find.jsp"); //뷰페이지 경로와 뷰페이지 파일명 설정
		return forward;
	}

}
