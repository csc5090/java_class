package net.daum.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


// 관리자 정보 저장
public class AdminLoginOKController implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		HttpSessioni session = request.getSession();
		AdminService adminService = new AdminServiceImpl();
		
		Admin ab = new AdminDTO();
		
		String admin_id = request.getParameter("admin_id");
		String admin_pwd = request.getParameter("admin_pwd");
		
		ab.setAdmin_id
		
		
		return null;
	}

}
