/* 2025년 8월 28일
 * 개발자 : 최상철 
 * 
 * 1.생성자나 메서드 {} 중괄호블록내에서 클래스 소속의 멤버 변수 중 인스턴스 변수와 생성자나 메서드 소속의 매개변수인 전달인자명이 같은 경우 
 * 자바는 어느것이 인스턴스 변수인지 판단할 수 없다. 그렇기에 this. 으로 표시를 해주면, 클래스 소속의 인스턴스 변수라는 걸 알게 된다.
 * this.로 클래스 생성자 내의 인스턴스 변수 표시.
 * 
 * 2. 여기서는 this.을 붙이지 않아서 년도값을 저장하지 못 하는 문제가 발생한다.
 * 
 */


class MyDate25{
	private int year;
	private int month;
	private int day;
	
	public MyDate25() {} // 기본ㅅ ㅐㅇ성자
	
	public MyDate25(int new_year, int new_month, int new_day) {
		year = new_year; month = new_month; day=new_day;
	}
	
	public void setYear(int year) {//값 저장 setter() 메서드
		year = year; // 왼쪽의 인스턴수 변수와 오른쪽의 매개변수명이 같으면 자바는 구분하지 못 하니, 년도값을 저장하지 못 함.
	}
	
	public void setMonth(int new_month) {
		month = new_month;
	}
	
	public void pr() {
		System.out.println(year+"년 "+month+"월 "+day+"일");
	}
}


public class ConsEx07 {

	public static void main(String[] args) {
		MyDate25 md = new MyDate25(2025,7,1); // 전달인자 3개짜리 오버로딩 된 생성자 호출
		md.pr();
		md.setYear(2026); // 년도값 수정 못 함
		md.pr();
		md.setMonth(8); // 8월로 변경
		md.pr();
		
		


	}

}
