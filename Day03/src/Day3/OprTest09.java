package Day3;

import java.util.Scanner;

public class OprTest09 {

	public static void main(String[] args) {
		
		// if else if 다중 조건문으로 학점 구하기 실습.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("0~100 사이 정수 숫자 점수만 입력 >> ");
		int score = Integer.parseInt(scan.nextLine());
		
		char grade = ' ';//학점
				
				if(!(0 <= score && score <= 100)) {
					System.out.printf("%s \n", "0 부터 100사이 정수 숫자만 입력하세요!");
				} else {
				}if(score >= 90 && score <= 100) {
						grade = 'A';
					} else if(score >= 80 && score <= 89) {
						grade = 'B';
					} else if(score >= 70 && score <= 79) {
						grade = 'C';
					}else if(score >= 60 && score <=69) {
						grade = 'D';
 					}else {
						grade = 'F';
					}
					System.out.printf("당신이 입력한 %d점은(는) %c학점입니다. \n", score, grade);
					//%d는 십진수 정수 출력형태 지시자, %c는 단일문자 출력형태.
					}
				}
				