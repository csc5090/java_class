package Day01;

import java.util.Scanner;

/*
 *  자바언어에서 텍스트 콘솔 모드에서 입력한 데이터를 쉽게 읽어들이기 위해서는
 *  jdk 1.5에서 추가된 java.util 패키지의 Scanner 내장 api클래스를 사용.
 *  외부 패키지 폴더에 api를 읽어 들일 때(import) 사용하는 이클립스 단축키는 ctrl + shift + o  
 */


public class DataType10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/* 1. System.in 은 키보드 입력장치와 연결됨.
		 * System.out과는 반대.
		 * 
		 * 2. new 키워드로 새로운 객체명 scan 생성.
		 */
		
		System.out.print("점심 식사 메뉴 입력( 예 : 물냉면, 순대국밥)>>");
		String lunch_food = scan.nextLine(); // 입력 받은 값을 문자열로 읽어들임.
		System.out.println("오늘 먹을 점심 메뉴는?" + lunch_food);
		
		

	}

}
