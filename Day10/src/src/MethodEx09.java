package src;

/* 메서드 매개변수 타입이 참조타입이면 객체주소값이 전달된다. 그러므로 메서드 호출 후에도 같은 주소값을 공유해서 변경된 값도 공유한다.
 * 이것을 레퍼런스에 의한 전달방식이라고 한다.
 * 
 */

class MyDate09 {
	int year = 2024;
	int month = 10;
	int day = 31;
}

class ReMethod {
	void changeDate(MyDate09 t) { // 매개변수 타입이 참조타입이다. Mydate09 t=d; t매개변수에 d객체주소가 대입됨.
		t.year = 2025; t.month = 8; t.day = 26;
	}
}

public class MethodEx09 {
	public static void main(String[] args) {
		
		 ReMethod rm = new ReMethod();
		 MyDate09 d = new MyDate09();
		 
		 System.out.println("changeDate()메서드 호출 전 : "+d.year+"년 "+d.month+"월 "+d.day+"일"); //2024년 10월 31일
		 rm.changeDate(d);
		 System.out.printf("changeDate()메서드 호출 후 : %d년 %d월 %d일 \n",d.year, d.month, d.day ); //2025년 8월 26일
		 

	}

}
