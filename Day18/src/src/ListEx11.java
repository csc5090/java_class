package src;

import java.util.HashMap;
import java.util.Map;

/* 2025 - 09 - 11
 * 개발자 : 최상철
 * 
 * java.util 패키지의 컬렉션 Map 인터페이스를 구현 상속한 컬렉션 클래스 HashMap 특징)
 * 1. Map과 HashMap은 자바 1.2(2)버전에서 추가됨.
 * 2. 키,값 쌍으로 저장되는 영어 사전적인 컬레션 자료구조이다. 저장되는 순서를 보장하지는 않는다.
 * 3. 키를 통해서 값을 검색하기 때문에 검색 속도가 빠르다.
 * 
 * 
 * 
 */

public class ListEx11 {

	public static void main(String[] args) {
	
		Map<String,Integer> m = new HashMap<>(); // 앞부분 제네릭 타입만 봐도 뒷 부분 제네릭 타입이 무엇인지 추론이 가능함. 자바 7버전부터는 뒷부분 제네릭 타입은 생략.
		
		String[] sample = {"to","be","or","not","to","be","is","a","p"};
		
		//문자열 키에 포함된 단어 빈도수 계산.
		
		for(String k:sample) {
			Integer freq = m.get(k);//키에 대한 값을 구함
			m.put(k, (freq == null ? 1:freq+1));//키,값 쌍으로 저장 -> 키 값인 영어 단어에 대한 단어 빈도수가 계산되어 값으로 저장
		}
		
		System.out.println(m.size()+" 개의 단어가 있습니다."); //7
		System.out.println(m.containsKey("to")); // to 키가 맵에 포함되어 있다면 참, 없다면 거짓 => true
		System.out.println(m); // 맵 자료 출력
		
	}

}
