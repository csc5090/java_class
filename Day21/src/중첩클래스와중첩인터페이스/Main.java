package 중첩클래스와중첩인터페이스;

/*
 * 인스턴스 멤버 내부 클래스와 정적 멤버 내부 클래스 객체생성과정  
 * 
 */

public class Main {

	public static void main(String[] args) {
		A a=new A();
		A.B b=a.new B();
		b.field01=3;
		b.field02=7;
		b.method01();
		b.method02();
		
		A.C c = new A.C();
		c.field01=7;
		c.field02=10;
		c.method01();
		c.method02();
		
		//로컬 클래스 객체 생성을 위한 메서드 호출
		a.method();
		
	}

}
