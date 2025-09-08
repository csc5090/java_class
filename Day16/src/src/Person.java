package src;

public class Person {// 부모클래스 정의

	String name;

	public Person(String name) {
		this.name = name;
	} // 생성자 오버로딩

	public void wlak() {
		System.out.println("걷습니다.");
	}

}
