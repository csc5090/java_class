package src;

class Mother03 {
	void m03() {
		System.out.println("부모 클래스 메서드 m03()");
	}
}

class Child03 extends Mother03 {
	void ch03() {
		System.out.println("자손 클래스 메서드 ch03()");
	}
}

public class RefCast03 {
	public static void main(String[] args) {

		Mother03 m03 = new Child03(); // 사전에 업캐스팅
		Child03 ch03 = m03; // 명시적인 캐스팅 연산자를 사용하지 않고 다운캐스팅을 해서 컴파일 에러가 발생
		ch03.m03();
		ch03.ch03();
	}
}
