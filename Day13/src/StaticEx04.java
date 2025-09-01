/* 2025 - 09 - 01
 * 개발자 : 최상철
 * 
 * class 자손클래스 extends 부모클래스 {
 * 
 * }
 * 
 * 클래스 상속에 대하여.
 * 하나의 부모로부터 단일 상속만 가능하다.
 * 
 * 
 */

class Parent04 { // extends Object 이 생략됨. 자바 클래스는 명시적인 상속을 받지 않으면 묵시적으로 extends Object가 추가되어
				 // 자바 최상위 부모클래스 Object로부터 상속받게 된다.

	public void parentPrn() {
		System.out.println("부모 Parent04 클래스의 메서드 parentPrn()");

	}
}// Parent04 calss

class Child04 extends Parent04 {
	public void childPrn() {
		System.out.println("자손클래스의 메서드 childPrn()");
	}

}// 자손 Child04 class

public class StaticEx04 {

	public static void main(String[] args) {
		
		Child04 child=new Child04();
		child.parentPrn(); //상속받아서 호출
		child.childPrn(); // 자손에서 정의된 메서드 호출
		
		Parent04 p=new Parent04();
		p.parentPrn(); // 부모클래스에서 정의된 메서드 호출

	}

}
