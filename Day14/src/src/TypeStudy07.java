package src;

import java.util.Scanner;

public class TypeStudy07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("-100부터 100사이의 정수 숫자만 입력>>");

		int a = Integer.parseInt(scan.nextLine());

		if (a >= -100 && a <= 100) {
			if (a > 0) {
				System.out.println(a + "는 양수입니다.");
			} else if (a < 0) {
				System.out.println(a + "는 음수입니다.");
			} else {
				System.out.println(a + "는 0 입니다.");
			}

		} else {
			System.out.println("-100부터 100사이의 정수 숫자만 입력하세요!");
		}

	}

}
