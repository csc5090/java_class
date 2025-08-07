package Day02;

public class ConvertEx09 {

	public static void main(String[] args) {
		
		//자바의 증가/감소 연산자 종류
		// ++i(선행 증가. 먼저 1부터 증가), i++(후행 증가. 나중에 1이 추가)
		// 앞에 있다면 선행, 뒤에 있으면 후행.
		// 이에 따라 입출력값이 실제값과 다를 수 있음.
		
		int a = 10, b=10;
		++a;
		System.out.printf("a = %d \n", a);
		
		a--;
		System.out.println("a = "+a);
		
		System.out.println(b++);
		System.out.printf("b = %d \n", b);
		
		int result = ++b;
		System.out.println("result = "+ result);
		
		
		

	}

}
