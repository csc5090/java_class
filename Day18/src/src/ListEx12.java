package src;

/* 2025 - 09 - 11
 * 개발자 : 최상철
 * 
 * 제네릭 클래스 설계
 * 
 */

class GenericClass<T> {// 아직 정해지지 않은 가상의 제네릭 T타입
	private T member;

	public void setMember(T member) {
		this.member = member;
	}

	public T getMember() {
		return member;
	}

}

public class ListEx12 {

	public static void main(String[] args) {

		GenericClass<Double> gc01 = new GenericClass<>();
		gc01.setMember(10.7);
		System.out.println("반환되는 실수 숫자값 : " + gc01.getMember());

		GenericClass<Integer> gc02 = new GenericClass<>(); // 정수 숫자만 저장 가능한 제네릭
		gc02.setMember(100);
		System.out.println("반환되는 정수 숫자값=" + gc02.getMember());
		
		GenericClass<String> gc03 = new GenericClass<>(); // 문자열만 저장 가능한 제네릭
		gc03.setMember("대전시");
		System.out.println("반환되는 문자열값 = " + gc03.getMember());
	}

}
