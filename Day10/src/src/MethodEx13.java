package src;

/* 참조타입 매개변수는 객체 주소값이 전달되어 주소값을 공유한다. 그러므로 변경된 값도 공유할 수 있다.
 */

class Data13 {
	int x;
}



public class MethodEx13 {

	public static void main(String[] args) {
		
		Data13 d=new Data13();
		d.x = 10;
		System.out.println("main() d.x="+d.x); // 10
		
		change(d); // d 객체주소가 전달
		System.out.println("change()메서드 호출 후 main() d.x="+d.x);//1000

	}
	
	static void change(Data13 d2) { //참조타입 매개변수 Data13 d
		d2.x = 1000;
		System.out.printf("d2.x=%d \n", d2.x); // 1000 
	}
}
