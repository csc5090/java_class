package src;

/* 생성자의 특징)
 * 
 * 1. 생성자 이름은 클래스 이름과 동일하게 만든다.
 * 2. new 클래스명();에 의해서 생성자를 호출한다.
 * 3. 생성자의 주된 기능은 클래스 소속의 멤버변수 중 인스턴스 변수 초기화 기능이다.
 * 4. 생성자 메서드의 일종으로 오버로딩이 가능하다.
 * 
 * 
 */

class Cons01 {
	int a;
	int b;

	public Cons01() {
	} // 매개변수가 없는 기본생성자.

	public Cons01(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void pr() {
		System.out.println("a=" + a + " ,b=" + b);
	}

}

public class ConsTest01 {
	public static void main(String[] args) {

		Cons01 c01 = new Cons01(10, 20); // 전달인자 2개짜리 오버로딩 된 생성자를 호출.
		c01.pr();
	}
}
