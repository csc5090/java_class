package Day3;

import java.util.Scanner;

public class OprTest07 {

	public static void main(String[] args) {
		
		/* if ~ else 조건문을 활용한 최대,최소값을 구하는 프로그램. */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 숫자 값 입력>>");
		int a = Integer.parseInt(scan.nextLine());
		
		System.out.print("두번째 정수 숫자 값 입력>>");
		int b = Integer.parseInt(scan.nextLine());
		
		int max = 0; //  최대값을 저장할 변수 선언과 초기화.
		int min = 0; // 최소값을 "
		
		if(a >b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}  //if else
		
		System.out.printf("최대값 == %d \n", max);
		System.out.printf("최소값 == %d \n", min);
	}

}
