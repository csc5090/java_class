package 중첩클래스와중첩인터페이스;

//Anonymous2.java 를 활용한 예제 소스


public class AnonymousExample2 {

	public static void main(String[] args) {
		
		Anonymous2 anony = new Anonymous2();
		anony.field.turnOn(); // 익명 객체 필드 사용
		anony.method01();
		
		anony.method02(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("유튜브를 봅니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("유튜브를 끕니다.");
			}
			
		}); //익명클래스(AnonymousExample2$1.class)
		
		localVar.turnOn();
	}//method01()
	
	void method02(RemoteControl rc) {
		rc.turnOn();
	}

}
