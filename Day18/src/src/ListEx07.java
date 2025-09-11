package src;

import java.util.LinkedList;

/* 2025 - 09 - 11
 * 개발자 : 최상철
 * 
 * java.util 패키지의 Queue 컬렉션 인터페이스를 구현 상속한 컬렉션 클래스 LinkedList 특징)
 * 	1. 입구와 출구가 달라서 가장 먼저 입력된 자료가 가장 먼저 나가는 구조이다.(First Input First Output : FIFO )
 *  	
 */

public class ListEx07 {

	public static void main(String[] args) {

		LinkedList myQue = new LinkedList(); // 업캐스팅하면서 myQue컬렉션 객체를 생성

		myQue.offer("1-java"); // offer() 메서드로 큐에 원소값 추가.
		myQue.offer("2-Oracle");
		myQue.offer("3-Html");

		System.out.println("myQue 컬렉션에서 2번째 중간 원소값 가져오기 = "+myQue.get(1));//get(주소 인덱스 번호) 메서드는 첫번째 원소값 주소 인덱스 번호 0부터
																			   // 시작해서 해당 인덱스 번호의 컬렉션 원소값을 반환한다.
		
		while (myQue.peek() != null) { // 큐가 비어있지 않으면 반복
			System.out.println(myQue.poll()); // poll() 메서드로 큐에서 데이터 꺼내고 제거, 큐의 맨 앞 원소를 반환하고 제거	
		}
	}
}
