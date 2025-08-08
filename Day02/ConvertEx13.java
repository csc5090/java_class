package Day02;

public class ConvertEx13 {

	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b);
		System.out.printf("%d + %d = %d \n", a,b,c);
		
		
		//자동산술법에 의해 byte+byte=>int+int=int 가 된다.
							  //덧셈 결과 값은 4바이트 int. 이것을 1바이트 크기인 byte형
							  //변수 c에 저장하려고 하니 캐스팅 연산자인 (byte)를 사용.
							  //명시적인 형변환을 해주어야 한다.
		
		int d = a+b; // 사실 이게 가장 좋은 방법.
		System.out.println(a+ "+ "+b+" = "+d); // ㅇㅇ
		
		a=10;
		b=30;
		c=(byte)(a*b); //곱셈 결과값이 byte형 범위를 벗어나서 자료 손실 발생.
		System.out.printf("%d * %d = %d \n", a,b,c);
		
		d = a * b;
		System.out.println(a + " * "+ b + " = "+ d);

	}

}
