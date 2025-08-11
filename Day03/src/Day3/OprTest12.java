package Day3;

import java.util.Scanner;

public class OprTest12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("영문 나라 이름 입력(Korea)>>");
		char first_naraName = scan.nextLine().charAt(0); // 메서드를 한줄로 엮어서 연이어서 코드라인을 줄여 사용
														//  = 메서드 체이닝.
		
		switch(first_naraName) {
		case 'k' :
		case 'K' : System.out.println("대한민국"); break;
		case 'a' :
		case 'A' : System.out.println("미국"); break;
		case 'c' :
		case 'C' : System.out.println("캐나다"); break;
		default: System.out.println("해당하는 나라 이름이 없습니다.");
		}

	}

}
