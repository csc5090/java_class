package src;

/* 2025 - 09 - 08
 * 
 * 개발자 : 최상철
 * 
 *  인터페이스에서 인터페이스 간 상속은 extends 예약어를 사용한다. 그리고 인터페이스 간 상속도 다중 상속이 가능하다.
 */

interface IHello05 {
	void hello(String name); // public abstract이 생략된 추상 메서드
}

interface GoodBye05 {
	public abstract void bye(String name);
}

interface ITotal extends IHello05, GoodBye05 { // 두 부모 인터페이스로부터 다중 상속 가능
	void greeting(String name);
}

class SubClass05 implements ITotal {

	@Override
	public void hello(String name) {
		System.out.println(name + " say hello to you!");

	}

	@Override
	public void bye(String name) {
		System.out.println(name + " say goodbye to you!");

	}

	@Override
	public void greeting(String name) {
		System.out.println(name + " greeting you!");

	}

}

public class InterEx05 {

	public static void main(String[] args) {

		ITotal Say = new SubClass05();//업캐스팅
		Say.hello("Sang choel"); // 업캐스팅 이후 오버라이딩 한 메서드 호출
		Say.bye("csc");
		Say.greeting("cwh");
	}

}
