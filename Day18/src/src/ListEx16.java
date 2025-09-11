package src;

import java.util.Arrays;
import java.util.List;

/* 2025 - 09 - 11
 * 개발자 : 최상철
 * 
 * 제네릭 와일드 카드 3번째 문법 형식)
 * <? super Integer> -> Integer 타입의 조상(부모)만 제네릭 타입간의 형변환을 제한적으로 허용한다.(하한 제한 와일드 카드)
 * 
 * 
 * 
 */




public class ListEx16 {
	
	static void addNumber(List<? super Integer> list) {
		
		for(int i = 0; i<list.size(); i++) {
			System.out.print(" "+list.get(i));
		}
		System.out.println("\n ============= \n");

	}

	public static void main(String[] args) {
		
		Number[] arr = {10,20,30};
		Object[] arr02 = {100,200,300};
		
		List<Number> li = Arrays.asList(arr);
		addNumber(li);
		
		List<Object> li02 = Arrays.asList(arr02); //배열을 컬렉션 List로 변환.
		addNumber(li02);
		

	}


}
