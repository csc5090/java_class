package Day02;

import java.util.Scanner;

public class ConvertEx06 {

	public static void main(String[] args) {
		
		/* 자바의 논리연산자 종류)
		 * 1. 논리 연산자 결과값은 boolean 타입인 true or false이다.
		 * 2. 논리 연산자 종류)
		 * 	가. && : 입력값 모두 true이면 결과값도 true이다. 나머지는 모두 false. 
		 * 	나. || : 2개의 조건 중 하나라도 참이면 결과값도 참이다.
		 *  다. !  : 입력값이 T라면 결과값은 f. f라면 t.
		 */
		
		boolean result = true;
		result = (true && true);
		System.out.printf("%b && %b : %b\n", true,true,result);
		
		result = (false || false);
		System.out.println("false || fasle : "+ result);
		
		result = !false;
		System.out.println("!fasle : "+ result);
		
		Scanner scan = new Scanner(System.in);
		String resultAnswer = "";
		
		System.out.print("나이 입력>>");
		int age = Integer.parseInt(scan.nextLine());
		
		resultAnswer = (age >= 20 && age <= 29) ? "20대이다." : "20대가 아니다.";
		System.out.println(age+"세는 "+resultAnswer);
		
	}

}
