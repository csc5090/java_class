package net.daum.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Action {
	
	public abstract ActionForward execute(HttpServletRequest request,HttpServletResponse response)
	throws Exception;
	// 추상 메서드는 {}가 없고,실행 코드가 없고 호출이 불가능.
	// 인터페이스에 오는 추상메서드는 public abstract를 생략가능함.
	
	
	
}
