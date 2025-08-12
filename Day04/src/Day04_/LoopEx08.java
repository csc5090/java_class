package Day04_;

public class LoopEx08 {

	public static void main(String[] args) {
		
		// 명확한 횟수가 정해진 경우 사용하는 for 반복문 형식 )
		// for(초기치; 조건식; 증감식) {
		// 조건식이 참일동안만 반복; }
		
		int i;
		for (i=1; i<=5; i++) {
			System.out.println(i+"번 java");
		}
		System.out.println("\n ===============> \n");
		
		//5부터 1까지 1씩 감소하면서 반복
		
		for(i=5; i>=1; i--) {
			System.out.print("\t"+i); } // \t는 탭키만큼 공백
		System.out.println("\n ==========> \n");
		
		//2 4 6 8 10 출력
		for(i=2; i<=10; i+=2) { //i+=2는 복합대입연산자. 2씩 증가하고, i=i+2와 같음.
			System.out.print(i+" ");
		}
		System.out.println("\n =============> \n");
		
		// 1 3 5 7 9 
		for(i=1; i<10; i=i+2) {
			System.out.print(i+" ");
		}
	}

}
