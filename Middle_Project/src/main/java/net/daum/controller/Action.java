package net.daum.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Action {

	public abstract ActionForward execute(HttpServletRequest request,HttpServletResponse response)
	throws Exception;
	/* 추상 메서드는 {}가 없고, 실행문장이 없고 호출이 불가능하다.
	 * 인터페이스에 오는 추상메서드는 public abstract 을 생략가능하다.
	 */
	
}
