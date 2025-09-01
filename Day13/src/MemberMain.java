/* 2025 - 09 - 01
 * 개발자 : 최상철
 * 
 * net.daum.dto 패키지의 데이터 저장 bean 클래스 MemberDTO.java를 임포트해서 사용
 * 
 */

import net.daum.dot.MemberDTO;

public class MemberMain {

	public static void main(String[] args) {

		MemberDTO member = new MemberDTO();

		member.setMem_id("abc12345");
		member.setMem_pwd("123456");
		member.setMem_name("홍길동");
		member.setMem_email("hong123@daum.net");
		member.setMem_phone("010-1234-5678");

		System.out.println("아이디 : " + member.getMem_id());
		System.out.println("비번 : " + member.getMem_pwd());
		System.out.println("회원이름 : " + member.getMem_name());
		System.out.println("이메일" + member.getMem_email());
		System.out.println("폰번호 : " + member.getMem_phone());

	}

}
