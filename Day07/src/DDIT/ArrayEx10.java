package DDIT;

public class ArrayEx10 {

	public static void main(String[] args) {
		
		// 배열 원소값을 서로 바꾸는 예제
		
		int[] numArr = new int[10];
		
		// 배열 원소값을 0~9로 초기화하고 출력
		
		for(int i=0; i < numArr.length; i++) {
			numArr[i]=i;
			System.out.print(" " + numArr[i]);
		} // for
		
		System.out.println("\n ============ \n");
		
		//배열 원소값을 서로 바꿈
		for(int i=0; i < 100; i++) {
			int n = (int)(Math.random()*10); //random() 내장메서드는 0.0이상 1.0미만 사이의 실수 숫자 난수를 발생 -> *10하면 0.0이상 10.0미만 사이 실수 숫자 난수 발생
											 // -> (int)로 형변환하면 소수점 이하는 버리고 0이상 10미만. 즉 0부터 9사이의 정수 숫자 난수 발생.
			
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		} // for
		
		//일반 for반복문으로 출력
		for(int i=0; i < numArr.length; i++) {
			System.out.print(" " + numArr[i]);
		} // for end
		
		System.out.println("\n ==================== \n");
		
		//향상된 확장 for로 출력
		for(int a:numArr) {
			System.out.print(" "+a);
		} // for end

		
		
	}

}
