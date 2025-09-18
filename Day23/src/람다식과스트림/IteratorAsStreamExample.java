package 람다식과스트림;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorAsStreamExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동","이순신","강감찬"); // 배열을 컬렉션 List로 변환
		
		/* Iterator를 사용해서 컬렉션의 다음 원소값을 읽어옴 -> 컬렉션에 저장하는 용도로 사용하는 컬렉션 자료구조는 아님.
		 * 한 번 사용하면 다시 사용 못 한다. 다시 사용할려면 재생성해야한다.*/
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {//다음 원소값이 있다면 참
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println("\n ============== \n");
		
		//스트림 사용
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));//람다식 사용. 컬렉션 원소값을 더 간결한 코드로 읽어오기.
		
		

	}

}
