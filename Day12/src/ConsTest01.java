/* 2025년 8월 28일
 * 개발자 : 최상철 
 * 
 * 생성자를 이용한 객체 복사 예제 소스)
 *
 */


class Car01 {
	String color; // 차색상
	String gearType; //변속기 종류(auto, 수동)
	int door; // 차 문 개수



/* 클래스 소속 멤버변수를 명시적 코드로 초기화하지 않으면 자바는 다음과 같은 기본값으로 초기화한다.
 * 참조 즉 레퍼런스 타입 : null, booolean 타입 : false
 * byte,short,int : 0, long : 0l
 * float : 0.0f, double : 0.0 or 0.0d
 * 
 */

Car01(){//매개변수가 없는 기본생성자
	this("white","auto",4); // 같은 클래스 내의 전달인자 3개짜리 오버로딩 된 다른 생성자를 호출
}

Car01(Car01 c){//생성자를 이용한 객체 복사
	color = c.color;
	gearType=c.gearType;
	door = c.door;
}//생성자 오버로딩

Car01(String color, String gearType, int door) {
	this.color = color;
	this.gearType = gearType;
	this.door = door;
}

void print() {
	System.out.println("차색상 : "+color+", 변속기 종류 : "+gearType + ", 차문 개수 : "+door);
}
}



public class ConsTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car01 c01=new Car01();
		Car01 c02=new Car01(c01);
		c01.print();
		
		c01.door = 6;
		
		c01.print(); c02.print();  // c01과 c02는 객체 주소값이 다르다. 그래서 다른값을 가질 수 있다.

	}

}
