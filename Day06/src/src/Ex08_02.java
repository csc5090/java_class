package src;

import java.util.Random;

public class Ex08_02 {

	public static void main(String[] args) {

		// 제어문을 보조하는 보조 제어문 2번 문제.
		// 1부터 50까지의 자연수 중에서 4의 배수만 뺀 누적합을 구하기.
		// 단, while 반복문만 사용해야 한다.
		// 주의할 점 : while{} 블록문 내에서 ++ 증가치 연산을 continue 문 다음에 넣으면 안된다.

		int sum = 0;
		int i = 0;
		while (i < 50) {
			i++;

			if (i % 4 == 0) { // 4의 배수일 때 실행
				continue;
			}
			sum += i; // 4의 배수만 뺀 누적합을 구한다.
		} // while
		System.out.printf("4의 배수만 뺀 누적합 = %d \n", sum);
		System.out.println("\n ================= \n");

		// 문제) for 무한루프문과 java.util패키지의 Random 유틸리티 클래스 하위의 nextInt(6) 내장메서드를
		// 활용해서 임의의 주사위수를 구하는 자바 프로그램을 만들어 보고, 임의의 주사위 수가 4 일 때
		// for 무한루프문을 종료시켜 본다. 임의의 주사위 정수는 난수가 된다.

		Random Dice = new Random();
		for (;;) {
			int diceRoll = Dice.nextInt(6) + 1;
			System.out.println("주사위 결과: " + diceRoll);

			if (diceRoll == 4) {
				System.out.println("4가 나왔습니다. 루프를 종료합니다.");
				break;
			}
		}
		
		for(int ia = 0; ; i++) {
			int diceRoll = Dice.nextInt(6) + 1;
			System.out.println("주사위: " + diceRoll);
			
			if (diceRoll == 4) {
				System.out.println("4 나와서 끝!");
				break;
			}
		}
		
		// 교수님 코드
		// for(;;){
		// Random R = new Random();    new 키워드로 새로운 객체명 r을 생성.
		// int diceNumber = r.nextInt(6)+1;    netxInt(6) 내장 메서드는 0~6미만 사이의 정수 난수를 구함.
		// 여기에 +1하면 1이상 7미만. 1~6사이의 정수 난수를 구함.
		
		// System.out.println("임의의 주사우 ㅣ눈의 수="diceNumber);
		// if(diveNumber == 4) {
		// break;
		// }
	}

}
