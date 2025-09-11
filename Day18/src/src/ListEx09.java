package src;

import java.util.ArrayList;
import java.util.List;

/* 2025 - 09 - 11
 * 개발자 : 최상철
 * 
 * 컬렉션에 제네릭을 지정함으로서 불필요한 업캐스팅과 다운캐스팅을 하지 않아도 된다.
 * 
 * 
 */
public class ListEx09 {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<String>();
		// <String> 문자열 타입만 저장 가능한 컬렉션 제네릭 지정, 업캐스팅 하면서 컬렉션 제네릭 객체 nameList생성

		nameList.add("hong gil dong");
		nameList.add("lee sun shin");
		// 타입이 맞지 않아 컴파일 에러 발생. nameList.add(100);

		String result = "";
		for (int i = 0; i < nameList.size(); i++) { // size() 메서드는 컬렉션 원소 개수 즉 크기를 반환
			result = nameList.get(i);
			System.out.println(result.toLowerCase()); // 영문이름을 대문자로 변경 후 출력
		}
		System.out.println("\n ================> \n");

		// 자바 5버전에서 추가된 향상된 확장 for문을 사용해서 컬렉션 또는 배열에 저장된 복수개의 원소값을 읽어오는 용도로 활용.

		for (String name : nameList) {
			System.out.println(name.toUpperCase());
		}

	}

}
