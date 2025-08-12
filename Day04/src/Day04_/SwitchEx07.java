package Day04_;

public class SwitchEx07 {
private static void method01(String s) {
	// private 키워드는 내 자신 클래스 내에서만 접근 가능하게 한다.
	switch (s) {
	case null -> System.out.println("null");
	case "a", "b" -> System.out.println("a or b");
	case "c" -> System.out.println("c");
	default -> System.out.println("해당 사항 없다.");
	}
}

private static void method02(String s) {
	switch(s) {
	case "a", "b" -> System.out.println("a or b");
	case "c" -> System.out.println("c");
	case null, default -> System.out.println("null or 해당 사항 없음.");
	}
}
	public static void main(String[] args) {
		
	method01(null); // mothod01() 메서드 호출이면서 null 인자값 전달.
	method02("d");
	method02(null);
	
		// 자바 17버전 까지는 switch ~ case 문의 표현값이 null인 경우 예외 오류가 발생.
		// 자바 21버전부터는 null을 지정해도 예외 오류가 발생하지 않음.
	}
}
