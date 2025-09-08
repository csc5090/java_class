package src;

/* 2025 - 09 - 08
 * 
 * 개발자 : 최상철
 * 
 * 일반 클래스나 추상클래스는 하나 이상의 부모로부터 다중 상속을 받을 수 없고, 단일 상속만 가능하다. 
 */

abstract class Hello02 {
	public abstract void sayHello(String name); // 추상메서드 정의 -> 추상클래스에서 추상메서드를 정의할 때는 abstract 키워드 생략할 수 없음.
}

abstract class GoodBye02 {
	public abstract void sayGoodbye(String name);
}

class SubClass02 extends Hello02,Goodbye02{ //하나의 부모로부터 단일 상속만 가능하다.

	@Override
	public void sayHello(String name) {

	}

	@Override
	public void sayGoodbBye(String name) {

	}

}

public class InterEx02 {
	public static void main(String[] args) {

	}

}
