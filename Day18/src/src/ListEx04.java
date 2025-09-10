package src;

import java.util.ArrayList;
import java.util.ListIterator;

/* java.util 패키지의 Iterator 인터페이스를 구현 상속한 ListIterator 인터페이스의 특징)
 * 1. 자바 2버전에서 추가됨.
 * 2. Iterator를 상속받아서 기능을 추가한 것으로 컬렉션 저장된 복수개의 원소값을 읽어올 때 양방향 이동이 모두 가능하다.
 * 다만, List컬렉션 인터페이스를 구현 상속한 자손 컬렉션 클래스인 ArrayList, LinkedList 등 에서만 사용가능하다.
 * 
 */

public class ListEx04 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		ListIterator it = list.listIterator();

		// 순방향으로 읽어옴.

		while (it.hasNext()) { // 다음 원소값이 있다면 참.
			System.out.print(" " + it.next()); // next() 메서드로 다음 원소값을 읽어옴.
		}

		System.out.println("\n ============== \n");

		while (it.hasPrevious()) {
			System.out.print(" " + it.previous());// 이전 원소값을 읽어옴.
		}

	}

}
