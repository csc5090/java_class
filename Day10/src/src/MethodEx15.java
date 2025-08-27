package src;

/* 2025년 8월 27일
 * 개발자 : 최상철
 * 
 * # 참조타입 배열 매개변수 
 */



/*
 * 문제01) 자바 5에서 추가된 향상된 확장 for 문을 사용해서 다음과 같이 배열원소값이 출력되게 static void
 * printArr(int[] arr){} 정적메서드를 작성한다.
 * 
 */

public class MethodEx15 {

	public static void main(String[] args) {
		
		int[] arr = { 3, 2, 1, 6, 5, 4 };

		PrintArr(arr);
		
		MethodEx15 mt15 = new MethodEx15();
		
		
		

	}
	
	int sumArr(int[] arr) {
		 int sum = 0;
		 
		 for(int i=0; i<arr.length;i++) {
			 sum += arr[i];
		 }
		 return sum;
	} // sumArr()

	static void PrintArr(int[] arr) {

		System.out.print("[");
		for (int a : arr) {
			System.out.print(a + ",");
		}
		System.out.println("]");
		System.out.print("==============");
	}

}


