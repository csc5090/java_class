package src;

/* 매개변수가 int[] arr이면 배열이라서 참조타입에 해당된다. 주소값을 공유해서 배열원소값도 공유할 수 있다.
 */

public class MethodEx14 {
	static void change(int[] arr) { // int[] arr 참조타입 매개변수
		arr[0] = 1000; // 첫번재 배열원소값을 1000으로 저장
		System.out.println("change()메서드의 arr[0] = " + arr[0]); // 1000
	}

	public static void main(String[] args) {

		int[] x = { 10 };
		System.out.println("main()메서드의 x[0] = " + x[0]); // 10

		change(x); // 배열주소를 공유
		System.out.println("change() 메서드 호출 후 x[0] = " + x[0]); // 1000

	}

}
