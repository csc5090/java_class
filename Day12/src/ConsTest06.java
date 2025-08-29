/* 2025 - 08 -29
 * 
 * 개발자 : 최상철
 *  
 *  인스턴스 변수와 정적 변수의 차이점에 대해서 알 수 있는 소스.
 */

class St06 {
	static int a = 10; // static 키워드로 정의된 변수 a를 정적변수(클래스 변수)라고 한다. 정적변수는 해당클래스로 바로 접근할 수 있다.
	int b = 20;// 인스턴스 변수.

}

public class ConsTest06 {

	public static void main(String[] args) {

		System.out.println("St06.a = " + St06.a);

		St06 s01 = new St06();
		St06 s02 = new St06();
		System.out.println("s01.a=" + s01.a + "\t s02.a=" + s02.a); // 생성된 객체로 정적변수 접근 가능
		System.out.println("s01.b=" + s01.b + "\t s02.b=" + s02.b);

		s01.a = 100;
		System.out.println("s01.a=" + s01.a + "\t s02.a=" + s02.a); // 100 100

		s01.b = 200; // 인스턴스 변수는 생성된 객체마다 따로 관리한다. 그러므로 주소값도 다르다.
		System.out.println("s01.b=" + s01.b + "\t s02.b=" + s02.b); // 200 20

	}

}
