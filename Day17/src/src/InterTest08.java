package src;

/* 2025 - 09 - 10
 * 개발자 : 최상철
 * 
 * 1. 문자열을 다루는 String 내장 api클래스는 자기 자신 내용을 수정할 수 없다.
 * 2. StringBuffer 내장 api는 자기 자신값을 수정할 수 있다.
 */


public class InterTest08 {

	public static void main(String[] args) {
		
		String cityName = "seoul";
		System.out.println("도시이름을 영문대문자로 변경 : "+ cityName.toUpperCase());
		
		System.out.println("cutyName : "+ cityName);
		System.out.println("\'seoul\' 문자열 길이 : "+cityName.length());
		System.out.println("\'seoul\' 세번째 단일문자 : "+ cityName.charAt(2)); //charAt(2) 메서드는 첫문자를 0부터 시작해서 세번째 단일문자를 구함.
		System.out.println("\'seoul\' 에서 e가 몇 번째 위치되어 있는가? "+ (cityName.indexOf('e')+1)); //indexof('e') 메서드는 단일문자 e를 맨 왼쪽부터
																							//찾아서 가장 먼저 나오는 해당문자 위치번호를 첫맨 왼쪽 첫문자를 0부터 카운터해서 구한다. -> 2
		
		System.out.println("\n ============= \n");
		
		StringBuffer str01 = new StringBuffer();
		str01.append("Java"); //Java 문자 추가
		str01.append(" Programming");
		System.out.println("추가된 문자 :"+str01.toString());
		
		String sub_result = str01.substring(0, 4); // 첫문자를 0부터 시작해서 4미만 사이의 문자 반환 -> Java.
		System.out.printf("0이상 4미만 사이의 문자는 %s\n", sub_result);
		
		str01.replace(0, 4, "Jsp"); // 첫 문자를 0부터 시작해서 0이상 4미만 사이의 문자 Java를 Jsp로 변경.
		System.out.println("변경된 문자 : "+ str01.toString());//Jsp Programming
	}
}
