package src;


/* 레퍼런스(참조)타입변수가 같은 객체주소를 공유해도 new 키워드로 새로운 객체를 생성하면 새로운 주소값이 할당된다.
 * 주소값이 달라지니 값을 공유할 수 없다. 
 */

class MyDate07 {
	int year = 2024;
	int month = 12;
	int day = 15;
}



public class MethodEx07 {

	public static void main(String[] args) {
		
				
		MyDate07 d = new MyDate07();
		MyDate07 t = d; // t => d 
		
		System.out.printf("%d년 %d월 %d일 \n", d.year, d.month, d.day);  // 2024년 12월 15일 
		System.out.println(t.year+"년 "+t.month+"월 "+t.day+"일 "); // 2024년 12월 15일일
		
		t = new MyDate07();
		t.year = 2025; t.month = 8; t.day = 27;
		System.out.printf("%d년 %d월 %d일 \n", d.year, d.month, d.day);
		System.out.printf("%d년 %d월 %d일 \n", t.year, t.month, t.day);
		
		
		
		
		

	}

}
