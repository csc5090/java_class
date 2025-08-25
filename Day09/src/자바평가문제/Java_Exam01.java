package 자바평가문제;

import java.util.Scanner;

public class Java_Exam01 {
	static void name_print(String name) {
		System.out.print("성 이름 : " + name);
	}

	public static void main(String[] args) {
		// 메서드.pdf no.10 1,2번문제

		// 1번문제 )) 스캐너로부터 자신의 성,이름을 입력받아서 대개변수 인자값으로 전달해 출력하는 정적 메서드를 정의해보기.
		Scanner scan = new Scanner(System.in);

		System.out.print("성을 입력하세요 >>");
		String str = scan.nextLine();

		System.out.print("이름을 입력하세요 >>");
		String str2 = scan.nextLine();

		Java_Exam01.name_print(str + str2);

		System.out.println("\n ==================== \n");

		// 2번문제) 스캐너로부터 입력받은 정수 숫자를 정적 메서드 인자값으로 전달해서 해당 숫자 구구단을 구하는 메서드를 별도로 만들기.
		// 메서드 실행 문장으로 if ~ else 조건문을 활용해서 2부터 9사이 숫자가 아닌 경우는 '2부터 9사이 정수 숫자만 입력!'라는 유효성
		// 검증 메시지 띄우기.
		// 2부터 9사이 정수 숫자를 입력한 경우는 해당숫자 구구단을 구하는 자바코드를 완성한다. 단, 구구단 제목도 출력하고 구구단을 구할때는
		// for반복문만 사용한다.
		
		System.out.print("몇 단?(숫자만 입력) >> ");
		
		}
	
	static void gugu(int guguDan) {

		Scanner gugudan = new Scanner(System.in);
		int how = gugudan.nextInt();
		int answer;
		int b;
		
		if (how <= 1 || how >= 10) {
			System.out.print("2~9사이 정수만 입력하세요");
		} else {
			for (b = 1; b < 10; b++) {
			answer = how * b;
			System.out.println(how + " * " + b + " = " + answer);
		}
		}
		
	}


}
