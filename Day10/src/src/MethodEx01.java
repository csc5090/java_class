package src;

/* 자바의 oop에서 메서드 오버로딩이란?
 * 동일한 같은 클래스 내에서 같은 이름의 메서드를 여러번 중복해서 정의하는 것을 말함.
 * 
 * 오버로딩 된 메서드의 구분 요건)
 * 	1.전달인자(매개변수)타입(자료형)을 다르게 한다.
 * 	2.전달인자 개수를 다르게 한다.
 */

class Mt01 {
	int abs(int data) {
		if (data < 0) {
			data = -data;
		}
		return data;
	}

	double abs(double data) { // 전달인자 타입을 다르게 한 메서드 오버로딩1.
		if (data < 0) {
			data = -data;
		}
		return data;
	}

	void pr(int a) {
		System.out.println(a);
	}

	void pr(int a, int b) {// 전달인자 개수를 다르게 한 메서드 오버로딩.
		System.out.println(a + "\t" + b);
	}

}// Mt01 class

public class MethodEx01 {

	public static void main(String[] args) {

		Mt01 m01 = new Mt01();
		int result = m01.abs(-100);
		System.out.println("-100의 절대값 : " + result);
		System.out.println("-100.3의 절대값 : " + m01.abs(-100.3));

		m01.pr(10);
		m01.pr(10, 20);

	}

}
