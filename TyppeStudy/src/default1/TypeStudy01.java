package default1;

/* 자바의 기본타입(자료형) 종류 8개)
 * 1.정수 숫자형 : byte(1), short(2), int(4), long(8)
 * 2.실수 숫자형 : float(4), double(8)
 * 3.논리형(참 또는 거짓) : boolean(1바이트 : true, false)
 * 4.단일문자형:char(2바이트 : 단일문자는 십진수 정수 숫자로 저장되기 때문에 정수 숫자형에 포함시켜도 된다.)
 * 
 * 기본타입 8개를 제외한 자료형을 참조 타입 즉 레퍼런스 자료형이라고 한다.
 * 참조타입 종류 : 클래스형, 배열형, 인터페이스형, 열거형
 * 
 * 기본타입으로 선언된 변수에는 값이 저장되고, 참조타입으로 선언된 변수에는 객체주소가 저장된다.
 * 
 * 자바의 변수 선언법 형식)
 * 타입(자료형) 변수명;
 * int a;
 * 
 */

public class TypeStudy01 {

	public static void main(String[] args) {

		int seven = 7;
		double ten = 10.0;
		boolean flag = true;
		String name = "홍길동";

		System.out.printf("seven=%d \n", seven); // %d는 십진수 정수 출력형태 지시자이다.
		System.out.println("ten=" + ten);
		System.out.println("flag=" + flag);
		System.out.println("name=" + name);

	}

}
