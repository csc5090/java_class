package Day3;

import java.util.Scanner;

public class OprTest08 {

	public static void main(String[] args) {
		
		
		// if else if 다중 조건문(선택문) 문법
		// if(조건) {
		//     조건식이 참일 때 실행할 식;
		// } else if {
		//	조건식2가 참일 때 실행;
		// } else {
		// 조건식 1,2가 모두 거짓일 때 실행할 식;
		// }
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 숫자값 입력>>");
		
		 int a = Integer.parseInt(scan.nextLine());
		 
		if (a > 0) {
			System.out.println(a+"는(은) 양수이다.");
		} else if (a < 0) {
			System.out.println(a+"는(은) 음수이다.");
		} else {
			System.out.println("0 이다.");
		} 
            System.out.println("정수만 기입해주십시오.");
}
	
}