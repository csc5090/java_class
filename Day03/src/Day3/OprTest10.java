package Day3;

import java.util.Scanner;

public class OprTest10 {
	public static void main(String[] args) {
		
		//switch ~ case 다중 선택문(조건문) 형식에 대해.
		//  Switch(정수식){
		//    case 값: 실행문장; break;
		//    ..
		//    default : 해당 사항 없을 때 실행;
		//     }
		//
		//   정수식과 case 값이 일치하면 해당 실행문장을 수행 후 break문을 만나서 switch~case 문을 종료한다.
		// 해당 사랑이 없다면 default 문장을 수행한다.
		
		//break문을 생략한 실습.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("관리자 등급 6~9 사이 입력>>");
		int grade = Integer.parseInt(scan.nextLine()); //문자열로 입력받아서 정수 숫자로 바꿔서 변경
		
		if(grade >= 6 && grade <= 9) {
			System.out.print("입력하신 등급 " + grade + "는(은) ");
			switch(grade) {
		case 9: System.out.println("최고 관리자 등급입니다.");
		case 8: System.out.println("관리자 등급입니다.");
		case 7: System.out.println("중간 관리자 등급입니다.");
		case 6: System.out.println("사용자 등급입니다.");
		} 
			}else {
		System.out.println("6~9사이 관리자 등급만 입력하세요!");
	}
		}
}



