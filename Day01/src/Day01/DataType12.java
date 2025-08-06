/*
* double 타입 실수 숫자값을 (int)로 캐스팅 즉, 
* 형변환하면 소수점이 하는 반올림을 하지 않고 버린다.
*/
package Day01;

public class DataType12 {

	public static void main(String[] args) {
		double score = 89.9;
		int result_score = (int)score; // 89.9에서 소수점 이하 0.9는 반올림하지 않고 버림.
		
		System.out.printf("실제 취득한 점수 = %f %n", score);
		System.out.println("공무원 합격점수 (90점이상 합격, 미만 불합격) = " + result_score);
		
		
		
	}

}
