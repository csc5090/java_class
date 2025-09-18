package 람다식과스트림;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferExample {

	public static void main(String[] args) {
		
		
		/* Function 내장 함수형 인터페이스 특징)
		 * 1. 인자값도 있고, 리턴값도 있다. 인자값을 리턴값으로 타입변환 해준다.
		 * 
		 */
		
		Function<Integer,Member2> fun01 = Member2 :: new;
		Member2 member01 = fun01.apply(7);
		
		BiFunction<String,Integer,Member2> fun02 = Member2 :: new;
		Member2 member02 = fun02.apply("홍길동", 25);
	}

}
