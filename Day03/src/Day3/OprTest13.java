package Day3;

import java.util.Scanner;

public class OprTest13 {

	public static void main(String[] args) {

		/*
		 * 스캐너를 활용해서 정수숫자를 입력받은 다음 if조건문을 사용하여 숫자 0을 입력했을 때 '입력한 숫자는
		 * 0입니다."라 출력되게 하고, 0이 아닐 때는 "입력하신 숫자는 0이 아닙니다."라고 출력.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> ");
		int input = Integer.parseInt(scan.nextLine());
		if (input == 0) {
			System.out.print("입력하신 숫자는 0입니다.");
		}
		if (input != 0) {
			System.out.print("입력하신 숫자는 0이 아닙니다.");
		}
	}

}
