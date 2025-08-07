package Day02;

import java.util.Scanner;

public class ConvertEx07 {

	public static void main(String[] args) {
		
		
		// 문제 ) 스캐너를 활용해서 다음과 같은 "Seoul"이라는 문자열을 입력 받아서
		// 맨 앞 첫 단일문자를 구한 다음 삼항 조건연산자를
		// 활용해서 구한 첫 단일문자가 영문대문자인지, 소문자인지 판별하는 코드 작성.
		// 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\"Seoul\" 문자열 입력>>");
		String cityName = scan.nextLine(); //문자열로 입력 받음.
		char firstCityname = cityName.charAt(0); //첫 단일 문자를 구함.
		
		String resultString = (firstCityname >= 'A' && firstCityname <= 'Z')? "영문 대문자이다" : "영문 소문자이다.";
		
		System.out.println("입력하신 문자 \'"+cityName+"\' 의 첫 단일문자 인 \' "+firstCityname+"'은 "+resultString);
		
		
		
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.print("문자열을 입력하세요: "); String input = scanner.nextLine();
		 * 
		 * // 첫 글자를 문자열로 추출 String firstLetter = input.substring(0, 1);
		 * 
		 * // 대문자인지, 소문자인지 판별 (ASCII 코드값으로) String result = (firstLetter.compareTo("A")
		 * >= 0 && firstLetter.compareTo("Z") <= 0) ? "대문자입니다." :
		 * (firstLetter.compareTo("a") >= 0 && firstLetter.compareTo("z") <= 0) ?
		 * "소문자입니다." : "영문자가 아닙니다.";
		 * 
		 * System.out.println("첫 문자: " + firstLetter); System.out.println("판별 결과: " +
		 * result);
		 * 
		 * scanner.close();
		 */
		
		
		
		
		
		/*
		 * boolean result = true; result = (true && true);
		 * System.out.printf("%b && %b : %b\n", true,true,result);
		 * 
		 * result = (false || false); System.out.println("false || fasle : "+ result);
		 * 
		 * result = !false; System.out.println("!fasle : "+ result);
		 * 
		 * Scanner scan = new Scanner(System.in); String resultAnswer = "";
		 * 
		 * System.out.print("나이 입력>>"); int age = Integer.parseInt(scan.nextLine());
		 * 
		 * resultAnswer = (age >= 20 && age <= 29) ? "20대이다." : "20대가 아니다.";
		 * System.out.println(age+"세는 "+resultAnswer);
		 */
		
		
		
		

	}

}
