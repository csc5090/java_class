package default1;

/* 자바의 산술연산자 
 * +,-,/,*,%,++,--,
 */

public class TypeStudy02 {

	public static void main(String[] args) {

		int a = 10;
		int b = 6;
		int result = 0;

		result = a + b;
		System.out.println(a + " + " + b + " = " + result);

		System.out.println(a + " - " + b + " = " + (a - b));

		result = a * b;
		System.out.println(a + " * " + b + " = " + result);

		result = a / b;
		System.out.println(a + " / " + b + " = " + result);

		double re = 12.0 / 4.0; // 실수 숫자 나눗셈하면 몫과 나머지를 함께 구한다.
		System.out.println("실수 숫자 나눗셈 한 결과값 = " + re);

		result = a % b;
		System.out.println(a + " % " + b + " = " + result);

	}

}
