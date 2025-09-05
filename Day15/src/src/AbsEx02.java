package src;

/*
 * 2025 - 09 - 05
 * 개발자 : 최상철
 * 
 * 추상클래스 특징)
 * 1. 추상클래스도 일반클래스와 마찬가지로 일반속성(멤버변수)과 메서드가 올 수 있다.
 * 2. 추상클래스에는 일반 클래스에서 올 수 없는 abstract 키워드로 정의되는 추상메서드가 올 수 있다.
 * 	  추상메서드는 {}가 없고, 실행문장이 없고, 호출이 불가능함.
 */

class Abs02 {
	abstract void pr(); // 추상메서드 정의 -> 일반클래스에는 추상메서드가 올 수 없다.
}

abstract class Abs03 {// Abs03 추상클래스 정의
	int a = 100;

	void print() {
		// 일반메서드도 올 수 있다.
	}

	abstract void pr02();
// 추상클래스에는 추상메서드가 오는 것이 가능하다.
}

public class AbsEx02 {

	public static void main(String[] args) {

	}

}
