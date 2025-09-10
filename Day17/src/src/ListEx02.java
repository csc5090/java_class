package src;

import java.util.ArrayList;
import java.util.List;

/* 2025 - 09 - 10
 * 개발자 : 최상철
 * 
 * java.util 패키지의 List 컬렉션 인터페이스를 구현 상속한 ArrayList 컬렉션 클래스 특징(제일 중요함!)
 * 
 * 1. 저장되는 순서를 보장한다.
 * 2. 중복원소값을 허용한다.
 * 3. 자바 2(jdk 1.2) 버전에서 추가됨.
 * 
 */

public class ListEx02 {

	public static void main(String[] args) {

		List list = new ArrayList(); // 업캐스팅하면서 컬렉션 list생성.

		list.add("seoul");
		list.add("seoul");
		list.add(7);
		list.add(10.7);
		list.add(true);
		list.add(7);

		System.out.printf("list 컬렉션 크기(원소개수)=%d \n", list.size());
		System.out.println(list);

		// 일반 for반복문으로 원소값 출력

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
