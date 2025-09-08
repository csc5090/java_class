/*
 * if 조건문 형식)
 *
 * 
 * 
 */

package default1;

import java.util.Scanner;

public class TypeStudy06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("#### 1부터 100사이 정수 숫자만 입력>>");

		int number = Integer.parseInt(scan.nextLine());

		if (!(number >= 1 && number <= 100)) {
			System.out.println("1부터 100사이의 정수만 입력하세요!");
		} else {
			if (number % 2 == 0) {
				System.out.println(number + "는 짝수입니다!");
			}

			if (!(number % 2 == 0)) {
				System.out.println(number + "는 홀수입니다.");
			}
		}

	}

}
