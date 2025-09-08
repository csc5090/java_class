package src;

/* 2025 - 09 - 08 
 * 
 * 개발자 : 최상철
 * 
 * 
 * final 메서드 특징)
 * 메서드를 final로 선언하면 자손에서 더 이상 오버라이딩을 할 수 없다.
 * 
 * 
 */

class FinalMethod {

	public final void p() {
		// final 메서드

	}

}

class FinalSubClass extends FinalMethod {

	@Override
	public void p() {
		// final 메서드 p()는 오버라이딩을 허락하지 않는다.
	}

}

public class AbsEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
