package 람다식과스트림;

import java.util.function.IntSupplier;

/* java.util.function 패키지의 Supplier 계열의 내장 함수형 인터페이스 특징)
 * 1. 매개값(인자값)은 없고, 인자값은 있다.
 * 
 */

public class SupplierExample {

	public static void main(String[] args) {
		
		IntSupplier intSupplier = () -> {
			/* 문제) Math.random() 정적메서드를 사용하여 1~6 사이의 임의의 정수 숫자 난수를 발생해 그 값을 리턴하여 임의의 주사위 눈의 
			 * 구하는 코드 작성.
			 * 
			 * 
			 */
			int Dice = (int)(Math.random() * 6) +1;
			return Dice;
		};
			
			int result = intSupplier.getAsInt();
			System.out.println("주사위 : "+result);
		
	}
}

