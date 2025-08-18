package Day04_;

public class ForEx06 {

	public static void main(String[] args) {
		
		/* .for 반복문안에 if ~ else 조건문과 % 나머지 연산을 사용한 홀수/짝수들의 누적합
		 * .for 반복문을 각각 사용해서 짝수/홀수들의 누적합 
		 */
		
		int i;
		int odd_tot, even_tot; // 홀수 누적합, 짝수 누적합
		
		// for,if~else,%
		
		for(i=1,odd_tot=0,even_tot=0; i<=10; i++) {
			if( i % 2 == 1) { //나머지가 1일 때는 홀수일 때 실행
				odd_tot = odd_tot + i; // 홀수들의 누적합				
			} else { // 나머지가 2일 때는 짝수일 때 실행
				even_tot += i; // 짝수들의 누적합 				
			}
		}
		System.out.printf("홀수들의 누적합=%d\n", odd_tot);
		System.out.println("짝수들의 누적합="+even_tot);
		
		// 홀수들의 누적합
		odd_tot = 0;
		for(i=1; i<=10; i=i+2) {
			odd_tot += i;
		}
		System.out.println("홀수들의 누적합 = "+odd_tot);
		
		// 짝수들의 누적합
		for(i=2, even_tot=0; i<=10; i=i+2) {
			even_tot = even_tot + i;
		}
		System.out.println("짝수들의 누적합 = "+even_tot);
	}

}
