package Day04_;

public class LoopEx12 {
	
	/* for 반복문에서 초기치,증갑식이 각 2개 나오고, 이중 for 반복문 실습 */

	public static void main(String[] args) {
		
		for(int i=1, j=5; i<=5; i++, j--) {
			System.out.printf("%d \t %d \n", i,j);
		} 
		System.out.println("\n =========== \n");
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(" #");
			}
			System.out.println();
		}
	}

}
