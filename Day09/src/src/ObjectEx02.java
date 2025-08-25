package src;

class Thing {

	int x; // x 속성 정의
}// Thing 클래스

public class ObjectEx02 {

	int x;
	String name;
	int age; // 클래스 소속의 속성 2개(name,age)를 선언. 이 속성들을 클래스(Animal02)소속 멤버 변수라고 한다.
	// 멤버변수 중 객체 생성해서 접근하는 인스턴스 변수.

	public static void main(String[] args) {

		ObjectEx02 a; // 객체 주소가 저장 안된 참조 변수.
		a = new ObjectEx02(); // new 키워드로 새로운 개겣를 생성하면 객체 주소가 저장된 참조변수 a -> 객체명

		a.name = "홍길동"; // 객체명.속성으로 접근.
		a.age = 26;
		System.out.println("이름 : " + a.name + "\n나이 : " + a.age);

		// 11장 클래스와 객체.pdf 문제1

		ObjectEx02 b;
		b = new ObjectEx02();
		b.name = "최원효";
		b.age = 28;
		System.out.println("이름 : " + b.name + "\n나이 : " + b.age);

		// 2번 문제.
		// 하나의 속성(int형 변수 x)을 갖는 Thing 클래스를 설계. 객체 thing을 생성한 후 x 값에 10을 지정, 출력까지 하기.

		Thing thing = new Thing();
		thing.x = 10;
		System.out.println(thing.x);
	}
}
