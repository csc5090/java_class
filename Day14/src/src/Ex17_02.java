//상속관계에서 업캐스팅 이후 오버라이딩 한 메서드 호출에 관한 문제이다.
// 출력 결과물을 주석문 처리해서 보여주고 어떤 부분만 추가해서 더 나은 자바 oop 프로그래밍 코드로 변경해본다.

package src;

class Super {
	int a;

	public int getNumber(int a) {
		return a + 1;
	}
}

class CastingEx03 extends Super {
	@Override
	public int getNumber(int a) {
		return a + 2;
	}
}

public class Ex17_02 {
	public static void main(String args[]) {
		Super a = new CastingEx03();
		System.out.println(a.getNumber(0)); // 2. 윗줄의 업캐스팅(부모 클래스를 참조해 자식클래스 객체 생성. 따라서
											// 같은 이름의 메서드를 호출하면 자식 메서드가 호출됨. 객체가 자식의 것이니)
	}
}
