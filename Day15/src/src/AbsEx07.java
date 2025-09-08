package src;

/* 2025-09-08
 * 
 * 개발자 : 최상철
 * 
 * 변수를 final로 선언하면 수정할  수 없는 변수 즉 상수가 된다. 상수명은 관례적으로 영문대문자. 선언과 동시에 초기화를 해야한다.
 * 
 */

class FinalMember {
	final int ABC = 100; // ABC상수명 정의
	
	public void setAbc(int a) {
		ABC = a; //ABC는 상수라서 수정할 수 없다.
	}
}


public class AbsEx07 {

	public static void main(String[] args) {


	}

}
