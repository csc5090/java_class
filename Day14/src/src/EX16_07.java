/*
 * 6번 문제
 * 
 * 자바 소스는 강의 교안을 참고하고, 이 소스의 실행 결과를 주석문으로 처리한다.
 * 
 */

package src;

class Base {
	Base() {
		System.out.print("Base");
	}
}

class Alpha extends Base {
}

public class EX16_07 {
	public static void main(String[] args) {
		new Alpha();
		new Base();
	}
}


// BaseBase
//컴파일러의 규칙(모든 생성자는 반드시 첫 줄에서 부모 생성자를 호출해야 한다)에 따라 base(){},자식 클래스 alpha 내에도 내 가장 첫 줄에 super(); 가 추가됨.