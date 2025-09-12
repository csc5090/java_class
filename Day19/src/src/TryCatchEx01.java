package src;


/* 2025 - 09 - 12
 * 개발자 : 최상철
 * 
 * try ~ catch 문으로 예외 처리)
 * 	try{
 * 		정상구문이 실행되다가 예외가 발생하면 아래 문장을 수행하지 않고 예외 처리 해당 catch{}로 이동하여 예외를 처리한다. 
 *		...
 *		} catch (예외처리클래스 매개변수) {
 *		예외처리; }
 *	  
 * 
 *  
 * 
 */


//자바는 정수숫자를 0으로 나누면 예외가 발생함.
public class TryCatchEx01 {

	public static void main(String[] args) {
		int a = 10, b01=0, b02=2, c=10;
		
		try {
			c= a / b02;
			System.out.println("(1) c = "+c);
			
			c = a / b01; //정수 숫자 10을 0으로 나누어서 예외가 발생함 -> 아래 문장 수행x. 해당 catch 블록문으로 제어가 이동하여 예외처리.
			System.out.println("(2) c = "+c); 
			
			c = a / b02;
			System.out.println("(3) c = "+c);
		} catch (Exception e) { // Exception은 예외처리 부모클래스
			System.out.print("예외 발생 : "+e); // java.lang.ArithmeticException: by zero 예외 에러가 정수 숫자 0으로 나우었을 떄 뜨는 에러.
			
		}
		System.out.println("tyr 구문 수행 후 c = "+c);
	}

}
