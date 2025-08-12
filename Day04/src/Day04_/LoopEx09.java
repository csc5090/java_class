package Day04_;

public class LoopEx09 {

	public static void main(String[] args) {

		// for반복문을 이용한 7단 구하기와 1부터 100까지의 누적합계 구하기.

		int i; // 반복문 제어 변수
		int guguDan = 2;

		System.out.println("<========== " + guguDan + "단 ==========>");

		for (i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", guguDan, i, guguDan * i);
		}
		System.out.println("\n =============== \n");

		// 1부터 100까지 자연수 정수의 누적합.

		int sum = 0;
		for (i = 1; i <= 100; i++);
		{
			sum = sum + i; // sum += i
		}
		System.out.println("1부터 100까지의 누적합은 " + sum);
	}
}