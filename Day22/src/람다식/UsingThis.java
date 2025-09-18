package 람다식;

/* 
 * 중첩 클래스 중에서 인스턴스 멤버 내부클래스의 메서드에서 람다식을 익명객체를 구현 부분에서 외부클래스의 private으로 선언된 멤버변수나 
 * 내부클래스 멤버변수에 접근하는 것에 대한 코드이다.
 */


public class UsingThis {

	private int outterField = 10;
	//인스턴스 멤버 내부클래스 정의
	class Inner {
		int innerField = 20;
		
		void method() {
			//람다식 익명객체를 구현
			MyFunInterface4 fi = () -> {
				System.out.println("outterField = "+outterField);
				System.out.println("UsingThis.this.outterField ="+UsingThis.this.outterField);
				
				System.out.println("innerField = "+innerField);
				System.out.println("this.innerField = "+innerField);
			};
			
			fi.method();
			
		}//method()
		
		
	}//외부클래스명$내부클래스명.class(UsingThis$Inner.class)
}
