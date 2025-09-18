package 람다식과스트림;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

/* 2025 - 09 - 18
 * java.util.function 패키지의 Consumer 계열의 내장 함수형 인터페이스 특징) 
 * 	1. 매개값(인자값)은 있고, 리턴값은 없다.(void)
 * 	
 * 
 */



public class ConsumerExample {

	public static void main(String[] args) {
		
		Consumer<String> consumer = t -> System.out.println(t+"21");
		consumer.accept("Java ");
		
		BiConsumer<String,String> biConsumer = (t,u) -> System.out.println(t+u);
		biConsumer.accept("Oracle", " 21c Express Edition");
		
		DoubleConsumer doubleConsumer = value -> System.out.println("Java "+value);
		doubleConsumer.accept(21.0);
		
		ObjIntConsumer<String> objIntConsumer = (t,value) -> System.out.println(t + value);
		objIntConsumer.accept("Java ", 21);
		
	}
	

}
