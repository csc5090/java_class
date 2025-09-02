/* 2025 - 09 - 02
 * 16장. 상속.pdf no.20 1번문제)
 * 
 * 접근 권한이 잘못된 번호를 기술하고, 보다 더 합리적인 자바 OOP로 변경해보자.(불필요한 코드 제거).
 */

class Parent {
	private int a; // 프라이빗은 같은 클래스 내에서만 사용 가능하기 때문에 변경해야 함. 혹은 아래에서 this.a가 아닌, get,set을 써야함.
	int b;
	protected int c;
	public int d;

	protected int getA() {
		return a;
	}

	protected void setA(int a) {
		this.a = a;
	}

}

class Child extends Parent {
	public Child(int a, int b, int c, int d) {
		setA(a); // [1] // get,set을 이용.
		this.b = b; // [2]
		this.c = c; // [3]
		this.d = d; // [4]
	}

	void func() {
		System.out.println(getA()); // [5]
		System.out.println(b); // [6]
		System.out.println(c); // [7]
		System.out.println(d); // [8]
	}
}

class Ex16_2 {
	public static void main(String[] args) {
		Child one = new Child(1, 2, 3, 4);
		one.func();
		System.out.println(one.getA()); // [9]
		System.out.println(one.b); // [10]
		System.out.println(one.c); // [11]
		System.out.println(one.d); // [12]
	}
}

public class Ex16_2 {

	public static void main(String[] args) {

	}

}

// 이런식으로 수정한다면 가독성이 좋지 않으니, private을 건드리는게 낫지 않나 싶습니다.
// 만약 이게 프로젝트라면, 내가 작성한 클래스가 아니기 때문에 private을 걸어둔 이유가 있겠거니 싶어 이런식으로 작성하였습니다.
