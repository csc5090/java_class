package Day04_;

public class Ex07_03 {

	public static void main(String[] args) {
		// 1부터 100사이의 짝수를 출력하되 한줄에 10개씩 출력하시오. (Ex07_03.java -> for, if, %)

		// 2 4 6 8 10 12 14 16 18 20
		// 22 24 26 28 30 32 34 36 38 40
		// 42 44 46 48 50 52 54 56 58 60
		// 62 64 66 68 70 72 74 76 78 80
		// 82 84 86 88 90 92 94 96 98 100

		// 단, 하나는 2씩 증가되는 for 반복문, 또 다른 하나는 if 조건문, %나머지 연산, == 같다 비교 연산등을
		// 활용한 1씩 중가되는 for 반복문을 각각 사용한다.

		int start = 1;
		
		for (int i = start; i <= 100; i++) {
			if (i % 2 == 0 && i <= 100) {
				System.out.print(i+" ");
				
				if ( i % 20 == 0) {
				System.out.print("\n");
				}
			}
		}
		
		
		/*
		 * for ( int i=2;i<=100;i+=2) { System.out.print(i+" ");
		 * 
		 * if(i % 20 == 0) { //20 배수일 때 실행 System.out.println(); } }
		 * System.out.println("\n ============= \n");
		 */
	}

}


	