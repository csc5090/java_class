/*
 * 
 * 16장 상속.dpf 5번문제
 *  에러가 나는 이유에 대해 주석문 처리.
 */

package src;


class TestSuper { // extends Object이 생략됨.
	//생성자가 오버로딩 되면 자바는 더 이상 매개변수가 없는 기본생성자를 묵시적 제공하지 않음.
	}

	class TestSub extends TestSuper{  
	} // 답안 : 에러가 나는 이유는 부모 클래스 생성자가 오버로딩이 되었기 때문에 자바는 더이상 부모의 기본생성자를 묵시적 제공을 하지 않는다.
	  // 	   하지만 자손에서 부모의 기본생성자를 호출하려다가 컴파일 에러가 나는 것이다.

	class Ex16_06{
		public static void main(String [] args) {
			new TestSub();
		}
	}