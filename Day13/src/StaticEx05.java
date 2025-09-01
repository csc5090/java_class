/* 2025 - 09 - 01
 * 개발자 : 최상철
 * 
 * 코드 재활용을 위한 상속
 * 
 */

class Point2D { // extends Object 이 생략됨.
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 전달인자가 없는 기본생성자 생략. 이는 vo라고 볼 수 있음. dto가 되려면 겟,셋 같은 전달을 위한 무언가가 필요.
}// Point2D class

class Point3D extends Point2D {
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

} // Point3D 자손클래스

public class StaticEx05 {

	public static void main(String[] args) {

	}

}
