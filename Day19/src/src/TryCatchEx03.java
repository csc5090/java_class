package src;

/* 2025 - 09 - 12
 * 개발자 : 최상철
 * 
 * try~catch 문에서 예외가 발생하든 발생하지 않든 무조건 마지막에 수행해야 하는 문장을 넣을 때는 finally{} 블록문에 기술한다.
 * 
 * 
 */

public class TryCatchEx03 {

	public static void main(String[] args) {
		int a=10, b01=0, b02=2, result=0;
		
		try {
			result = a/b02;
			System.out.println("[1] result = "+result);
			
			result = a/b01; // 예외 발생 -> 아래 문장 수행하지 않고 해당 catch 블록문으로 이동
			System.out.println("[2] result = "+result); // 수행 안함.
			
			result = a/b02;//수행 안함
			System.out.println("[3] result ="+result);
			
		} catch(ArithmeticException ae) {
			ae.printStackTrace();//예외 족적을 남김.
		} catch(Exception e) {
			System.out.println("예외 에러 : "+e);
		} finally {
			System.out.println("예외와 상관없이 무조건 마지막에 실행");
		}

	}

}
