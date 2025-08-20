package src;

import java.util.Scanner;

public class BreakEx_08 {

	public static void main(String[] args) {

		/*
		 * while, for 무한 루프문을 사용한 여름 음식 메뉴 선택 프로그램) 다중 반복문을 중단하기 위해서 임의의 이름붙는 반복문인 레이블명을
		 * 지정한다.
		 */

		int menuNumber = 0; // 메뉴 번호
		int moneyPrice = 0; // 계산할 값

		Scanner scan = new Scanner(System.in);

		exit_loop: // 다중 반복문을 중단하기 위한 임의의 레이블명 지정
		while (true) {
			System.out.println("1 - 밀면");
			System.out.println("2 - 물냉면");
			System.out.println("3 - 삼계탕");
			System.out.print("원하는 여름 음식 메뉴를 입력(1~3)하세요.\n(종료:0) >> ");
			
			menuNumber = Integer.parseInt(scan.nextLine());

		} //while 무한루프문 
	}

}
