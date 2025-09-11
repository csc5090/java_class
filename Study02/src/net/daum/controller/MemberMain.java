package net.daum.controller;

import net.daum.dto.MemberDTO;

public class MemberMain {

	public static void main(String[] args) {
		
		MemberDTO member = new MemberDTO();
		
		member.setMem_id("aaaaa");
		member.setMem_pwd("77777");
		member.setMem_name("홍길동");
		member.setMem_phone("010-9999-1234");
		member.setMem_email("hong@gamil.com");
		member.setMem_addr("서울시 강남구");
		
		System.out.println("아이디 : "+member.getMem_id());
		System.out.println("회원 이름 : "+member.getMem_name());
		System.out.println("주소 : "+member.getMem_addr());

	}

}
