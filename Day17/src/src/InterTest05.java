package src;

/* 2025 - 09 - 09
 * 개발자 : 최상철
 * 
 * Object 최고 부모 클래스의 equals()메서드를 자손에서 오버라이딩 한 경우
 * 
 */

class Point05 extends Object {
	int x, y;

	public Point05() {
	}

	public Point05(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		Point05 pt = null;

		if (obj instanceof Point05) {// 다운캐스팅이 가능한가.
			pt = (Point05) obj; // 명시적인 다운 캐스팅
		}

		if ((x == pt.x) && (y == pt.y)) {
			return true;
		} else {
			return false;
		}
	}

}

public class InterTest05 {

	public static void main(String[] args) {

		Point05 pt01 = new Point05(10, 20);
		Point05 pt02 = new Point05(10, 20);

		if (pt01 == pt02) {// 참조타입을 == 같다 비교연산자로 비교하면 객체주소값을 비교함.
			System.out.println("같다.");
		} else {
			System.out.println("아니다.");
		}

		if (pt01.equals(pt02)) {// 값만 비교
			System.out.println("같다.");
		} else {
			System.out.println("값이 다르다.");
		}

	}

}
