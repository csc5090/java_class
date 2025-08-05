package Day01;

public class DataType09 {

	public static void main(String[] args) {
		
		/* printf()메서드와 함께 사용하는 다양한 출력형태 지시자 종류
		 * %b(true or false 인 boolean 타입), %d(십진수 정수),
		 * %o(8진수 정수 출력형태), %x or %X (16진ㅇ수 정수 출력형태)
		 * %f (10진수 실수), %e or %E(지수형태), %c(단일문자) %s(문자열),
		 */
		
		char c = 'A'; // A는 십진수정수 65
		System.out.printf("c=%c, %d \n", c, (int)c);
		
		int octNum = 010; // 정수 숫자값 10앞에 접두어 0이 붙은 8진수 정수상수
		System.out.printf("octNum = %o, %d%n", octNum, octNum);
		
		int hexNum = 0x10; //접두어 0x가 붙으면 16진수 정수상수
		System.out.printf("hexNum=%X, %d\n", hexNum, hexNum);
		
		int binNum = 0b10; //접두어 0b가 붙으면 2진수 정수(자바 7버전 추가)
		System.out.printf("binNum = %s, %d\n", Integer.toBinaryString(binNum),binNum);
		/* 자바에서는 이진수 정수 출력 형태 지시자가 없음.
		 * 그래서 내장 api래퍼 클래스인 Integer 하위 정적메서드 toBinaryString(int i);
		 * 정적메서드를 활용해서 주어진 인자값을 이진 문자열로 변경해준다.
		 */
		
		
		int finger = 10;
		System.out.printf("finger = [%5d] %n", finger); 
		
		// %5는 총 5자리 십진수 출력형태. 오른쪽 기본 정렬.
		// 나머지 빈 자리는 공백으로 채움.
		
		System.out.printf("finger = [%-5d] %n", finger); 
		
		// %-5d는 총 5자리 십진수 정수출력형태. 왼쪽 기본 정렬.
		// 나머지는 공백으로 채움.
		
		System.out.printf("finger = [%05d] %n", finger);
		
		// %05 -> 공백을 0으로 채움. 5자리에서 핑거값 10을 뺀 나머지 3자리를 0으로.
		
		System.out.printf("finger = [%0-7d] %n", finger);
		
		

	}

}
