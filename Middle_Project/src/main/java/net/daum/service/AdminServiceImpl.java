package net.daum.service;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import net.daum.controller.ActionForward;
import net.daum.dto.AdminDTO;

public class AdminServiceImpl implements AdminService {
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) 
	throws Exception {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		AdminService adminService = new AdminServiceImpl();
		
		AdminDTO ab = new AdminDTO();
		
		String admin_id = request.getParameter("admin_id");
		String admin_pwd = request.getParameter("admin_pwd");
		
		return null;
	}

}
