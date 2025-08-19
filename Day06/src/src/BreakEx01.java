package src;

public class BreakEx01 {

	public static void main(String[] args) {

		// break 문 특징 ) 반복문 내에서 break문을 만나면 해당 문을 중단한다.

		int i;

		// 1부터 10까지 반복
		for (i = 1; i <= 10; i++) {
			System.out.print(" " + i);
		}
		System.out.println("\n ========= \n");

		// 4의 배수일 때 중단

		for (i = 1; i <= 10; i++) {
			if (i % 4 == 0) {// 4의 배수일 때 실행
				break;
			}
			System.out.print(" " + i); // 1 2 3
		}

	}

}
