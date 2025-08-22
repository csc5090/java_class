package src;

public class ArrayTest03 {

	public static void main(String[] args) {

		// 가변 배열(레그드 배열, 레기드 배열) 이란?
		// 2차원 이상의 다차원 배열을 생성할 때 행의 길이는 고정시키고 각 행의 열의 길이는 지정하지 않고 나중에 각각 열의 길이를 가변적으로
		// 설정해서
		// 배열을 생성함으로써 고정된 형태의 배열이 아닌 각 열의 길이가 유동적인 배열을 말한다.

		// 가변 배열 생성 형식)
		// int[][] score = new int [5][]; 행의 길이는 5로 고정시키고, 각 행의 열의 길이는 지정하지 않는다.

		final int MAX_ROWS = 5; // final로 선언된 변수는 수정할 수 없는 변수, 즉 상수이다. 상수는 관례적으로 영문대자문자로 설정하고, 반드시 최초값을 저장하는 초기화
		// 과정을 해야 한다.

		int[][] ragged = new int[MAX_ROWS + 1][]; // 행의 길이를 6으로 고정시키고 각 행의 열의 길이는 지정하지 않은 가변 배열 'ragged' 생성

		for (int r = 0; r <= MAX_ROWS; r++) {
			ragged[r] = new int[r + 1]; // 각 행의 열의 길이(크기)를 구함(첫번째 행의 길이는 1, 6번째 행의 길이는 6)
		} // for

		// 일반 이중 for 반복문으로 가변배열 원소값 초기화

		for (int r = 0; r < ragged.length; r++) { // ragged.length는 행의 길이 6을 반환
			for (int c = 0; c < ragged[r].length; c++) { // ragged[r].length는 각 행의 열의 길이를 반환
				ragged[r][c] = c;
			}

		}
		for (int r = 0; r < ragged.length; r++) {
			for (int c = 0; c < ragged[r].length; c++) {
				System.out.print(" " + ragged[r][c]);
			} // inner for
			System.out.println();
		}

	}

}
