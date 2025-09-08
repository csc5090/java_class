package src;

public class Person {// 부모클래스 정의

	String name; //학생 이름

	public Person(String name) {
		this.name = name;
	} // 생성자 오버로딩

	public void walk() {
		System.out.println("걷습니다.");
	}

}
