/* 2025년 8월 28일
 * 개발자 : 최상철 
 * 
 * 생성자 또는 메서드 {} 블록 내에서 클래스 소속의 멤버변수 중 인스턴스 변수명과 생성자나 메서드 소속의 전달인자(매개변수) 명이 같은 경우
 * 인스턴스 변수명앞에 .this 를 붙임.
 */


class MyDate26 {
	private int year;
	private int month;
	private int day;
	
	public MyDate26() {} // 매개변수가 없는 기본생성자
	
	public MyDate26(int year, int month, int day) { //전달인자 개수가 다른 생성자 오버로딩
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	
	public void pr() {
		System.out.println(year+"년 "+month+"월 "+day+"일");
	}
}



public class ConsEx08 {

	public static void main(String[] args) {
		
		MyDate26 md=new MyDate26(2024,10,30);
		md.pr();
		md.setYear(2026); // 2026 년으로 변경
		md.pr();		
	}

}
