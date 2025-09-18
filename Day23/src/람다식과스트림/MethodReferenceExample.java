package 람다식과스트림;

import java.util.function.IntBinaryOperator;

/* 2025 - 09 - 18
 * 개발자 : 최상철
 * 
 * IntBinaryOperator 함수형 인터페이스를 활용하여 람다식을 정적메서드 참조와 인스턴스 메서드 참조로 변환.
 * 
 * 
 */

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		IntBinaryOperator operator;
		/* 내장 함수형 인터페이스 IntBinaryOperator
		 * 1. 이 함수형 인터페이스에 정의된 추상메서드 int applyAsInt(int left, int right)는 int 타입 2개 매개값을 가지고 연산한 다음
		 * 동일한 타입 int로 연산 결과값을 반환한다.
		 */
		
		operator = (left,right) -> Calculator.staticMethod(left, right);//람다식
		System.out.println("덧셈 결과값 =" + operator.applyAsInt(10, 10));
		
		//우의 람다식을 정적메서드 참조로 변경
		operator = Calculator :: staticMethod; //정적메서드 참조(클래스명 :: 정적메서드)
		System.out.println("덧셈 결과값2="+ operator.applyAsInt(5, 5));
		
		//람다식 -> 인스턴스 메서드 참조로 변환
		Calculator obj = new Calculator();
		operator = (x,y) -> obj.instanceMethod(x, y); 
		System.out.println("곱셈 결과값 = "+operator.applyAsInt(7, 7));
		
		operator = obj :: instanceMethod; //인스턴스 메서드 참조
		System.out.println("곱셈 결과값 = "+ operator.applyAsInt(10, 10));

	}

}
