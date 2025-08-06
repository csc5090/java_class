package Day02;

public class ConvertEx04 {

	public static void main(String[] args) {
		
		/* 자바의 비교/관계 연산자 종류
		 * 1. 비교연산자 결과값은 true or false 인 boolean 타입이다.
		 * 2. 비교연산자 종류 :
		 * 	  > , >= , <, <=, 
		 * 
		 */
		
		boolean flag = false;
		flag = (7>2);
		System.out.printf("7  > 2  : %b \n",  flag);
		
		flag = (7 == 2);
		System.out.println("7 == 2 : " + flag);
		
		flag = (7 != 2);
		System.out.println("7 != 2 : "+ flag);
		
		int a=10;
		int b=3;
		flag  = (a+b) < (a-b);
		System.out.println((a+b) + " < "+(a-b) + " : "+ flag);
		
		


	}

}
