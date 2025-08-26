package src;

/* 자바 OOP에서 클래스 소속의 사용자 정의 메서드)
 * 1. return 키워드로 값을 반환하는 메서드
 * 2. 메서드명 앞에 리턴타입을 void형으로 해서 값을 반환하지 않고 구구단을 출력하는 메서드
 * 
 */

class Obj09 {
	int add(int a, int b) {
		return a + b; // 덧셈 결과값을 반환
	} // add()

	void printGuguDan() {
		int k = 2;
		while (k <= 9) {
			System.out.print(k + "단\t"); // 구구단 제목 출력
			k++;
		} // while end
		System.out.println("\n ========================= \n");

		// 구구단 내용 출력
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			} // inner for
			System.out.println(); // 줄바꿈
		} // outer for
	}// printGuguDan()
}// Obj09 class

public class ObjectEx09 {

	public static void main(String[] args) {

		Obj09 obj = new Obj09();
		System.out.println("10+10=" + obj.add(10, 10));
		obj.printGuguDan();
	}
}
