package Day02;

import java.util.Scanner;

public class ConvertEx15 {

	public static void main(String[] args) {
		
		/* 문제) 영문 소문자 'a'를 영문 대문자 'A'로 바꿔주는 코드를 만들기.
		 * 힌트 : 단일문자에 해당하는 십진수 정수값을 활용.
		 */	
		char lowerCase='a';   // 97
		
		// 첫번째 답.
		char upperCase = (char)(lowerCase - 32);
		System.out.println("영문 소문자 'a'를 대문자로 변경="+upperCase);
		
		//두번째
		char upper = (char)(lowerCase - ('a'-'A')); // 'a'-'A'=97-65=32
													// 97-32=65 -> (char)65->'A'
		System.out.printf("'%c'에 해당하는 영문대문자는 '%c'이다. \n", lowerCase,upper);
		
	}

}
