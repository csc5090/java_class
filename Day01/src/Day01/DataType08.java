package Day01;

public class DataType08 {

	public static void main(String[] args) {
		
		/* 자바에서 + 연산기호의 특징.
		 * 1. 숫자 + 숫자는 덧셈을 한다.
		 * 2. 숫자 + 문자 or 문자 + 숫자에서는 문자를 우선해 숫자가 문자로 치환.
		 * 그래서 결국 문자 + 문자라는 결과 산출.
		 * 여기서 +는 문자열 연산 기호이다.
		 */ 
		
	 System.out.println(7+7+""); // 숫자 + 숫자는 덧셈. 14 + "" -> "14"
	 
	 
	// 정수 7과 + 연산기호, """를 활용해 "77"이 나오게.
	 
	 System.out.println(""+7+7);
	 
	 
	 
	}

}
