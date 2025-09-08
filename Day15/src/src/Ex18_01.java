package src;

/* 2025 - 09 - 08
 * 
 * 개발자 : 최상철
 * 
 * 18장 1번 문제.
 * 추상클래스와 final.pdf 1번 문제
 * 부모 추상클래스의 추상메서드는 상속받은 자손클래스에서 모두 오버라이딩을 해야한다는 강제성이 부여된다. 
 */
abstract class Abs1 {
	int a = 10;
	String str = "Test";

	public abstract int getA();

	public String getStr() {
		return str;
	}
}

abstract class Abs2 extends Abs1 {
	int b = 100;

	public abstract int getB();
}

class AbsMain extends Abs2 {

	@Override
	public int getA() {
		return this.a;
	}

	@Override
	public int getB() {
		return this.b;
	}

}

public class Ex18_01 {

	public static void main(String[] args) {
		AbsMain am = new AbsMain();
		System.out.println(am.getA());
		System.out.println(am.getB());

	}

}
