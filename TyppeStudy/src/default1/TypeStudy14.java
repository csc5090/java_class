package default1;

class ObjectEx14 {

	int[] arr = new int[10];

	public ObjectEx14() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; // 1부터 10까지 초기화
		}
	}// 매개변수가 없는 기본 생성자 정의

	public void pr() { // void는 리턴 타입이 없는 자료형
		int total = 0; // 지역변수 -> 지역변수는 선언과 동시에 초기화를 해야한다.

		for (int a : arr) {
			System.out.print(" " + a);
			total += a;
		}
		System.out.println("\n =============== \n");
		System.out.println("배열 원소 누적합 = " + total);

	}

}

public class TypeStudy14 {
	public static void main(String[] args) {

		ObjectEx14 obj04;// 객체주소가 저장 안 된 참조 변수 obj04;
		obj04 = new ObjectEx14();
		obj04.pr(); // 객체명.메서드()

	}
}
