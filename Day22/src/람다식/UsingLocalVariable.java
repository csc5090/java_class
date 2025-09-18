package 람다식;

	// MyFunInterface5 인터페이스를 메서드 내의 람다식 익명객체 구현해 사용해보기.
//익명객체 내의 오버라이딩 된 메서드 내에서 외부클래스 메서드 소속 매개변수나 지역변수를 사용할 경우 final 상수로 인식함.

public class UsingLocalVariable {
	
	void method(int arg) { //arg는 final 속성을 가진 상수로 인식함.
		int localVar = 70; //localVar도 final 상수로 인식
		
		arg = 100;
		localVar = 200;
		
		//람다식 익명 객체 구현
		MyFunInterface5 fi = () -> { 
			System.out.println("arg="+arg);
			System.out.println("localVar=localVar");
			
		};
		fi.method();
		
	}
}
