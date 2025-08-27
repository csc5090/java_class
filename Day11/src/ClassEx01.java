/* 2025년 8월 27일
 * 개발자 : 최상철
 * 
 * # 전달인자(매개변수) 개수가 다른 메서드가 오버로딩이 된 경우 기본 타입 매개변수와 참조타입 배열 매개변수와의 차이점 
 */




public class ClassEx01 {

	public static void main(String[] args) {
		
		ClassEx01 cx01=new ClassEx01();
		
		int re = cx01.add(3,5); 
		System.out.println("3 + 5 = " + re);
		
		int[] arr = {0}; //arr[0] 배열 첫번째 원소값으로 0을 저장
		cx01.add(3, 5, arr); // 첫번재 배열 원소값이 메서드 호출 후 0에서 8로 변경됨
		System.out.printf("arr[0] 배열원소값=%d \n", arr[0]);
		
	}
	
	void add(int a,int b,int[] result) {
		result[0] = a + b; // 3+5=8, 8이 첫번재 배열 원소값으로 저장
	}//전달인자 개수가 다른 메서드 오버로딩이 된 경우
	
	int add(int a,int b) {
		return a+b;
	}

}
