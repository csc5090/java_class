package src;

/*
 * 2025 - 09 - 05
 * 
 * 17장 레퍼런스형변환.pdf의 2번문제
 * 소스는 강의 교안을 참조하고 명시적인 다운캐스팅을 할 때 if조건문과 instanceof 연산자를 추가코딩해서 true인경우만 안전하게
 * 다운캐스팅을 하게 변경해보자.
 * SubClass에 리턴타입이 없는 pr(){} 메서드를 정의하고 업캐스팅한 foo로 업캐스팅 이후 사용자정의 메서드를 호출해서
 * 멤버변수 i를 출력되게 변경해보자.
 * 
 * 
 */
class SubClass {
	int i = 3;

	void pr() {
		System.out.println("i=" + i);

	}

}

public class Ex17_01 {
	public static void main(String args[]) {
		Object obj = new SubClass(); // 업캐스팅
		if (obj instanceof SubClass) { // obj가 자손클래스 타입 SubClass 로 다운캐스팅이 가능한가? true -> 사전에 업 캐스팅 했기 때문에
			SubClass foo = (SubClass)obj; // 명시적인 캐스팅 형변환 연산자를 사용해서 다운캐스팅
			foo.pr();
			
		}
	}
}
