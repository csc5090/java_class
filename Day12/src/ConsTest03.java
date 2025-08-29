/* 2025년 8월 28일
 * 개발자 : 최상철 
 * 
 * 클래스 초기화 블록 static { } 을 활용한 정적배열 초기화.
 *
 */

import java.util.Random;

public class ConsTest03 {

	static int[] arr = new int[10]; // 배열 크기가 10인 정적배열
	static int[] arr02 = new int[10];

	static {

		/*
		 * 문제01) 1부터 10까지 정수 난수로 일반 for문을 사용해 정적배열 arr 배열 원소값을 초기화 해 보자.
		 */

		// 답안.

		for (int a = 0; a < arr.length; a++) {
			arr[a] = (int) (Math.random() * 10) + 1;
		}

		// 두번째 방법.

		Random r = new Random();

		for (int i = 0; i < arr02.length; i++) {
			arr[i] = r.nextInt(10) + 1; // random(10) 내장 메서드는 0이상 10미만 사이 정수 숫자 난수 발생.
		}

	}

	public static void main(String[] args) {

		// 문제 02) jdk 1.5(자바5)에서 추가된 향상된 확장 for를 사용해서 arr 정벅 배열 원소값을 출력해 보자.

		for (int a : arr) {
			System.out.print(" " + a);
		}
		System.out.println("\n ===================== \n");

		// 두 번째 정적배열인 arr02 배열 원소값 출력

		for (int b : arr02) {
			System.out.print("  " + b);
		}

	}

}
