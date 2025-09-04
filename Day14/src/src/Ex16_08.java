
/*
 * 8번문제.
 * 
 * 
 */

package src;

class A {
	public A() {
		System.out.println("hello from a");
	}
}

class B extends A {
	public B() {
		System.out.println("hello from b");
		super(); // 이미 묵시적으로 super() 가 제공되는데, 한번 더 명시적으로 적어서 에러가 뜸. "부모 객체 초기화를 위해 기본 생성자가 먼저 실행된다",
				 // 그러므로 항상 맨 첫 줄에 있어야 한다는 규칙 위배. 지우던가, 위에 쓰던가.
	}
}

public class Ex16_08 {
	public static void main(String args[]) {
		A a = new B();
	}
}