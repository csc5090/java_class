package src;

/* 2025 - 09 - 09
 * 
 * 개발자 : 최상철
 * 
 * 클래스와 클래스 간 직접 연결하는 방식 -> 스프링 부트 자바 프로젝트 개발에서 별로 권하고 싶지 않는 방식.
 * 
 */

class A07{// extends Object 생략
	public void methodA(B07 b) {
		b.methodB();
	}
}

class B07{
	public void methodB() {
		System.out.println("methoB(0 호출");
	}
}


public class InterEx07 {
	public static void main(String[] args) {
		
		A07 a = new A07();
		a.methodA(new B07());
	}
	
	

}
