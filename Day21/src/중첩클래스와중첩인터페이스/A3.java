package 중첩클래스와중첩인터페이스;

/* 1. 인스턴스 멤버 내부 클래스 내에 선언된 메서드에서 외부클래스 A3에 선언된 인스턴스 변수, 인스턴스 메서드, 정적변수, 정적 메서드에 접근이 가능함.
 * 2. 정적 멤버 내부 클래스 내에 선언된 메서드에서 외부 클래스 A3에 선언된 인스턴스 변수와 인스턴스 메서드에는 접근할 수 없지만, 정적변수와 정적변수
 * 정적 메서드에는 접근이 가능함.
 * 
 * 
 */

public class A3 {
	
	int field01;
	void method01() {}
	
	static int field02;//정적변수
	static void method02() {}
	
	//인스턴스 멤버 내부 클래스B
	
	class B{
		void method() {
			field01 = 10;
			method01();
			field02=20;
			method02();
			
		}
		
	}// A3$B.class
	
	//정적 멤버 내부 클래스 C
	
	static class C{
		void method() {
			field01 = 100; //외부클래스 인스턴스 변수 접근 못함
			method01(); //
			
			field02 = 200;
			method02();
		}
	}//A$C.class

}
