package Day3;

public class Ex04_01 {

	public static void main(String[] args) {
		
		// 04장.연산자.pdf no.22 1번문제
		// 짝수인지 홀수인지 판단하는 삼항 조건 연산자를 작성하라.
		
		
		int Data = 6;
		
		String OutData = (Data % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println(OutData);
		
		int num01 = 7, num02 = 8;
		String result = "";
		
		result = (num01 % 2 == 0) ? "짝수":"홀수"; // %는 나머지연산.
		System.out.println(num01 + "은 "+result+"이다.");
		
		result = (num02 % 2 == 1) ? "홀수" : "짝수";
		System.out.printf("%d은 %s이다. \n", num02, result); //%s는 문자열 출력형태
		
		
		
	}

}
