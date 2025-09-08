package src;

/* 2025 - 09 - 08
 * 개발자 : 최상철
 * 
 * instanceof 의 자동 타입변환.
 */

public class instanceofExample {
	public static void personInfo(Person person) {
		System.out.println("학생 이름 : " + person.name);
		person.walk();

		if (person instanceof Student student) {// person이 참조하는 객체가 Student 타입인 경우 자동 타입 변환 -> 명시적인 다운캐스팅 코드를 할 필요 없어짐.
												// person이 Strudent 자손타입으로 다운 캐스팅이 가능한가? 를 묻는 코드. 결과는 true.
			System.out.println("학번 : " + student.studentNo);
			student.study();
		}
	}

	public static void main(String[] args) {

		Person p01 = new Person("홍길동");
		personInfo(p01);

		System.out.println("\n ======================== \n");

		Student st01 = new Student("최길동", 20250908);
		personInfo(st01);// 업캐스팅과 매개변수 다형성
	}

}
