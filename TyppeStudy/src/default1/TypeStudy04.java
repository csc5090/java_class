package default1;

/* 논리연산자 종류)
 * 1. 논리 연산자 결과값은 boolean 타입인 true or false 이다.
 * 2. 논리 연산자 종류)
 * 		&&(논리곱) -> and
 * 		|| -> or
 * 		! -> not
 * 
 */

public class TypeStudy04 {

	public static void main(String[] args) {

		boolean flag = false;
		flag = (true && true);
		System.out.println("true && true : " + flag);

		flag = (false || false);
		System.out.println("flase || flase : " + flag);

		flag = !false; // false의 반대는 true 가 된다.
		System.out.println("!false : " + flag);

		System.out.println("\n ============================ \n");

		/*
		 * 자바의 증감연산자 종류) ++(1씩 증가) : ++i(선행증가), i++(후행증가)
		 * 
		 * 
		 */

		int i = 10;
		i++;
		System.out.println("i++ = " + i); // 11

		--i;
		i--;
		System.out.println("--i, i-- = " + i);

		/*
		 * 복합 대입연산자 i=i+1 i+= i=i-1 i-=
		 * 
		 */
		i += 3;
		System.out.println("i+=3 = " + i);// 12

		i -= 2;
		System.out.println("i-= : " + i); // 10

	}

}
