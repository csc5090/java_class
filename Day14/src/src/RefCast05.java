
/*
 * instanceof 형변환 유무 판단 연산자
 * 
 */

package src;

class HandPhone05 extends Object {
	protected String model; // 폰모델명
	protected String number; // 폰번호

	public HandPhone05() {
	} // 기본생성자

	public HandPhone05(String model, String number) {
		this.model = model;
		this.number = number;
	}// 생성자 오버로딩
} // HandPhone05 부모 클래스

class DicaPhone05 extends HandPhone05 {
	protected String pixel; // 화소 수

	public DicaPhone05() {
	}

	public DicaPhone05(String model, String number, String pixel) {
		super(model, number); // 부모의 오버로딩 된 생성자 호출
		this.pixel = pixel;
	}
	
	public void prnHandPhone() {
		System.out.println("폰 모델명 : "+model+", 폰 번호 : "+number+", 화소수 : "+pixel);
	}
	

	public class RefCast05 {

	}

}
