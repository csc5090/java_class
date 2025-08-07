package Day02;

public class ConvertEx10 {

	public static void main(String[] args) {
		
		
		int a = 12;
		int b = 20;
		int c;
		
		c = a & b;
		System.out.println(a+" & "+b+" = "+ c);
		
		c = a | b;
		System.out.println(a+" | "+b+" = "+ c);
		
		c = a ^ b;
		System.out.println(a+" ^ "+b+" = "+c);
		
		c = ~a; // 비트 전환, 1이면 0 반대로 0이면 1
		System.out.println("~a : "+ c);
		
		


	}

}
