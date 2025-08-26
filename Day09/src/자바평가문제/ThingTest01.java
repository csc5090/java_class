package 자바평가문제;

//다음은 하나의 속성(변수x)을 갖는 Thing 클래스입니다.
// 다음예제에서 문제점을 발견하고 수정해봅시다.
// 가장 올바른 oop 코드여야 함.

/*  
 * 
 * 
 */

class Thing10 {

	private int x; // x속성은 프라이빗으로 되어 있음. Thing10 클래스 외부에서 접근 못함.

	//변경 추가 코드
	public void setX(int new_x) {
		x = new_x;
	}//setter 

	public int getX() {
		return x;
	}//getter() 값 반환 메서드
}

public class ThingTest01 {

	public static void main(String[] args) {

		Thing10 thing01; // 객체 주소가 저장 안 된 참조 변수
		thing01 = new Thing10(); // 객체주소가 저장 된 참조 변수 thing01 -> 객체명

		// thing01.x=10;
		// 변경 추가 코드

		thing01.setX(10);
		System.out.println(thing01.getX());

	}

}


