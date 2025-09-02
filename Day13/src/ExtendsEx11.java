/* 2025 - 09 - 02
 * 개발자 : 최상철
 * 
 * 부모 클래스와 동일한 멤버변수 자손에서 정의된 경우 부모로부터 상속 받은 멤버변수명에 접근할 때는 super.변수명으로 접근하고 
 * 자손에서 정의된 동일 멤버변수명에 접근할 때는 this.변수명 또는 this.은 생략하고 변수명으로 접근한다.
 * 
 */

class Parent11 {
	int a = 10;
}

class Child11 extends Parent11 {
	int a = 20;

	void pr() {
		System.out.println("a=" + a); // this.이 생략됨. 20
		System.out.println("this.a=" + this.a); // 20
		System.out.println("super.a=" + super.a); // 10
	}
}

public class ExtendsEx11 {

	public static void main(String[] args) {

		Child11 ch01 = new Child11();
		ch01.pr();

	}

}
