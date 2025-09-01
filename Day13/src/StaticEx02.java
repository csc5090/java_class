/* 2025 - 09 - 01
 * 개발자 : 최상철
 * 
 * 정적 메서드 내에선 인스턴스변수와 this를 사용할 수 없다.
 * 
 */

class St02 {
	static int a = 10;
	int b = 20;

	public static void printA() { // 정적메서드
		System.out.println(a);
		System.out.println(this.b); // 정적메서드 내에서는 this를 사용할 수 없음.

	}

	public static void printB() {// 정적메서드
		System.out.println(b); // 정적메서드 내에서는 인스턴스 변수 사용할 수 없음.
	}

	public void printC() {// 인스턴스 메서드
		System.out.println(this.b);
		System.out.println(b);
		System.out.println(a); // 인스턴스 메서드 내에서는 this, 인스턴스 변수,정적 변수 모두 사용 가능.
	}

}

public class StaticEx02 {

	public static void main(String[] args) {
		St02 abc = new St02();
		abc.printC();

	}

}
