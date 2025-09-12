package src;

/* 2025 - 09 - 12
 * 개발자 : 최상철
 *  
 * 1. throw : 인위적 예외를 발생시킬 때 사용.
 * 		형식) throw new 예외클래스 생성자;
 * 
 * 2. throws : 발생된 예외를 자신이 직접 처리하는 것이 아니라 자신을 호출한 곳으로 떠 넘기면서 예외를 처리한다.
 * 		형식) public 리턴타입 메서드명(매개변수 ...) throws 예외처리클래스{ 실행문장; }
 */

public class TryCatchEx06 {
	static void exp(int data) throws NullPointerException {
		if(data == 0) 
			throw new NullPointerException();//인위적 예외 발생.
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println("예외 발생하기 전");
			exp(0);
			System.out.println("메서드 호출 후 예외 발생"); // 이 문장은 수행 하지 않음.
		} catch(NullPointerException ne) {
			ne.printStackTrace();
		}
		

	}

}
