package Coding_Test_;

import java.util.Scanner;

public class cscscsc {

	public static void main(String[] args) {
		/*
		 * // 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는
		 * F를 // 출력하는 프로그램을 작성하시오. // 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은
		 * 정수이다.
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.print("시험 점수를 입력하세요 >> "); int score = scanner.nextInt();
		 * 
		 * if (score >= 90) { System.out.printf("입력받은 점수 %d는 A 학점입니다.", score); } else
		 * if (score >= 80) { System.out.printf("입력받은 점수 %d는 B 학점입니다.", score); } else
		 * if (score >= 70) { System.out.printf("입력받은 점수 %d는 C 학점입니다.", score); } else
		 * if (score >= 60) { System.out.printf("입력받은 점수 %d는 D 학점입니다.", score); } else {
		 * System.out.printf("입력받은 점수 %d는 F 학점입니다.", score);
		 */

		/*
		 * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
		 * 
		 * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은
		 * 눈)×100원의 상금을 받게 된다. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다. 예를 들어,
		 * 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로
		 * 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이
		 * 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
		 * 
		 * 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
		 */
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.print("첫번째 주사위 값 입력 >>"); int dice1 = scanner.nextInt();
		 * System.out.print("두번째 주사위 값 입력 >>"); int dice2 = scanner.nextInt();
		 * System.out.print("세번째 주사위 값 입력 >>"); int dice3 = scanner.nextInt();
		 * 
		 * int jackpot; if (dice1 == dice2 && dice2 == dice3) { jackpot = 10000 + (dice2
		 * * 1000); } else if (dice1 == dice2 || dice2 == dice3 || dice1 == dice3) { int
		 * Prize2 = Math.max(Math.max(dice1, dice2), dice3); jackpot = 1000 + (Prize2 *
		 * 100); } else { int Prize3 = Math.max(Math.max(dice1, dice2), dice3); jackpot
		 * = Prize3 * 100; }
		 * 
		 * System.out.print("당신의 상금은" + jackpot);
		 */
		
		int h = 23;
		int m = 59;
		
		int originH = h;
		int originM = m;
		
		if (h >= 24) {
			originH = 0;
		}		
		if (m > 59) {
			originM = 0;
			String a = "00";
			System.out.printf("알람 시간 : %d : %s", originH,a);
		}
		
	}

}