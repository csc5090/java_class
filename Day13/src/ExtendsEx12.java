/* 2025 - 09 - 02
 * 개발자 : 최상철
 * 
 * this() : 상속과 관련이 없다. 같은 클래스 내에서 오버로딩 된 다른 생성자를 호출할 때 사용한다.
 * 
 */

class Father12 { // extends Object이 생략됨.
	int x = 10;
	int y = 20;

	Father12(int x, int y) {
		this.x = x;
		this.y = y;

	}// 전달인자 2개짜리 생성자 오버로딩 -> 생성자가 오버로딩 되면 자바는 더 이상
}

class Son12 extends Father12 {
	int z = 30;

	Son12() {
		this(100, 200, 300); // 같은 클래스 내의 전달인자 3개짜리 오버로딩 된 다른 생성자 호출

		/* 1. 자바의 생성자 {} 블록내에서 this() 또는 super()를 사용하는 경우 항상 첫 줄에 와야한다.
		 * 2. this()와 super()는 동시에 사용할 수 없다.
		 * 3. 생성자 내에서 super() 또는 this() 둘 중 하나만 사용할 수 있으며, 동시에 사용 할 수 없다.
		 * 4. 생성자{} 블록 내에서 super() 혹은 this()를 생략하면 자바컴파일러는 자동으로 super()를 추가한다.
		 * 
		 */


	}

	Son12(int x, int y, int z) {
		super(x, y); // 부모의 전달인자 2개짜리 오버로딩 된 생성자 호출
		this.z = z;
	}

	void print() {
		System.out.println("x=" + x + " ,y=" + y); // 상속받아서 호출
		System.out.println("z=" + z);
	} // 사용자 정의 메서드 print()

}

public class ExtendsEx12 {

	public static void main(String[] args) {
		Son12 s01 = new Son12();
		s01.print();

	}

}
