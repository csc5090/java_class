package src;

/* 2025 - 09 - 12
 * 개발자 : 최상철
 * 
 * 예외가 발생했을 때 try~catch 블록문 실행순서 : 1 2 4 5
 * 
 * 
 */

public class TryCatchEx11 {

	public static void main(String[] args) {
		
		System.out.println(1);
		
		try {
			System.out.println(2);
			System.out.println(100/0); // 정수 숫자를 0으로 나누면 예외가 발생해서 아래문장 수행하지 않고 catch 블록문으로 제어순서가 이동한다.
			System.out.println(3);
		} catch(Exception e) {
			System.out.println(4); // 예외가 발생하면 실행함.
		}
		System.out.println(5);
	}

}
