/* 2025년 8월 28일
 * 개발자 : 최상철 
 * 
 * 같은 클래스 내에서 오버로딩 된 다른 생성자를 호출할 때는 this()를 사용한다.
 * 
 */

class MyDate27{
	private int year;
	private int month;
	private int day;
	
	public MyDate27() { // 기본 생성자
		this(2025,8,26);
	}

	public MyDate27(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}  //생성자 오버로딩
	
	public void print() {
		System.out.println(year+"년 "+ month + "월 "+day+"일");
	}
}



public class ConsEx09 {

	public static void main(String[] args) {
		
		MyDate27 md01 = new MyDate27(); // 매개변수가 없는 기본생성자 호출
		md01.print();
		
		
	}

}
