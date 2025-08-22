package src;

public class ArrayTest07 {
	
	/*
	 * return 값;
	 * 원래 메서드를 호출한 곳으로 return 키워드에 의해서 값을 반환한다.
	 *  
	 */
	
	static int getTotal(int count) {//get 접두어로 시작하는 메서드는 일반적으로 값을 반환한다.
		int sum12 = 0;
		
		for(int i=1; i<=count; i++) {
			sum12 += i;
		}
		return sum12;
	}

	public static void main(String[] args) {
		/*
		 * return 값;
		 * 원래 메서드를 호출한 곳으로 return 키워드에 의해서 값을 반환한다.
		 * 
		 */
		
		int resultTotal = getTotal(3);
		System.out.println("1부터 8까지의 누적합 = " + resultTotal);
		
		
		

	}

}
