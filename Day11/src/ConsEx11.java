/* 2025년 8월 28일
 * 개발자 : 최상철 
 * 
 * this()에 의해서 같은 클래스 내에서 오버로딩 된 다른 생성자를 호출해 본다.
 */

class Car11 {
	String color; // 색깔
	String gearType; // 변속기 종류 : auto, manual
	int door; // 문의 개수

	Car11() {
		this("white", "auto", 4); // 같은 클래스 내에서 전달인자 3개짜리 오버로딩 된 생성자를 호출
	}

	Car11(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	void print() {
		System.out.println("차색상 : " + color + ", 변속기 종류 : " + gearType + ", 문의 개수 : " + door);
	}
}

public class ConsEx11 {

	public static void main(String[] args) {

		Car11 car = new Car11();
		car.print();

	}

}
