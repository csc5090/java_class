package Day04_;

public class LoopEx10 {

	public static void main(String[] args) {
		
		// while 반복문 형식)
		// while(조건식){
		// 조건식이 참일동안만 반복실행;
		// 증감식;
		// }  
		
		// for 반복문과 while 반복문 비교

		int i;
		for (i=5; i>=1; i-=1) {
			System.out.print(" "+i);
		}  
		System.out.println("\n ============== \n");
		
		
		i=10;
		while (i>=0) {
			System.out.print(" "+i);
			i-=2; // 2씩 감소		
		} 
		System.out.println("\n =============== \n");
		
		//while 반복문을 이요한 홀수들의 누적합.
		
		int total = 0;
		i=1;
		while(i<10) {
			total += i;
			i+=2;    //2씩 증가.
		}
		System.out.printf("홀수들의 누적합 = %d  \n", total);
	}
}
