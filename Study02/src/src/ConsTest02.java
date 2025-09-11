package src;

/* 메서드 오버라이딩
 * 1. 상속관계에서 부모의 메서드 이름, 메서드 리턴타입, 매개변수 타입과 개수 모두 동일한 원형을 그대로 자손으로 상속한 상태에서 자손에 맞게 
 * {}중괄호 내의 실행문장을 덮어쓰기(재구현)하는 것.
 * 
 * 2. 메서드 오버라이딩을 할려면 사전에 상속관계를 만들어야 한다.
 *    
 */

class Parent02 { // extends Object가 생략됨.

	public void p02() {
		System.out.println("부모 클래스 메서드 p02()");
	}

}

class Child02 extends Parent02 {

	public void p02() {
		super.p02(); // super 메서드에 의해서 부모의 메서드를 호출함.
		System.out.println("오버라이딩 한 메서드");
	}

	public void ch02() {
		System.out.println("자손에서 정의한 메서드 ch02()");
	}
}

public class ConsTest02 {

	public static void main(String[] args) {
		Child02 ch02=new Child02();
		ch02.p02(); // 오버라이딩 한 메서드 호출
		ch02.ch02(); // 자손에서 정의한 메서드 호출
			}

}
