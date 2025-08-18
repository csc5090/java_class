package Day04_;

public class Ex06_04 {

	public static void main(String[] args) {
		
		// A부터 Z사이의 알파벳 출력하는 프로그램을 작성하시오.(Ex06_04.java -> for 반복문 사용 ) 
		// 단, 하나는 for 반복문과 int 타입을 사용해야 함.
		// 또 다른 하나는 for 반복문과 char 타입을 사용해야 한다.
		// 자바에서 증감 연산자(++,--)는 자료 손실이 없는 더 큰 타입으로 자동형변환하지 않는다.
		
		for ( int A = 65; A <=90; A++) {
			char ASK = (char) A;
			System.out.println(ASK);
		}
		
		for (char A=65; A <= 90; A++) {
			System.out.println(A);
		}
		
		//교수님 답
		
		//int 타입
		for(int i='A'; i<='Z'; i++) {
			System.out.print(" "+ (char)i);
		}
		
		System.out.println("\n ======================== \n");
		
		//char 타입
		for(char i='A'; i<='Z';i++) {
			System.out.print(" "+i);
		}
		
		
	}

}
