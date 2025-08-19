package Day04_;

public class Ex07_01 {

	public static void main(String[] args) {
		
		// 22부터 76까지 짝수의 개수와 그 합을 구하는 프로그램 작성
		// 짝수의 개수 -> 28
		// 그합 -> 1372
		// 짝수의 개수를 구할때는 ++ 증가 연산자
		// 단, 2씩 증가된 for 반복문과 1씩 증가된 for 반복문을 각각 사용한다.
		// 1씩 증가된 반복문 안에서는 if 문과 나머지연산 %,== 비교연산자 등을 사용.
		
		//a=짝수의 개수
		//b=짝수의 합
		
		
		int i; //반복문 제어 변수
		int count = 0;//짝수들의 개수를 카운터해서 저장할 변수
		int sum = 0;//짝수들의 누적합을 저장할 변수
		
		//2씩 증가
		for (i=22; i<=76; i+=2) {
			count++; //짝수들의 개수를 카운터
			sum+=i; // 짝수들의 누적합
		}
		System.out.printf("짝수들의 개수=%d \n", count);
		System.out.printf("짝수들의 누적합=%d \n", sum);
		System.out.println("\n ============= \n");
		
		int j,cnt,total; // 반복문 제어 변수, 짝수개수, 짝수 누적합
		
		for(j=22, cnt=0, total=0; j<=76; j++) {
			if(j % 2 == 0) {//나머지가 0일때(짝수일 때) 실행
				cnt++; //짝수의 개수를 센다
				total=total+j;//짝수들의 누적합
			}
			
		}
		System.out.println("짝수들의 개수 =" + cnt);
		System.out.println("짝수들의 누적합 = "+total);
}
}
