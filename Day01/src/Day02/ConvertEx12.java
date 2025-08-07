package Day02;

public class ConvertEx12 {

	public static void main(String[] args) {
		
		// 자바의 산술 수학연산자.
		
		
		int a=10;
		int b=4;
		
		System.out.printf("%d + %d = %d \n", a,b,a+b);
		
		int result = a*b;
		System.out.println(a+" * "+b+" = "+ result);
		
		result = a/b;
		System.out.printf("%d / %d = %d \n", a,b,result); 
		//정수 숫자를 나눗셈하면 몫만 구한다.
		
		result = a%b; //%는 나머지 연산.
		System.out.println(a+" % "+b+" = "+ result);
		
		/* 문제)int 타입 b변수값을 double 타입으로 형변환해서
		 * 나눗셈한 결과값을 소수점 이하 6자리까지 구하시오. */
		
		
		double c = (double)a / (double)b;
		System.out.printf("%.6f", c);
		System.out.printf("%d / %f = %f \n", a,(double)b, a/(double)b);
	}

}
