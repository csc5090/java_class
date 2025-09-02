package Pro;

import java.util.InputMismatchException;
import java.util.Scanner;
import Util.Push;

/* 1. 필수 기능들
 * 
 * 1-1) 출력문들(메서드에 담긴 스크립트 PUSH, 메인 대사, 시스템안내문 등)
 * 1-2) 호감도와 그림 완성도
 * 1-3) 다중엔딩
 * 1-4) 미니 이벤트
 * 1-5) 시간대(낮,밤)+시간별로의 행동들.
 * 1-6) 상점....(각 보고)
 * 
 */
public class Prol {

	public static void main(String[] args) {
		Scanner ans = new Scanner(System.in);

		System.out.println("기본적인 조작은 0 || 1 을 입력하는 것으로 이루어집니다.");
		System.out.println("예를 들면 이런 식입니다.\n============================");
		System.out.println(" 다음 설명을 들어 보시겠습니까?\n\n [0] : 들어본다.\n [1] : 안 듣고 그냥 끈다.\n============================");
		System.out.print("당신의 대답은? => ");

		try {
			int choice = ans.nextInt();
			if (choice == 0) {
				Push.Clear();
				System.out.print("좋습니다. 게임을 시작합니다.");
			} else if (choice == 1) {
				Push.Clear();
				System.out.print("run 다시 누르세요.");
			} else {
				Push.Clear();
				System.out.print("예외처리-run 다시 누르세요.");
			}
		} catch (InputMismatchException e) {
			Push.Clear();
			System.out.print("문자열 예외처리 : try catch");
		}
	}
}
