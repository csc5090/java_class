package src;

/* 2025 - 09 - 15
 * 개발자 : 최상철
 * 	
 * 생성자는 상속 되지 않는다. 부모 클래스의 생성자가 오버로딩 되면 전달인자가 없는 기본생성자를 묵시적 제공하지 않는다.
 * 이럴 때 자손 클래스에서 부모의 묵시적으로 제고오디지 않는 기본생성자를 호출하려다가 컴파일 에러가 난다.
 * 
 * 컴파일 에러를 방지하기 위한 첫 번째 방법은 부모클래스 기본 생성자를 명시적 코드를 하면 됩니다.
 */

class Mother03 {
	int a;
	int b;

	public Mother03() {
	}

	public Mother03(int a, int b) {
		this.a = a;
		this.b = b;
	} // 전달인자 2개짜리 생성자 오버로딩 -> 기본생성자 묵시적 제공을 안 한다.

}

class Child03 extends Mother03 {
	int c;

	public Child03() {
	}

	public Child03(int a, int b, int c) {
		super(a, b); // 부모클래스 오버로딩 된 생성자 호출
		this.c = c;
	}

	public void pr() {
		System.out.println("a=" + a + " ,b=" + b + " ,c=" + c);
	}

}

public class ConsTest03 {

	public static void main(String[] args) {
		Child03 ch03 = new Child03(10, 20, 30); // 전달인자 3개짜리 오버로딩 된 생성자 호출.
		ch03.pr();
	}

}
