package Day04_;

import java.util.Scanner;

public class SwitchEx03 {
	public static void main(String[] args) {

		/* if else if 다중 조건문을 활용한 봄,여름,가을,겨울 구하기 */

		Scanner scan = new Scanner(System.in);
		System.out.print("1월부터 12월 사이 월만 입력>>");
		int month = Integer.parseInt(scan.nextLine());

		if (!(month >= 1 && month <= 12)) {
			System.out.println("1월부터 12월 사이 월만 입력!");
		}
		if (month == 6 || month == 7 || month == 8) {
			System.out.print("입력하신 " + month + "는(은) 여름입니다.");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.print("입력하신 " + month + "는(은) 가을입니다.");
		} else if (month == 12 || month == 1 || month == 2) {
			System.out.print("입력하신 " + month + "는(은) 겨을입니다.");
		} else if (month == 3 || month == 4 || month == 5) {
			System.out.print("입력하신 " + month + "는(은) 봄입니다.");
		}
	}

}
