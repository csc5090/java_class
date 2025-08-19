package Day04_;

public class Ex07_04 {

	public static void main(String[] args) {

		// 구구단 프로그램. 오른쪽으로 쭉 출력 (각 단 마다 줄바꿈)

		int sum;
		
		for (int middle = 1; middle <= 9; middle++) {
			for (int start = 2; start <= 9; start++) {
				sum = start * middle;
				System.out.printf("%d * %d = %2d\t", start, middle, sum);
			}
			System.out.println();
		}

	}

}
