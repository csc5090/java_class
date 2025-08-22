package src;

public class ArrayTest01 {

	public static void main(String[] args) {

		String str = "Java";
		str = str + 8; // 문자열 + 숫자에서 자바는 문자열을 우선해서 숫자 8이 문자열 "8"로 변환된다.
					   // 결국 +는 덧셈 연산이 아니라 문자열을 연결하는 연산 기능을 수행한다.
		
		System.out.printf("%s \n", str); // %s는 문자열 출력형태 지시자
		
		String str01 = "ABCDE";
		char ch = str01.charAt(3); // String 클래스 하위의 charAt(3)내장메서드는 첫문자를 0부터 시작해서 4번째 단일문자 'D'를 반환한다.
		System.out.println("구해진 단일문자 : \'" + ch + "\'" );
		
		String str02 = "012345";
		String result = str02.substring(1, 4); // substring(1,4) 메서드는 첫 문자를 0부터 시작해서 1이상 4미만 사이의 문자를 반환.
		System.out.println("result"+result);
		
		String src = "ABCDE";
		System.out.println("src 문자열 길이 : "+src.length()); //String 클래스 하위의 length() 내장메서드는 첫 문자를 1부터 카운터하는 문자 길이를 반환한다.
		
		for(int i=0; i<src.length();i++) {
			char ch02 = src.charAt(i); // 1번째 단일문자를 구함
			System.out.println("src.charAt("+i+") : "+ ch02);
			
			char[] chArr = src.toCharArray(); // toCharArray는 문자열을 단일문자 char[]배열로 반환
			System.out.println(chArr); // 단일문자 배열원소값 출력
		}
		
		

	}

}
