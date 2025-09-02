package default1;

import java.util.Scanner;

public class TypeStudy05 {

	public static void main(String[] args) {

		/*
		 * 삼항연산자
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 숫자 나이만 입력>>");
		int age = Integer.parseInt(scan.nextLine());

		String result = null;
		result = (age >= 20 && age <= 29) ? "20대이다." : "20대가 아니다.";

		System.out.printf("입력하신 나이 %d살은 %s \n", age, result);

	}

}
