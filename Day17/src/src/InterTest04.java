package src;

/* 2025 - 09 - 09
 * 개발자 : 최상철
 * 
 * == 비교연산자와 String 내장 api클래스에 오버라이딩 된 equals()메서드를 사용한 예)
 * 
 */

public class InterTest04 {

	public static void main(String[] args) {

		int a = 10, b = 10;

		if (a == b) {// 기본타입 값을 == 같다 연산으로 비교하면 값을 비교한다.
			System.out.println(a + "와(과) " + b + "는 같다.");
		} else {
			System.out.println(a + "와(과) " + b + "는 같지 않다.");
		}

		String pwd01 = new String("56789");
		String pwd02 = new String("56789"); // new 키워드로 새로운 객체 pwd01과 pwd02를 생성하면 객체주소가 다르다.

		if (pwd01 == pwd02) {// String 클래스 타입을 ==로 비교하면 객체 주소값을 비교
			System.out.println("비번이 같다.");
		} else {
			System.out.println("비번이 다르다.");
		}

		if (!pwd01.equals(pwd02)) {
			System.out.println("비번이 다르다.");
		} else {
			System.out.println("비번이 같다.");
		}

	}
}