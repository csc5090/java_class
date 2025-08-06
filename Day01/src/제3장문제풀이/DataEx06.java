package 제3장문제풀이;

public class DataEx06 {

	public static void main(String[] args) {
		
		// 03장. 자료형.pdf no.31 6번 문제.
		// 에러가 나는 이유에 대해서 주석문.
		// 덧셈한 결과값은 byte를 벗어난다. 벗어난 값도 출력해보고, 소스 수정도 해서 출력까지.
		
		byte b = 127;
		byte c = 126;
		byte d = (byte)(b + c);
		
		// 자바는 덧셈연산을 할 때 가장 효율적이고, 빠르고, 값 손실이 없는
		// 4바이트 int타입으로 자동형 변환 하여 계산한다.
		// 결국 byte + byte = 는 int+int=int 가 된다.
		// 에러가 발생하는 이유는 4바이트 덧셈 결과값을 1바이트 크기 byte형에 저장하려면
		// 값 손실이 발생하기 때문에 자동형 변환을 하지 않는다.
		// 그렇기에 명시적인(수동적인 명령) 캐스팅 연산자를 필요로 한다.
		// (byte)가 들어간 이유이기도 하다.
		
		int e = b + c;
		
		System.out.println("벗어난 값 : " + d);
		System.out.println("정상적인 값 : " + e);
		System.out.println(b + " + " + c + " = " + e);
		
		
		

	
		
		
	}

}
