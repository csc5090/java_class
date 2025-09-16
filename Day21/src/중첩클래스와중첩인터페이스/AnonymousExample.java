package 중첩클래스와중첩인터페이스;

public class AnonymousExample {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous();
		anony.field.wake(); // 익명객체 필드 사용
		anony.method();

		// 익명객체를 메서드 인자값으로 전달
		anony.method02(new Person() {

			void study() {
				System.out.println("자바 공부를 합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}

		}// 익명 클래스(객체)->외부클래스명$번호.class(AnonymousExample$1.class)
				);
	}
}
