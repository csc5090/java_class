package Day01;

public class DataType01 {
	/* 한줄 이상 주석문 기호이다. 주석문은 소스에 대한 설명문이다. 실행되지 않는다.
	 * public 접근권한 제어자 키워드(예약어)는 누구나 다 접근 가능하게 한다.
	 * class 키워드는 DataType01 클래스명을 정의할 때 사용. 클래스명을 정의할 때 단어별 첫 글자는 반드시 영문대문자로. 관례적 법칙이 그러함.
	 */
	public static void main(String[] args) {
		/* 키워드는 예약어로 약속된 명렁어.
		 * static 키워드는 객체-인스턴스 생성 없이 해당 클래스명으로 직접 접근하는 정적변수나 정적메서드를 정의할 때 사용.
		 * main()은 정적메서드임. 이 메서드는 자바 프로그램에서 시작지점을 알려주는 정적메서드임.
		 * 즉, 가장 첫번째로 읽고 실행되는 메서드.
		 * 
		 * 메서드란?
		 * 어떤 기능 동작을 하게 하는 것을 일컫는 말.
		 * 
		 * void는 예약어. 리턴 값이 없을 때 사용( public void )
		 * 
		 * 
		 * String []은 문자열 배열임.
		 * 
		 */
		
		System.out.println(100); //System.out은 모니터 출력장치와 연결됨. print()은 출력 기능을 담당하는 메서드. ln은 줄바꿈을 위한 말.
		System.out.println(10.3); //10.3은 8바이트 크기 double 실수 숫자 타입.
		System.out.println('a') ; // 'a'는 단일 문자 char타입. 자바에서 단일문자는 해당 단일문자 십진수 정수값으로 저장된다.
		System.out.println(true); // true or false는 조건판단 할 때 사용하는 boolean 타입.
		System.out.println(10L); //10값 뒤에 접미사 L 혹은 1이 붙으면 8바이트 long 정수숫자 타입.
		System.out.println(10.7f); //100.7 실수값 뒤에 접미사 f 혹은 F가 붙으면 4바이트 float 실수 숫자 타입.
		System.out.println("대전시"); // "대전시"는 기본 타입에 속하지 않는 문자열 참조-레퍼런스타입인 String 클래스형 
		System.out.printf("%10d\n %15s %20.2f", 153, "qew", 12.623);
	}

}
