package src;

/* 레퍼런스 변수만 선언하고 null만 대입된 상태에서 클래스 소속의 구성요소 중 하나인 멤버변수에 접근하면 NullPointerException 예외 오류가 난다.
 * 이런 경우는 정상적인 컴파일도 되고, 그래스 바이트 코드 클래스 파일은 만들어 지지만, 이 클래스 파일을 실행시 예외 오류가 나게 된다.
 */

class MyDate11 {
	int year = 2025;
	int month = 8;
	int day = 28;
}

public class MethodEx11 {

	public static void main(String[] args) {

		MyDate11 d = null;
		System.out.println(d.year + "년 " + d.month + "월 " + d.day + "일");

	}

}
