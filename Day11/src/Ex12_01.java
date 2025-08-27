/* 2025년 8월 27일
 * 개발자 : 최상철
 * 
 * # 메소드 오버로딩 문제1)
 * p() 메서드를 오버로딩하여 두 int타입 매개변수에 대해서 두 double 매개변수에 대해서 각각 최대값을 구하는 메서드를 작성해 본다.
 * (단, 매개변수 타입을 다르게 한 메서드 오버로딩)
 */

class MT {

	public void aa(int a, int b) {

		if (a > b) {
			System.out.println(a + "와 " + b + " 중 더 큰 최대값 = " + a);
		}

		return;
	}

	public void bb(double a, double b) {

		if (a < b) {
			System.out.println(a + "와 " + b + " 중 더 큰 최대값 = " + b);
		}

	}

}

public class Ex12_01 {

	public static void main(String[] args) {

		MT mt = new MT();
		mt.aa(100, 50);
		mt.bb(100.3, 200.7);

	}

}
