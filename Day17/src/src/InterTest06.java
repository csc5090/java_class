package src;

import java.util.StringTokenizer;

/* 2025 - 09 - 09
 * 개발자 : 최상철
 * 
 * java.util 패키지에 있는 내장 api 클래스 중에서 StringTokenizer는 특수문자를 기준으로 문자열을 분리해 준다.
 * 분리된 문자 조각을 토큰이라고 한다. 주로 회원관리 프로그램에서 정보 수정 입력폼에서 많이 활용한다.
 * 이 기능과 비슷한 기능을 하는 내장메서드는 String문자열 내장 클래스 하위에 split()가 있다.
 * 
 * StringTokenizer는 한 방향으로만 순차적으로 토큰을 소비하기 때문에 한 번 nextToken()으로 꺼낸 토큰 문자는 다시 접근을 못 한다.
 * 다시 사용하고 싶다면 StringTokenizer 객체를 새로 생성해야 한다.
 * 
 */

public class InterTest06 {

	public static void main(String[] args) {

		String phoneNumber = "010-777-9999";

		StringTokenizer phone = new StringTokenizer(phoneNumber, "-"); // -를 기준으로 폰번호를 분리한다.

		String phone01 = phone.nextToken();
		String phone02 = phone.nextToken();
		String phone03 = phone.nextToken();

		System.out.println("첫번째로 분리된 폰번호 : " + phone01);
		System.out.println("두번째로 분리된 폰번호 : " + phone02);
		System.out.println("세번째로 분리된 폰번호 : " + phone03);

		System.out.println("\n =================== \n");

		StringTokenizer phone2 = new StringTokenizer(phoneNumber, "-");

		while (phone2.hasMoreTokens())
			;
		{// 분리된 토큰이 있다면 true.
			System.out.println(phone2.nextToken()); // nextToken() 메서드로 분리된 문자를 가져온다.

		}

	}

}
