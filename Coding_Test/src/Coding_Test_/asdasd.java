package Coding_Test_;

import java.util.Scanner;

public class asdasd {

	public static String star(int cnt) {
		String ret = "";
		for (int i = 0; i < cnt; i++) {
			ret += "*";
		}
		return ret;
	}

	public static void main(String[] args) {

		// 1과 5 사이 중 2의 배수의 합

		Scanner scan = new Scanner(System.in);

		System.out.print("첫수 입력하기 >> ");
		String a = scan.nextLine();
		System.out.print("둘째수 입력하기 >> ");
		String b = scan.nextLine();
		System.out.print("배수 입력 >> ");
		String c = scan.nextLine();

		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		int cc = Integer.parseInt(c);

		int sum = 0;

		for (int i = aa; i < bb; i++) {
			if (i % cc == 0) {
				sum = sum + i;
			}
		}
		System.out.println(a + "와" + b + "사이의" + c + "배수의 합은" + sum + "입니다.");

		System.out.println("첫 별수를 입력하시오.");
		String a1 = scan.nextLine();
		System.out.println("끝 별수를 입력하시오.");
		String b1 = scan.nextLine();

		int aa1 = Integer.parseInt(a1);
		int bb1 = Integer.parseInt(b1);

		for (int i = aa1; i <= bb1; i++) {
			System.out.println(star(i));
		}

		// System.out.println(star(1));
		// System.out.println(star(2));
		// System.out.println(star(3));

		// 홀/짝을 선택하세요.
		// 나:홀
		// 상대:짝
		// random함수 쓰기. 0~1사이를 이용. 0~0.5까지 홀, 0.5~1 짝
		// 결과 : 홀홀 = 이김[나머지 패배]

		String mine = "";
		String com = "";
		String result = "";

		System.out.print(" 홀/짝을 선택하세요.");
		mine = scan.nextLine();

		if (Math.random() > 0.5) {
			com = "홀";
		} else {
			mine = "짝";
		}

		if (com.equals(mine)) {
			result = "승리";
		} else {
			result = "패배";
		}

		System.out.println(mine);
		System.out.println(com);
		System.out.println(result);

	}
}
