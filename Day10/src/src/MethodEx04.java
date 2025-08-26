package src;

/* 자바 5(jdk 1.5)버전에서 추가된 가변인자(Varargs) 문법
 * 전달인자 개수가 다른 메서드가 오버로딩 된 경우에는 그 개수만큼 메서드를 정의해야 한다. 그만큼 코드라인이 늘어난다. 이를 해결하기 위해서 자바 5버전에서 가변인자 문법이 도입되었다.
 * 형식은 메서드 () 소괄호 내에서 int ... arr 형태로 사용하면 된다.
 */

class Mt04 {
	void prn(int... arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println(); // 줄바꿈
	}
}

public class MethodEx04 {

	public static void main(String[] args) {

		Mt04 m04 = new Mt04();
		m04.prn(10);
		m04.prn(10,20,30);
		m04.prn(10, 20, 30, 40, 50);

	}

}
