package 자바평가문제;

public class Java_Exam04 {

	public static void main(String[] args) {

		// 자바 평가문제 3) while 반복문을 사용해서 7단 구구단을 출력되게 해보자.
		// 같은 반복문을 사용해서 1부터 100까지의 누적합을 구하는 자바 코드를 만들어보자.

		int a = 7;
		int b = 1;
		while (b <= 9) {
			int sum = a * b;
			System.out.println("7" + "*" + b + "=" + sum);
			b++;
		}

		System.out.println("\n ================= \n");

		int sum = 0;
		a = 1;
		while (a <= 100) {
			sum+=a;
			a++;
			// sum=sum+a++;(위와 같은 것.)
		}
		System.out.print(sum);
	}

}
