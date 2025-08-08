package Day3;

import java.util.Scanner;

public class OprTest06 {

	public static void main(String[] args) {
		
		/* if(조건식){
		 * 		조건식이 참이면 실행;
		 * 		} else {
		 * 		조건식이 거짓이면 실행;
		 * }
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
				
				System.out.print("양의 정수 숫자만 입력 >>");
				
				String inputA = scan.nextLine(); // 문자열로 입력받는다.
				
				int inputNumber = Integer.parseInt(inputA); //정수 숫자로 변경
				
				if(inputNumber > 0) {
					if(inputNumber % 2 == 1) {
						System.out.println(inputNumber+"는(은) 홀수이다.");
					} else {
						System.out.println(inputNumber+"는(은) 짝수이다.");
					} 
					
				} else {
						System.out.printf("%s \n", "양의 정수 숫자만 입력하세요!");
				} //if else
					
		}
	}


