package src;

/* 2025 -09 - 09
 * 개발자 : 최상철
 * 
 * 부모 인터페이스에 추가된 추상메서드는 반드시 이를 구현 상속한 자손클래스에서 오버라이딩을 해야 한다.
 * 그래야만 자손 클래스 객체 생성이 가능하다. 하지만 이런 경우에는 자손에서 필요하지 않은 부모의 불필요한 추상메서드까지 무조건 오버라이딩을 해야하는 불편함이 존재함.
 * 이를 해결하기 위해서 자바 8버전에서 디폴트 메서드가 추가되었다.
 * 이 디폴트 메서드가 부모 인터페이스에 추가되어도 자손에서 반드시 오버라이딩을 할 필요는 없다.
 * 필요하다면 오버라이딩하여 사용하고, 불필요하면 오버라이딩을 하지 않아도 된다. 결국 자손에서 선택적 오버라이딩을 하면 된다.
 * 하지만 부모 인터페이스의 추상메서드는 꼭 자손에서 오버라이딩 해야 한다.
 */

interface ParentInter09 {// 부모 인터페이스 정의
	void absmethod();// public abstract가 생략된 추상메서드

	public default void defaultMethod() { // 디폴트 메서드의 정의 -> public 접근권한 제어자 생략 가능.
		System.out.println("부모 인터페이스의 디폴트 메서드");
	}

}

class ChildClass09 implements ParentInter09 {
	@Override
	public void absmethod() {
		System.out.println("부모 인터페이스의 추상메서드가 오버로딩 됨.");
	}

	@Override
	public void defaultMethod() {
		System.out.println("부모 인터페이스의 디폴트 메서드는 자손에서 선택적 오버라이딩을 한다.");
	}

}

public class InterEx09 {

	public static void main(String[] args) {

		ParentInter09 p09 = new ChildClass09();// 업캐스팅
		p09.absmethod(); // 업캐스팅 이후 오버라이딩 한 메서드 호출
		p09.defaultMethod(); // 메서드가 오버라이딩이 되면 p09참조변수가 실제 가리키는 객체타입에 의해서 호출되는 메서드가 결정.
		// 여기서는 자손 ChildClass09객체 타입을 가리키고 있어서 오버라이딩을 한 메서드를 호출함.
		
	}

}
