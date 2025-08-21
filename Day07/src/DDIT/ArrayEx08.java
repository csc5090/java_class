package DDIT;

public class ArrayEx08 {

	public static void main(String[] args) {

		// 배열 총합과 평균을 구하는 예제 소스

		int sum = 0; // 배열 원소 누적합.
		double average = 0.0; // 평균

		int[] javaScore = { 100, 88, 100, 100, 90 };

		// 문제) 자바 5(jdk1.5)버전에서 추가된 향상된 확장 for 반복문을 사용해서 자바 점수 총 합을 구하고 원소값도 출력해 보시오.
		// 그리고 sum을 (double)타입으로 캐스팅해서 평균도 구하라.

		for (int aa : javaScore) {
			sum += aa;
		}
		average = (double) sum / javaScore.length;

		System.out.println("배열의 합 : " + sum);
		System.out.print("배열 평균 값 : " + average);
	}

}
