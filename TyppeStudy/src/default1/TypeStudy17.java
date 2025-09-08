package default1;

/*
 * 메서드 오버로딩 보충
 * 1. 동일한 같은 클래스 내에서 같은 이름의 메서드명을 중복해서 여러번 정의하는 것 = 메서드 오버로딩
 * 2. 오버로딩 된 메서드 구분 요건 
 * 		가. 전달인자(매개변수) 개수를 다르게.
 * 		나. 전달인자 타입을 다르게.
 * 		다. 전달인자 순서를 다르게.
 */

class Mt07 {
	void pr(int a) {
		System.out.println(a);
	}

	void pr(int a, int b, int c) {
		System.out.println(a + "\t" + b + "\t" + c);
	}// 전달인자 다르게

	void pr02(int data) {
		System.out.println(data);
	}

	void pr02(double data) {
		System.out.println(data);
	}// 전달인자 타입을 다르게 한 메서드 오버로딩

}

public class TypeStudy17 {

	public static void main(String[] args) {

		Mt07 mt = new Mt07();
		mt.pr(1);
		mt.pr(1, 2, 3);
		mt.pr02(0.17);
		mt.pr02(1234.123);
	}
}
