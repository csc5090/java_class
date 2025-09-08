package src;

/* 2025 - 09 - 08
 * 
 * 개발자 : 최상철
 * 
 * 인터페이스는 하나 이상의 부모 인터페이스로부터 다중 상속을 받을 수 있다.
 */

interface IHello03 {
	void sayHello(String name); // public abstract가 생략된 추상메서드
}

interface IGoodBye03 {
	void sayGoodBye(String name);
}

class SubClass03 implements IHello03, IGoodBye03 {

	@Override
	public void sayGoodBye(String name) {
		System.out.println(name + " 잘가~");
	}

	@Override
	public void sayHello(String name) {
		System.out.println(name + " 안녕~ ");
	}
}

public class InterEx03 {

	public static void main(String[] args) {

		SubClass03 sub = new SubClass03();
		sub.sayHello("홍길동");
		sub.sayGoodBye("이순신");

	}

}
