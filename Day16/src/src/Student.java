package src;

public class Student extends Person {
	int studentNo; //학번

	public Student(String name, int studentNo) {
		super(name); // 부모클래스 오버로딩 된 생성자 호출
		this.studentNo = studentNo;
	}

	public void study() {
		System.out.println("자바 공부를 한다.");
	}

}
