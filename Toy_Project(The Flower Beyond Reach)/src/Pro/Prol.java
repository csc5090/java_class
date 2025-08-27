package Pro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prol {

	static void clearConsole() {
		for (int i = 0; i < 14; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		Scanner ans = new Scanner(System.in);

		System.out.println("기본적인 조작은 0 || 1 을 입력하는 것으로 이루어집니다.");
		System.out.println("예를 들면 이런 식입니다.\n============================");
		System.out.println(" 다음 설명을 들어 보시겠습니까?\n\n [0] : 들어본다.\n [1] : 안 듣고 그냥 끈다.\n============================");

		System.out.print("당신의 대답은? => ");
		
		try {
		int choice = ans.nextInt();
		if (choice == 0) {
			clearConsole();
			System.out.print("좋습니다. 게임을 시작합니다.");
		} else if (choice == 1) {
			clearConsole();
			System.out.print("그래봤자 0으로 진행할 생각이고, 그래야합니다. run 다시 누르세요.");
		} else {
			clearConsole();
			System.out.print("예외처리도 해놨어요. run 다시 누르세요.");
		}
	} catch (InputMismatchException e) {
		clearConsole();
		System.out.print("문자열 예외처리 : try catch ㅋㅋ");
	}
}
}