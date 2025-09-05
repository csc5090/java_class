package src;

/*
 * 2025 - 09 - 05
 * 개발자 : 최상철
 *
 */
/*
 * 추상 클래스 특징 : 부모 추상클래스의 추상메서드는 상속 받은 자손클래스에서 반드시 일반 메서드로 오버라이딩을 해야한다.
 * 그래야만 자손 클래스 객체 생성이 가능.
 * 
 */

abstract class Abs033 {
	abstract void pr() {
		System.out.println("추상메서드를 오버라이딩한 일반 메서드");		
		}
}

class Child03 extends Abs033{
	@Override
	void pr() {
		System.out.println("추상메서드를 오버라이딩 한 일반메서드");
	}
}

public class AbsEx03 {

	public static void main(String[] args) {
		
		Abs03 abs; // 추상클래스로 참조변수 abs선언
		abs = new Child033();
		abs.pr();//업캐스팅 이후 오버라이딩 한 메서드 호출
		
		
	}

}
