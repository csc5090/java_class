package Day04_;

import java.util.Scanner;

public class SwitchEx05 {

	public static void main(String[] args) {

		/* 중첩 switch ~ case 문 사용 예) */

		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.print("주민번호 입력(981212-1234567) >>"); String juminNumber =
		 * scan.nextLine(); char juNo = juminNumber.charAt(7);
		 */// charAt(7) 내장메서드는 첫 문자를 0부터 시작해서 뒷자리 첫번째 단일문자를 구함.
			// 즉 8번재 단일문자를 구함.
		/*
		 * switch (juNo) { case '1': case '3': switch (juNo) { case '1':
		 * System.out.println("당신은 2000년 이전에 태어난 남자입니다."); break; case '3':
		 * System.out.println("당신은 2000년 이후에 태어난 여자입니다."); break; } break;
		 * 
		 * case '2': case '4': switch (juNo) { case '2':
		 * System.out.println("당신은 2000년 이후에 태어난 남자입니다."); break; case '4':
		 * System.out.println("당신은 2000년 이후에 태어난 여자입니다."); break; } break; default :
		 * System.out.println("유효하지 않은 주민번호입니다."); }
		 */

		/*
		 * System.out.println("\n ================= \n");
		 */
		/* 문제) 위의 중첩 switch ~ case 다중조건문을 중첩 if else if 다중 선택문으로 변경해 보자. */

		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.print("주민번호 입력(981212-1234567) >>"); String juminNumber =
		 * scan.nextLine(); char juNo = juminNumber.charAt(7);
		 * 
		 * if (juNo == '1' || juNo == '3') {
		 * System.out.print("당신은 2000년대 이전에 태어난 남자입니다."); } else if (juNo == '2' || juNo
		 * == '4' ) { System.out.print("당신은 2000년대 이전에 태어난 여자입니다."); } else if (juNo ==
		 * '5' ) { System.out.print("당신은 외국인 남자입니다."); } else if (juNo == '6' ) {
		 * System.out.print("당신은 외국인 여자입니다."); } else {
		 * System.out.print("올바른 값을 입력하세요.") }
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호 입력(981212-1234567) >>");
		String juminNumber = scan.nextLine();
		char juNo = juminNumber.charAt(7);

		if (juNo == '1' || juNo == '3') {
			if (juNo == '1') {
				System.out.print("당신은 2000년대 이전에 태어난 남자입니다.");
			} else { // '3'
				System.out.print("당신은 2000년대 이후에 태어난 남자입니다.");
			}
		} else if (juNo == '2' || juNo == '4') {
			if (juNo == '2') {
				System.out.print("당신은 2000년대 이전에 태어난 여자입니다.");
			} else { // '4'
				System.out.print("당신은 2000년대 이후에 태어난 여자입니다.");
			}
		} else {
			System.out.print("올바른 값을 입력해주십시오.");
		}
	}
}