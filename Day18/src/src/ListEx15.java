package src;

import java.util.Arrays;
import java.util.List;

/* 2025 - 09 - 11
 * 개발자 : 최상철 
 * 
 * 두번째 제네릭 와일드카드 문법
 * <?> 모든 객체 타입 배치가 가능하다.
 */

public class ListEx15 {
	static void printList(List<?> list) {
		
		/* 
		 * List<?> 에서 <?>는 모든 객체타입을 허용한다.
		 */
		
		for(Object obj:list) {
			System.out.print(" "+obj);
		}
		System.out.println("\n ============== \n");
		
	}
	
	public static void main(String[] args) {
		List<Integer> li01 = Arrays.asList(10,20,30); // Arrays.asList()는 배열을 컬렉션 List로 변환
		printList(li01);
		
		List<String> li02 = Arrays.asList("one", "two");
		printList(li02);
	}


}
