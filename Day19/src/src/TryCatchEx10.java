package src;

/* 2025 - 09 - 12
 * 개발자 : 최상철
 * 
 * 예외가 발생하지 않았을 때 try~catch 블록문 실행순서 : 1 2 3 5
 * catch는 예외가 발생하지 않으면 실행되지 않는다.
 * 
 * 
 */

public class TryCatchEx10 {

	public static void main(String[] args) {

		System.out.println(1);

		try {
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4); // 예외가 발생하지 않으면 이 부분 문장 수행 안함.
		}
		System.out.println(5);
	}

}
