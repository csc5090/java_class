package src;

public class Animal02 {

	String name;
	int age; // 클래스 소속의 속성 2개(name,age)를 선언. 이 속성들을 클래스(Animal02)소속 멤버 변수라고 한다.
				// 멤버변수 중 객체 생성해서 접근하는 인스턴스 변수.

	public static void main(String[] args) {

		Animal02 a; // 객체 주소가 저장 안된 참조 변수.
		a = new Animal02(); // new 키워드로 새로운 개겣를 생성하면 객체 주소가 저장된 참조변수 a -> 객체명

		a.name = "홍길동"; // 객체명.속성으로 접근.
		a.age = 26;

		System.out.println("이름 : " + a.name + "\n나이 : " + a.age);

	}

}
