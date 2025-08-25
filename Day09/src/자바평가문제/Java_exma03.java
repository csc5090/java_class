package 자바평가문제;

public class Java_exma03 {

	public static void main(String[] args) {

		// for 반복문을 이용해서 1부터 10까지의 자연수 중에서 4의 배수를 뺀 총합을 구하는 코드를 작성해본다.

		int sum = 0;

		for (int a = 1; a <= 10; a++) {
			if (a % 4 == 0) {
				continue;
			}
			sum += a;
		}
		System.out.println(sum);

		sum = 0;

		for (int a = 1; a <= 10; a++) {
			if (!(a % 4 == 0)) {
				sum += a;
			}
		}
		System.out.println(sum);

	}

}
