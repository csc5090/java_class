package DDIT;

public class ArrayEx07 {

	public static void main(String[] args) {

		// 배열 복사 -> 권하고 싶지 않은 코드.

		int[] arr = new int[5];

		// aar 배열에 1부터 5까지 배열원소값 저장.

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println("변경 전 배열 크기 : " + arr.length); // 5

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
			/*
			 * 결과값 : arr[0] : 1 arr[1] : 2 arr[2] : 3 arr[3] : 4 arr[4] : 5
			 */
		}
		int[] tmp = new int[arr.length * 2]; // arr.length*2는 5*2 = 10 -> 즉 배열 크기가 10인 tmp 배열 생성.

		// 배열 arr에 저장된 원소값을 tmp 배열로 복사

		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		arr = tmp;

		// 배열은 레퍼런스 참조 타입이다. 그러므로 우측의 tmp 배열주소가 arr에 대입된다. 그러면 기존의 arr 배열주소는 사라진다.
		// 결국 arr은 tmp 배열주소를 가리킨다. 그래서 arr 배열크기는 5가 아니고 10이 된다.

		System.out.println("변경 후 배열크기 = " + arr.length); // 10

		// 일반 for 반복문으로 arr 배열원소값 출력

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}

		System.out.println("\n ==================== \n");

		for (int k : arr) {
			System.out.print(" " + k);
		}
	}

}
