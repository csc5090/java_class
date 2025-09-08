package src;

/* 2025 - 09 - 08
 * 개발자 : 최상철
 * 
 * 인터페이스에 오는 모든 변수는 public static final로 인식되는 정적 상수만 온다.
 * 
 */

interface IColor06 {
	int RED = 1;// public static final 이 생략된(묵시적 제공) 정적 상수 RED
	public static final int GREEN = 2;
	int BLUE = 3;

	void setColor(int c); // public abstract가 생략된 추상메서드

	public abstract int getColor();// 추상메서드
}

abstract class AbsColor06 implements IColor06 {
	int color = GREEN; // 추상클래스에는 일반변수가 올 수 있다. 일반 변수는 color를 말함.

	@Override
	public void setColor(int c) {
		color = c;
	}
}

class SubClass06 extends AbsColor06 {

	@Override
	public int getColor() {
		return color;
	}

}

public class InterEx06 {

	public static void main(String[] args) {

		SubClass06 sub06 = new SubClass06();
		sub06.setColor(IColor06.RED);
		System.out.println(sub06.getColor()); // 1

	}

}
