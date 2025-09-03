
/*
 * 상속구조에서 생성자 호출 순서를 알아보기 위한 문제이다.
 */

class Father03 { // extends Object 생략됨.
	protected int a, b, c;

	public Father03() {
		// super();가 생략됨. 자바의 최고 조상 부모클래스 Object의 기본생성자를 호출하면 생성자 호출은 끝이 남.
		System.out.println("Father03 부모클래스 디폴트 기본생성자 호출!");
	}

	public Father03(int a, int b, int c) {
		System.out.println("Father03 전달인자 3개짜리 오버로딩 된 생성자 호출");
		this.a = a;
		this.b = b;
		this.c = c;
	}
}

class Son03 extends Father03 {
	protected int d;

	public Son03() {
		// super(); 가 생략됨
		System.out.println("Son03 자손클래스 기본생성자");
	}

	public Son03(int a, int b, int c, int d) {
		super(a, b, c); // 부모 Father 03 클래스 전달인자 3개짜리 오버로딩 된 생성자 호출
		this.d = d;
	}

	public void print() {
		System.out.println("a=" + a + "\t b=" + b + "\t c=" + c + "\t d=" + d);
	}
}

public class Ex16_3 {

	public static void main(String[] args) {

		Son03 s03 = new Son03();
		Son03 s07 = new Son03(100, 200, 300, 400);// 전달인자 4개짜리 오버로딩 된 son03() 쪽 생성자 호출
		s07.print();

	}

}
