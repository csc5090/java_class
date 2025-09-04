
/*
 * 다운캐스팅이란?
 * 	1. 다운캐스팅을 할려면 사전에 상속관계를 만들어야 한다.
 *  2. 다운캐스팅은 부모 타입을 자손타입으로 내리는 것을 말한다.
 *  3. 다운캐스팅을 할려면 사전에 업캐스팅을 해야 한다.
 *  4. 다운캐스팅을 할려면 자동형변환이 안되기 때문에 명시적인 형변환(캐스팅) 연산자를 사용해서 다운캐스팅을 해야 한다.
 * 
 * 
 */

package src;

class Mother02 extends Object {

	public void m02() {
		System.out.println("부모클래스 메서드 m02()");
	}
}

class Son02 extends Mother02 {

	public void ch02() {
		System.out.println("자손클래스 메서드 ch02()");
	}
}

public class RefCast02 {
	public static void main(String[] args) {

		Object obj = new Son02(); // 사전에 업캐스팅 -> 암묵적인 자동형 변환
		Mother02 m = (Mother02) obj; // 명시적인 다운캐스팅
		m.m02();

		Son02 ch = (Son02) obj; // 명시적인 다운캐스팅
		ch.m02(); // 상속받아서 호출
		ch.ch02(); // 자기 자신 자손에서 정의된 메서드 호출
	}
}