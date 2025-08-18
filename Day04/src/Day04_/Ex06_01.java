package Day04_;

import java.util.Scanner;

public class Ex06_01 {

	public static void main(String[] args) {
		// 문자와 숫자를 입력받아 문자를 입력받은 숫자만큼 반복 출력하시오
		
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("반복할 문자를 입력 >> ");
		 String inputString = scan.nextLine();
		 System.out.print("반복할 횟수(숫자)를 입력 >> ");
		 
		 int count = Integer.parseInt(scan.nextLine());

		for(int i=1; i<=count; i++) {
			System.out.println(i+"번 "+inputString);
		}
	}
}
