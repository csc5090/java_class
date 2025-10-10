package net.daum.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.StringTokenizer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MFrontController extends HttpServlet {
	/* 서블릿 자바 클래스 특징)
	 *  1.서블릿 클래스는 온라인 상에서 누구나 다 접근가능하게 public 접근권한 제어자로 선언한다.
	 *  2.서블릿은 HttpServlet클래스로 부터 상속받는다.
	 *  3.get or post에 상관없이 호출되는 service()메서드를 오버라이딩 한다.
	 *  4.HttpServletRequest는 사용자 폼에서 입력한 정보를 서버로 가져올 때 사용한다.
	 *  5.HttpServletResponse는 서버의 가공된 정보를 사용자 웹브라우저에 응답할 때 사용한다.
	 *  
	 *  web.xml에 설정한 url-pattern 매핑주소인 *.do가 실행되면 MFrontController 서블릿클래스가 실행된다. 이 클래스
	 *  에서 daum.properties 파일을 로드 실행해서 실제 매핑주소에 해당하는 net.daum.controller패키지에 있는 컨트롤러
	 *  클래스가 실행되는 일대 다 구조 즉 하나의 서블릿 클래스로 다수의 매핑주소를 실행하는 것이다. 
	 */

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String requestURI = request.getRequestURI(); // /Middle_Project/*.do 경로를 구함
		String contextPath = request.getContextPath(); // /Middle_Project 컨텍스트 패스 경로를 구함
		String command = requestURI.substring(contextPath.length()); // 컨텍스트 패스 경로인 /Middle_Pro
		// ject 이후부터 마지막 주소경로까지 구함. 여기서는 /*.do를 구한다.
		
		if(command.equals("/*.do")) {//매핑주소가 /*.do 내용과 같다면
			command = "/index.do"; // /*.do가 실행되면 /index.do로 리다이렉션 즉 이동한다.
		}
		
		ActionForward forward = null;
		Action action = null;
		
		Properties prop = new Properties();// 컬렉션 클래스로 키,값 쌍으로 저장하는 자료구조이다.
		FileInputStream fis =
				new FileInputStream(request.getSession().getServletContext().getRealPath(""
						+ "WEB-INF/classes/daum.properties"));
		/* 톰켓 WAS서버에 의해서 변경된 실제 톰켓프로젝트 경로의 해당파일을 읽어들인다. 
		 * D:\20250801_Java\Java_WorkSpace\.metadata\.plugins\org.eclipse.wst.server.core\
		 * tmp0\wtpwebapps\Middle_Project\WEB-INF\classes
		 */
		
		prop.load(fis);//프로퍼티 파일 로드 실행
		fis.close();//입력 스트림을 닫는다.
		
		String value = prop.getProperty(command);//키이름인 매핑주소에 대한 값을 구함
		
		if(value.substring(0,7).equals("execute")) {//0이상 7미만 사이의 문자가 execute와 같다면
			
			try {
				StringTokenizer st = new StringTokenizer(value, "|");// | 구분자를 기준으로 문자를 분리한다
				String url_01 = st.nextToken();//첫번째로 분리된 문자 execute를 저장
				String url_02 = st.nextToken();//두번째로 분리된 풀패키지경로.실제컨트롤러클래스(net.daum.contro
				//ller.MemberLoginController)
				Class url = Class.forName(url_02);//풀패키지 경로의 컨트롤러 클래스 객체화
				
				action=(Action)url.newInstance();//새로운 인스턴스로 다운캐스팅 해서 액션 생성
				
				try {
					forward = action.execute(request, response);//자손에서 오버라이딩 된 execute() 호출하여
					//액션포워드 생성
				}catch(Exception e) {e.printStackTrace();}
			}catch(ClassNotFoundException ce) {//해당 클래스 파일을 못찾은 경우 발생하는 예외 에러를 처리
				ce.printStackTrace();
			}catch(InstantiationException ie) {//추상클래스나 인터페이스를 인스턴스화 하고자 할때
				ie.printStackTrace();
			}catch(IllegalAccessException ae) {//클래스에 접근 못할 때 -> 클래스의 필드(멤버변수,속성),
				//메서드,생성자 등에 접근 권한이 없을 경우 발생
				ae.printStackTrace();
			}
		}//if
		
		if(forward != null) {
			if(forward.isRedirect() == true) {//==true는 생략가능하다.
				response.sendRedirect(forward.getPath());/* 새로운 매핑주소로 이동하기 때문에 
				request.setAttribute(키이름,값);으로 저장된 값을 잃어 버린다. 하지만 로그인 인증할 때 사용하는
				session.setAttribute(세션키이름,값); 은 유지한다.
				*/
			}else {
				RequestDispatcher disForward = request.getRequestDispatcher(forward.getPath());
				disForward.forward(request, response);
				/* forward()메서드로 이동하면 기존 매핑주소를 유지하면서 request.setAttribute(키이름,값);도 유지한다.
				 * 물론 로그인 인증할 때 사용하는 session.setAttribute(세션키이름,값);도 유지한다.
				 */
			}//if ~ else		
		}//if
	}//service()	
}
