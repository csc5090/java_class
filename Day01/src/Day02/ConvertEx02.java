package Day02;

public class ConvertEx02 {

	public static void main(String[] args) {

		/*
		 * 자바의 산술(수학)연산자 종류.
		 * 
		 * +, =, *, /(정수를 나눗셈하면 몫만 구하고 실수 숫자를 나눗셈하면 몫과 나머지를 함께 구한다.) %(나머지)
		 * 
		 * 
		 * 
		 */

		int a = 10, b = 4, result = 0; // 3개의 int타입 변수를 한꺼번에 선언과 초기화.

		result = a + b;
		System.out.printf("%d + %d = %d \n", a, b, result);

		System.out.println(a + " = " + b + " = " + (a - b));

		result = a * b;
		System.out.println(a + " * " + b + " = " + result);

		result = a / b;
		System.out.printf("%d / %d = %d \n", a, b, result);

		result = a % b;
		System.out.println(a + " % " + b + " = " + result);

		double c = (double) a / b; // 자동산술법에 의해 double/double이 된다.
									// 결국 실수 숫자를 나눗셈 하면 몫과 나머지를 같이 구하는 셈.
		System.out.println("10.0 / 4.0 = " + c);
		
		
		
		
		
		
		
	}

}
