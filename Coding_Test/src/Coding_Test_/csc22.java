package Coding_Test_;

public class csc22 {

	public static void main(String[] args) {

		abstract class Animal {
			void breathe() { // 일반 메서드
				System.out.println("숨을 쉰다");
			}

			abstract void sound(); // 추상 메서드
		}
		class Dog extends Animal {
			@Override
			void sound() {
				System.out.println("멍멍!");
			}
		}

	}

}
