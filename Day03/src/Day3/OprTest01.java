package Day3;

public class OprTest01 {

	public static void main(String[] args) {
		
		/* 자바의 char 타입 단일문자형을 이용한 비교연산자 예제 */
		
		System.out.printf("'0' == 0 \t %b \n", '0' == 0); // %b는  boolean타입. true or false를 출력함.
		// \t는 탭키만큼 공백, \n은 줄바꿈. '0'은 단일문자형 출력-십진수 정수 48임.
		// 48 == 0 -> false.
		
		System.out.printf("'A' == 65 \t %b \n", 'A' == 65); // 'A'는 십진수 정수 65.
		// 65 == 65 -> true
		
		System.out.printf("'A' > 'B' \t %b \n", 'A' > 'B'); // 'B'는 십진수 정수 66.
		// 결국 65> 66 -> false 출력.
		
		System.out.printf("'A' + 1 != 'B' \t %b \n", 'A' +1 != 'B');
		// 65+1 != 66 -> false
		
		
		
	}

}
