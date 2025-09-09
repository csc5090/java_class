package src;

/* O bject 최고조상 부모 클래스의 내장 메서드 중에서 문자열 값을 반환해주는 toString() 메서드를 오버라이딩을 해본다.
 * java.lang은 기본 패키지 경로이다. 이 부분은 생략가능.
 * 
 * 
 */

class Point03 extends Object {
	int x, y;

	public Point03() {
	} // 기본생성자.

	public Point03(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(x좌표값 : " + this.x + ", y좌표값 : " + y + ")";
	}

}

public class InterTest03 {

	public static void main(String[] args) {

		Point03 pt03 = new Point03(10, 20); // 전달인자 2개짜리 오버로딩 된 생성자 호출
		System.out.println(pt03.toString());
		System.out.println(pt03); // toString()이 생략됨.

	}

}
