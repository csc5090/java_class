package src;

import java.util.Stack;

/* java.util 패키지의 컬렉션 클래스 Stack
 * 
 * 1. jdk 1.0에서 추가된 컬렉션 클래스이다.
 * 2. 입구와 출구가 같기 때문에 가장 먼저 입력된 데이터가 가장 나중에 출력되는 구조이다.
 * 3. 가장 나중에 입력된 데이터가 가장 먼저 나가는 구조이다.(Last Input First Output 구조: LIFO)
 * 
 */

public class ListEx06 {

	public static void main(String[] args) {

		Stack myStack = new Stack();

		myStack.push("1-java"); // push() 메서드로 스택의 맨위에 원소값을 추가.
		myStack.push("2-oracle");
		myStack.push("3-html");
		myStack.push("4-css");

		while (!myStack.isEmpty()) {// 스택이 비어있지 않다면 반복

			System.out.println(myStack.pop());

			/*
			 * pop()는 스택 맨 위의 원소를 제거하면서 반환한다. 따라서 입력된 값이 역순으로 출력된다.
			 * 
			 */

		}
	}
}
