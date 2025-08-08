package Day3;
import java.util.Scanner;
public class OprTest05 {

	public static void main(String[] args) {
		
		/* if 조건문 형식
		 * if(조건식)
		 * 	조건식이 참이면 실행;
		 * 
		 * 실행 문장이 한 줄 이상이면 반드시 {} 중괄호 블록으로 묶어야 한다.
		 * 한줄이면 {}를 해도 되고, 안해도 된다.
		 */
		
		// 스캐너로부터 입력받은 정수 숫자값이 음의 정수일 때 절대값을 구하라.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("음의 정수 숫자 입력>>");
		int number = Integer.parseInt(scan.nextLine()); // 문자열로 입력받아 정수 숫자로 변경
				
		if(number < 0) {
			number = number;
		} //if
		
		System.out.printf("양의 절대값 = %d \n", number);
		
		
		
		
		
		
	}

}
