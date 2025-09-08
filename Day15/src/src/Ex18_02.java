package src;

/* 2025 - 09 - 08
 * 
 * 개발자 : 최상철
 * 
 * 2번 문제)
 * 메서드를 final로 선언하면?
 */

class A {

	public final int method1() {
		return 0;
	}
}

class B extends A {

	public int method1() {
		return 100;
	}
}

public class Ex18_02 {

	public static void main(Strings args[]) {
		A b = new B();
		System.out.println("x = " + b.method1());
	}
}
