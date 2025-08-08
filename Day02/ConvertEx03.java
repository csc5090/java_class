package Day02;

public class ConvertEx03 {

	public static void main(String[] args) {
		
		// 자바언어에서 + 연산 기호 특징.
		// 1. 숫자 + 숫자 에서는 덧셈을 한다.
		// 2. 숫자 + 문자 에서는 문자를 우선해서 숫자가 문자로 변경된다.
		// 그래서 문자 + 문자가 되어 서로를 연결한다. 즉, 문자열 연결 연산기호로 사용된다.
		
		
		int a = 100;
		int b = 100;
		int c = a + b;
		System.out.printf("%d + %d = %d \nc", a, b, c);
		
		String result = a+"10"; // 숫자 + 문자에서 문자를 우선해서 숫자가 문자로 치환. 결국 문자 + 문자가 된 셈.
		System.out.printf("result = %s \n", result);
		
		// %s는 문자열 출력형태 지시자.
		
		

	}

}
