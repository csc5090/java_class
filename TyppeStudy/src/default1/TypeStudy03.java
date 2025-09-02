package default1;

/* 자바언어에서 + 연산기호의 특징)
 * 	숫자 + 숫자에서는 덧셈을 하는 덧셈 연산기호이다.
 *  문자 + 숫자에서는 문자를 우선해서 숫자가 문자로 변경된다.
 *  결국 문자+문자를 서로 연결하는 문자여ㅕㄹ 연결 연산기호가 된다. 
 */

public class TypeStudy03 {

	public static void main(String[] args) {

		int result = 100 + 100;
		System.out.println("100+100=" + result); // 200

		String re = 100 + "100"; // 100100, 숫자로 적었어도 문자가 우선되어 숫자가 문자로 형변환됨.
		System.out.println(re);
		System.out.println("\n ====================== \n");

		/*
		 * 자바의 비교연산자 종류) 1.비교연산자 결과값은 boolean 타입인 true or false이다. 2. 비교/관계연산자 종류) >,
		 * >=, <, <=, ==, !=
		 * 
		 */

		int a = 100, b = 50;
		boolean re01 = false;
		re01 = (a > b);
		System.out.println(a + " > " + b + " : " + re01);

		re01 = (a == b);
		System.out.println(a + " == " + b + " : " + re01);

		re01 = (a != b);
		System.out.println(a + " != " + b + " : " + re01); // true

	}

}
