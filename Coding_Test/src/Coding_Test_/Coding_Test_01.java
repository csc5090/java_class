package Coding_Test_;

import java.util.Scanner;

public class Coding_Test_01 {

	public static void main(String[] args) {
		
		//1번 문제 답
		
		int a = 7;
		int b = 3;
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;
		
		System.out.printf("%d %d %d %d \n", c,d,e,f);
		
		//2번 문제 답
		double x1 = 5.5;
		double y1 = 2.0;
		
		double xy1 = x1 + y1;
		double xy2 = x1 - y1;
		double xy3 = x1 * y1;
		double xy4 = x1 / y1;
		
		System.out.printf("%.2f %.2f %.2f %.2f",xy1,xy2,xy3,xy4);
		
		//3번 문제 답
		int x2 = 10;
		
		int x523 = x2 + 5;
		int x524 = x2 - 5;
		int x525 = x2 * 5;
		int x526 = x2 / 5;
		
		System.out.println( x523 + x524 + x525 + x526 );
		
		
		//4번 문제 답
		int score = 85;
		String result = (score >= 60) ? "합격" : "불합격";
		System.out.println(result);
		
		
		//5번 문제 답
		int num = 17;
		String result2 = (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		System.out.println(result2);
		
		//6번 문제 답
		
		int a1 = 10;
		int b1 = 20;
		int c1 = 30;
		
		double result3 = (a1+b1+c1) / 3.0;
		System.out.println(result3);
		
		//7번 문제 답
		int celsius = 30;
		double fahrenheit = celsius * 9.0/5 + 32;
		System.out.println(fahrenheit);
		
		//1번 문제 답
		int r = 5;
		double fr = 3.14 * (2.5 * 2);
		double fr2 = r * 3.14;
		System.out.println(fr+"\n"+fr2);
		
Scanner scanner = new Scanner(System.in);
		
		System.out.print("1 이상 정수를 입력하세요 >> ");
		int a123 = scanner.nextInt();
		System.out.println("입력받은 정수 >>"+a123);
		
		if (a123 > 0) {
			System.out.println("입력받은 정수"+a123+"는 양수 입니다.");
		} else if(a123 == 0) {
			System.out.println("입력받은 정수"+a123+"는 0 입니다.");
		} else {
			System.out.println("입력받은 정수"+a123+"는 음수입니다.");
		}
		
		
		//2번 문제 답
		System.out.println("정수를 입력하세요 >> ");
		int a1234 = scanner.nextInt();
		String qqq = a1234 % 2 == 0 ? ("짝수입니다.") : ("홀수입니다.");
		System.out.println("입력하신 수"+a1234+" 는 "+qqq);
		
		
		//3번 문제 답
		
		
		
		
		
		}
	
	
}