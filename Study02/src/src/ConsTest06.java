package src;

import net.daum.service.MemberService;
import net.daum.service.MemberServiceImpl;

/* 부모 인터페이스를 상속 받은 자손클래스에서 추상메서드를 오버라이딩 한 다음 자손에서 부모 인터페이스 타입으로 업캐스팅 이후
 * 오버라이딩 한 메서드.
 * 
 * 
 */

public class ConsTest06 {

	public static void main(String[] args) {
		
		MemberService memberService = new MemberServiceImpl(); // 업캐스팅
		memberService.insertMember(); // 업캐스팅 이후 오버라이딩 한 메서드 호출
		
	}

}
