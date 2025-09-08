package src;

/* 2025 - 09 - 08
 * 
 * 개발자 : 최상철
 * 
 * class 자손클래스 extends 부모클래스 implements 부모 인터페이스{
 * }
 * 부모클래스와 인터페이스를 자손에서 동시에 상속받는 예)
 */

interface IHello04 {
	void hello(String name); // public abstract가 생략된 추상메서드
}

abstract class GoodBye04 {
	public abstract void bye(String name);// 추상메서드
}

class SubClass04 extends GoodBye04 implements IHello04 { // extends 부모클래스 implements 부모인터페이스

	@Override
	public void hello(String name) {
		System.out.println(name + "ㅎㅇ! 라고 함.");
	}

	@Override
	public void bye(String name) {
		System.out.println(name + "ㅂㅇ! 라고 함.");

	}

}

public class InterEx04 {

	public static void main(String[] args) {
		SubClass04 greet = new SubClass04();
		greet.hello("상철이가 ");
		greet.bye("상철이가 ");

	}

}
