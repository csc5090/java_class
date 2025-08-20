package src;

public class Ex08_01 {

	public static void main(String[] args) {
		//08장. 제어문을 보조하는 보조 제어문.
		
		// 1. 1부터 100사이의 자연수 중 제일 큰 7의 배수를 구하는 프로그램 작성하기.
		// 단, 100부터 1까지 1씩 감소하면서 반복하지 말고 1부터 100까지 1씩 증가하면서 반복해야 함.
	
		/* 교수님 코드
		 * int sevenMax = 0;
		 * for(int i=1; i<= 100, i++) {
		 * if(i % 7 == 0) {
		 * sevenMax = i;
		 * }
		 * } //for
		 * System.out.printf("7의 배수 중 가장 큰 숫자=%d \n", sevenMax);
		 */
		
		// 1씩 감소하는 코드
		int i; // 반복문 제어 변수
		int sixMax = 0;
		for(i=100; i>=1; i--) {
			if(i % 6 == 0) {
				sixMax = i;
				break;
			}
		}
		System.out.println("6의 배수 중 최대값 = "+i);
		System.out.printf("6의 배수 중 가장 큰 숫자 = %d \n", sixMax);
		
		int result = 0;
		for ( int start = 1; start <= 100; start++) {
			if ( start % 7 == 0) {
				result = start;
			}
		}
		System.out.println(result);
		
		
		int seven = 1;
		int result2 = 0;
		
		while (seven <= 100) {
			if (seven % 7 == 0) {
				result2 = seven;
			}
			seven++;
		}
		System.out.println(result2);
	}
}
