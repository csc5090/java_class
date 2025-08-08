package Day3;

public class OprTest02 {
	public static void main(String[] args) {
	
	/* && and, || or
	 * 자바의 논리연산자, 효율적인 연산에 관한 예시 소스 코드)
	 * 
	 * 1. || 논리합 연산에서 왼쪽 피연산자가 만든 결과가 true가 되든, false가 되든 상관 없이 결과는 무조건 true.
	 * 즉, 왼쪽 피연산자 연산 결과가 true가 되게 효율적인 코드를 작성할 수 있음. 오른쪽은 연산 안해버리니까.
	 * 
	 * 2. && 논리곱 연산에서 왼쪽 연산 결과가 false면 오른쪽 연산 결과 상관 없이 무조건 연산값은 false.
	 * 즉, 왼쪽 연산 결과를 false가 되게 한다면 효율적인 코드가 됨.
	 */
	
	int a=5;
	int b=0;
	
	System.out.printf("%d, b=%d \n", a, b);
	
	System.out.printf("a != 0 || ++b != 0 : %b\n", a != 0 || ++b != 0); 
	//a != 0 -> 5 != 0 -> true.
	//조건은 만족 됐으니 뒤연산 안함. 그래서 ++b 선행 증가 수행 하지 않음.
	//하지만 아랫줄로 적용될 땐 실제값에 +1이 되어 있음.
	
	System.out.println("a="+a+", b="+b); // 5,0
	
	System.out.println("\n ============== \n");
	
	System.out.printf("a == 0 && ++b != 0 : %b \n", a == 0 && ++b != 0);
	// a == 0 -> 5 == 0 -> false가 된다. 따라서 ++b 선행은 gkwl 않음.
	
	System.out.printf("a=%d, b=%d %n", a,b); // 5,0
	
	
	}
	
}
