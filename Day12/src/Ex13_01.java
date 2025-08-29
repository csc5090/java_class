/* 2025 - 08 - 29
 * 개발자 : 최상철
 * 
 * 문제풀이.
 *  animal 클래스에 생성자를 추가하시오.
 */

class Animal {
	String name;
	int age;

	/*
	 * 생성자가 오버로딩이 되면 매개변수가 없는 기본생성자는 더이상 제공되지 않는다.
	 */

	public void show() {
		System.out.println(name + "는(은) " + age + " 살입니다.");
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;

	}

}

public class Ex13_01 {
	public static void main(String[] args) {

		Animal a1 = new Animal("원숭이", 26);
		a1.show();
	}
}
