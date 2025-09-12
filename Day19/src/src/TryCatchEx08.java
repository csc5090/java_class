package src;

/* 2025 - 09 - 12
 * 개발자 : 최상철
 * 
 * for 반복문 안에서 try~catch문 예외 처리
 * 
 * 
 */


public class TryCatchEx08 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i=1;i<=10;i++) {
			try {
				result = number / (int)(Math.random() * 10); // ramdom정적메서드는 0.0이상 1.0미만 실수 숫자 난수가 발생.
				// *10 하면 0.0이상 10.0미만 사이 실수 숫자 난수 -> (int)로 캐스팅하면 소수점이하는 버리고 0이상 10미만 사이 정수 숫자 난수.
				// 즉. 0부터 9사이의 정수 숫자 난수가 발생.
				
				System.out.println("result ="+result);
			} catch(ArithmeticException ae) {
				System.out.println("0"); // 정수 숫자 난수가 0일때 예외 에러가 발생해서 출력된다.
			}
			
		}

	}

}
