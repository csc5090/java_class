package DDIT;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 1차원 배열 원소값 중에서 최대값을 구해 본다.

		double data[] = { 10.5, 20.5, 100.0, 95.0, 28.0 }; // 배열 크기가 5
		double max = data[0]; // 배열 원소 최대값으로 data[] 첫번째 배열 원소값으로 초기화

		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) { // 배열 원소값이 최대값보다 크면 실행
				max = data[i]; // 해당 배열 원소값을 최대값으로 새롭게 저장
			} // if
		} // for

		System.out.printf("data[] 배열원소값 중에서 최대값은 얼마인가? %f \n", max);

		// %f는 10진수 실수 숫자 출력형태 지시자이다. 기본적으로 소주점 6자리 까지만 표현하고, 7자리에서 반올림한다.
		
	}

}
