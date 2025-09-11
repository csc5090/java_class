package src;

import java.util.Enumeration;
import java.util.Hashtable;

/* 2025 - 09 - 11
 * 개발자 : 최상철
 * 
 * java.util 패키지의 Map 컬렉션 인터페이스를 구현 상속한 자손인 Hashtable 컬렉션 클래스 특징
 *  1. 키,값 쌍으로 저장
 *  2. 키를 통해서 값을 검색하기 때문에 검색 속도가 빠르다.
 *  3. 저장되는 순서를 보장하지 않는다.
 *  4. Hashtable 컬렉션 클래스는 자바 1(jdk1.0) 초기 버전에서 추가됨.
 *  
 * 
 */

public class ListEx10 {

	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<String, String>(); // 키,값 쌍으로 문자열만 저장 가능한 컬렉션 제네릭 타입

		ht.put("apple", "사과"); // 키, 값 쌍으로 저장
		ht.put("orange", "오렌지");
		ht.put("grape", "포도");

		String value = ht.get("apple"); // apple 키에 대한 값을 구함.
		if (value != null) {
			System.out.println("apple" + value);
		}

		Enumeration<String> enum2 = ht.keys(); // keys() 메서드는 모든 키에 대한 Enumeration 반환.
		while (enum2.hasMoreElements()) {// 읽을 수 있는 요소가 있다며 참.
			String k = enum2.nextElement(); // 다음 키를 가져옴.
			String v = ht.get(k);
			System.out.println(k + " : " + v);
		} // while
	}
}
