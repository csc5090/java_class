package Day04_;

import java.util.Scanner;

public class Ex06_02 {

	public static void main(String[] args) {
		
		// 1부터 입력받은 값까지의 홀수 출력하는 프로그램을 작성하시오.(Ex06_02.java -> for 반복문 사용)
		// 단, 하나는 for 반복문에서 1씩 증가하면서 if 조건문과 %나머지 연산을 사용해야 함.
		// 다른 하나는 for 반복문은 2씩 증가하면 된다.
		
		 Scanner scan = new Scanner(System.in);
		 System.out.print("1 이상의 수 입력 >>");
		 int count = scan.nextInt();
		 
		 for ( int i=1; i<=count; i++ ) {
			 if (i % 2 == 1 ) {
				 System.out.printf(i + " " ); }
		 }
		 System.out.println("\n =======> \n");
		 int i=1;
		 for ( i=1; i<=count; i+=2 ) {
			 if (i % 2 == 1 ) {
				 System.out.printf(i + " " ); }
		 }
	}
}