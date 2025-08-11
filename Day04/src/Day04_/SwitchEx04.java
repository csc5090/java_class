package Day04_;

import java.util.Scanner;

public class SwitchEx04 {

	public static void main(String[] args) {
		
		/* switch ~ case 다중 선택문을 활용해서 주민번호 뒷자리 첫번재 값이 1,3인 경우는 남자,
		 * 2,4인 경우는 여자, 5,6인경우는 외국인 남자 여자를 구하기.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호 입력(970127-1234567)>>");
		char juminNo = scan.nextLine().charAt(7); // 0부터 시작해 8번째 주민번호 단일문자 하나를 구함.
		
		switch(juminNo) {
		case '1' : 
		case '2' : System.out.println("당신은 남자입니다."); break;
		case '3' :
		case '4' : System.out.println("당신은 여자입니다."); break;
		case '5' : System.out.println("당신은 외국인 남자입니다."); break;
		case '6' : System.out.println("당신은 외국인 여자입니다."); break;
		}
	}
}
