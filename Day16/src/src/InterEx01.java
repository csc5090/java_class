package src;

/* 2025 - 09 - 08
 * 개발자 : 최상철
 * 
 * 1. 인터페이스는 interface 예약어로 정의하고 implements 키워드로 자손클래스에서 구현 상속 받는다.
 * 2. 자손클래스에서 하나 이상 부모 인터페이스로부터 다중 상속을 받을 수 있다.
 * 3. 인터페이스에 오는 춧항메서드는 public abstract 키워드로 정의한다. 물론 이 예약어는 생략가능하다.
 * 4. 부모 인터페이스를 구현 상속 받은 자손클래스에서 부모의 모든 추상메서드를 반드시 오버라이딩을 해야하는 강제성이 부여된다. 그래야만 자손 클래스 객체 생성이 가능하다.
 */

interface IHello01 { // 최초 작성한 인터페이스에 부모는 존재하지 않는다. -> 명시적으로 어떤 부모 인터페이스도 상속하지 않았기 때문에.
	public abstract void sayHello(String name); // public abstract은 생략 가능. 추상메서드 정의. 추상메서드는 {}가 없고 실행문장이 없으며 호출이 불가능.

}

class Hello01 implements IHello01 {

	@Override
	public void sayHello(String name) {// 부모 인터페이스의 추상메서드 오버라이딩
		System.out.println(name + " 안녕! ");
	}
}

public class InterEx01 {

	public static void main(String[] args) {

		IHello01 ih; // 부모 인터페이스 타입으로 참조변수 선언
		ih = new Hello01(); // 부모 인터페이스 타입으로 업캐스팅
		ih.sayHello("홍길동"); // 업캐스팅 이후 오버라이딩 한 메서드 호출

	}

}
