/* 2025 - 09 - 01
 * 개발자 : 최상철
 * 
 * Math 클래스 하위의 정적메서드를 활용하여 두 수 중 최대값과 최소값을 구해보고, static final 로 선언된 정적 내장 상수를 활용해서 원주율도 구해본다.
 * 
 */

public class StaticEx03 {

	public static void main(String[] args) {

		int a = 40, b = 30, c = 10, r = 5;

		int result = 0;
		result = Math.max(a, b); // max() 내장 정적메서드는 인자값으로 주어진 두 수 중 최대값을 구한다.
		System.out.printf("%d 와 %d 중 더 큰 값(최대값) = %d\n", a, b, result);
		
		result = Math.min(b, c); // min() 내장 정적 메서드는 인자값으로 주어진 b,c 두 수 중 최소값을 구한다.
		System.out.println(b + "와 " + c + " 중 더 작은 값은(최소값) =" + result);
		
		System.out.println("원주율 값 = " + Math.PI);
		
		double area = 0.0; // 원의 면적
		area = r * r * Math.PI; // 원의 면적 구하는 공식
		System.out.printf("반지름이 %d인 원의 면적 = %f\n", r, area);
		
	}

}
