package src;

/* 2025 - 09 - 09
 * 개발자 : 최상철
 * 
 * 부모 인터페이스의 default 메서드와 부모 클래스의 일반 메서드가 동일한 경우 부모 인터페이스의 디폴트 메서드는 무시되고
 * 부모 클래스의 일반 메서드가 상속된다.
 * 
 */

class ParentClass11{
	public void display() {
		System.out.println("부모클래스 일반 메서드");
	}
}

interface ParentInter11{
	default void display() {
		System.out.println("부모 인터페이스의 디폴트 메서드");
	}
}

class ChildClass11 extends ParentClass11 implements ParentInter11{
	
}


public class InterEx11 {

	public static void main(String[] args) {
		
		ChildClass11 ch11 = new ChildClass11();
		ch11.display();//부모클래스의 일반 메서드가 상속되어 진다.
	}
}
