package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* java.util ㅍ ㅐ키지의 Iterator 인터페이스의 특징)
 * 
 * 1.자바 2에서 추가됨.
 * 2. 컬렉션에 저장된 복수개의 데이터를 읽어 오는 용도로 사용된다. 저장되는 용도로 사용하는 컬렉션 자료 구조는 아니다.
 * 3. 한 번 읽어 온 자료는 다시 읽어 오지 못 한다. 다시 읽어오기 위해서는 재생성해야 한다.
 * 4. 단방향으로만 데이터를 읽어온다.
 * 5. 주로 자바2에서 추가된 컬렉션과 잘 맞는다.
 * 
 */

public class ListEx03 {

	public static void main(String[] args) {
		
		List<E> list = new ArrayList();
		
		list.add("홍길동");
		list.add(1000);
		list.add(true);
		list.add("홍길동");
		list.add("서울시");
		
		Iterator elements = list.iterator();
		while(elements.hasNext()) { // 다음 원소값이 있다면 true
			System.out.println(elements.next()); // next() 메서드로 다음 원소값을 가져온다.			
		}
		
		

	}

}
