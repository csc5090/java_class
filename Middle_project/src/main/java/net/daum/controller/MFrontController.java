package net.daum.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MFrontController extends HttpServlet {
	
	/* 서블릿 자바 클래스 특징
	 * 1. 서블릿 클래스는 온라인 상에서 누구나 다 접근가능 하게 public 접근권한 제어자로 선언한다.
	 * 2. 서블릿은 HttpServlet클래스로 부터 상속받는다.
	 * 3. get or post에 상관없이 호출되는 service()메서드를 오버라이딩함.
	 * 4. HttpServletRequest는 사용자 폼에서 입력한 정보를 서버로 가져올 때 사용한다.
	 * 5. HttpServletResponse는 서버의 가공된 정보를 사용자 웹 브라우저에 응답할 때 사용한다.
	 * 
	 * web.xml에 설정한 url-pattern 매핑주소인 *.do가 실행되면 MFrontController 서블릿 클래스가 실행됨.
	 * 이 클래스에서 dau.properties 파일을 로드 실행하여 실제 매핑주소에 해당하는 net.daum.controller 패키지에
	 * 있는 컨트롤러 클래스가 실행되는 일대 다 구조 즉 하나의 서블릿 클래스로 다수의 매핑주소를 실행하는 것.
	 * 
	 */
	
	

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
				
		String requestURI = request.getRequestURI(); //Middle_Project/*.do 경로를 구함
		String contextPath = request.getContextPath(); //Middle_Project 컨텍스트 패스 경로를 구함
		String command = requestURI.substring(contextPath.length());
		
		
		
		
	}
}
