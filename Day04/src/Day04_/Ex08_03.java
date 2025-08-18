package Day04_;

import java.util.Scanner;

public class Ex08_03 {

	public static void main(String[] args) {
		
		// 10부터 1사이의 짝수를 10, 8, 6, 4, 2로 출력하는 프로그램을 작성하시오.
		// 단 2출력하고 ,가 출력 안되게 해야한고, while 반복문을 사용해야 한다.
		
		 int i = 10;
		 while (i >= 2) {
		     System.out.print(i);
		     if (i > 2) {
		         System.out.print(", ");
		     }
		     i -= 2;
		 }
		 // 다른 코드
		 int i = 10;
		 while(i>=4) {
			 System.out.print(i+","); // 10 8 6 4
			 i-=2; // 2씩 감소하고 다시 위로 올려서 반복
		 }
		 System.out.print(i);
	}
}
