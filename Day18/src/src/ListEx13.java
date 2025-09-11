package src;

import java.util.ArrayList;

/* 2025 - 09 - 11
 * 개발자 : 최상철
 * 
 * 제네릭 타입간의 레퍼런스 간의 형변환은 허용되지 않는다. 안 되는 이유는 제네릭 타입들 간에는 상속 관계가 성립되지 않으며, 만약 허용된다면
 * 타입 안정성이 깨질 수 있기 때문이다. 때문에 자바 컴파일러가 이를 막는다.
 * 따라서 자바 컴파일러는 이를 엄격히 제한하여 컴파일 단계에서 오류를 발생시킨다.
 */

public class ListEx13 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		ArrayList<Object> objlist;
		objlist = list;
		
		for(Object obj:objlist) {
			System.out.println(obj);
		}
	}

}
