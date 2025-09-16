package 중첩클래스와중첩인터페이스;

// 외부 클래스 메서드 내의 익명객체를 구현하고 익명객체 내부에 있는 외부 클래스 메서드 소속의 매개변수나 지역변수를 사용하고자 할 때는 final속성을 가진다.


public class Anonymous3 {
	
	private int field;
	
	public void method(int arg01, int arg02) {
		int var01=0;
		int var02=0;
		
		//arg01 = 10;
		//arg02 = 20;
		
		//var01 = 1000;
		//var02 = 2000;
		
		field = 100;
		
		Calculatable calc = new Calculatable()  {
			
			@Override
			public int sum() {
				int result = arg01 + arg02 + var01 + var02 + field;
				return 0;
			}
		};//익명객체를 구현을 위한 익명 클래스(Anonymous3$1.class)
		
		System.out.println("계산 결과값 = "+calc.sum());
	}

	
	
}
