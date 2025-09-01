/* 2025 - 09 - 01
 * 개발자 : 최상철
 *  
 *  static 키워드로 정의된 메서드를 정적메서드라고 한다. 정적메서드는 해당 클래스로 직접 접근 가능함.
 */

class St01 {
	private static int a = 10; // 정적변수
	private int b = 20;// 인스턴스 변수

	public static void setA(int new_a) { // 정적 메서드 setA() 정의
		a = new_a;
	}

	public static int getA() {
		return a;
	}

}

public class StaticEx01 {

	public static void main(String[] args) {

		System.out.println("St01.getA() = " + St01.getA());

		St01 s01 = new St01();
		St01 s02 = new St01();

		s01.setA(100); // 생성된 객체로도 정적메서드 호출 가능.
		int result = St01.getA();
		System.out.println(result);

	}

}
