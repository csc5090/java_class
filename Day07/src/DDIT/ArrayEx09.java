package DDIT;

public class ArrayEx09 {

	public static void main(String[] args) {

		// 배열 원소 최대값과 최소값 구하기

		int[] score = { 100, 90, 80, 99, 98 };

		int max = score[0]; // 첫번째 배열 원소값을 최대값으로 초기화.
		int min = score[0]; // 첫번째 배열 원소값을 최소값으로 초기화.

		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) { // 해당 배열 원소값이 최대값보다 크면
				max = score[i]; // 해당 배열값이 최대값이 된다.
			} else if (score[i] < min) { // 해당 배열원소값이 최소값보다 작으면
				min = score[i]; // 해당 배열원소값이 최소값이 된다.
			}
		}

		System.out.println("배열원소 최대값 = " + max);
		System.out.println("배열원소 최소값 = " + min);

	}

}