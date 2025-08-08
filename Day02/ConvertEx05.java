package Day02;

import java.util.Scanner;

public class ConvertEx05 {

	public static void main(String[] args) {
		
		/*
		 * 삼항 조건연산자.
		 * 조건식 ? 조건식이 참이면 실행 : 거짓이면 실행
		 * 스캐너로부터 첫 번째 정수, 두 번째 정수 값을 입력받아서
		 * 정수숫자로 변경한 다음 삼항 조건 연산자로 두 수 중 
		 * 더 큰 수를 구하는 실습 예제.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		/* 
		 * ctrl + shift + 영문자 o   단축키로 외부 패키지인 java.util
		 * 패키지의 api를 임포트. jdk 1.5에서 추가된 Scanner내장
		 * api클래스는 텍스트 콘솔 모드로부터 입력 받은 값을 읽어들일 때 사용.
		 * System.in은 키보드 입력장치와 연결된다.
		 * new키워드로 새로운 객체명 scan 생성.
		 * 
		 */
		
		System.out.print("첫번째 정수 숫자 입력>>");
		String num01 = scan.nextLine(); // 문자열로 읽어들인다.
		int number01 = Integer.parseInt(num01); // 읽어들인 문자열을 parseInt() 정적 내장 메서드로 정수 숫자로 변경
		
		System.out.print("두번째 정수 숫자 입력>>");
		int number02 = Integer.parseInt(scan.nextLine());
		
		int max = (number01 > number02) ? number01 : number02;
		System.out.println(number01+"과 "+number02+"중 더 큰 수는 ? "+max);
		
		System.out.print("남성 호르몬 수치를 입력 >> ");
		String MH = scan.nextLine();
		int MH1 = Integer.parseInt(scan.nextLine());
		
		System.out.print("여성 호르몬 수치를 입력 >> ");
		String WH = scan.nextLine();
		int WH1 = Integer.parseInt(scan.nextLine());
		
		if ( MH1 > WH1) {
		System.out.println("남성 호르몬 수치("+MH1+")가 더 높으므로, 당신은 남자입니다.");
		} else {
			System.out.print("여성 호르몬 수치("+WH1+"가 더 높으므로, 당신은 여자입니다.");
		}
	}

}
