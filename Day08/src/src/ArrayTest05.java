package src;

import java.util.Calendar;

public class ArrayTest05 {

	public static void main(String[] args) {
		
		Week today = null; // Week 열거 타입도 참조 타입이어서 today라는 참조변수 선언 가능. null로 대입.
		
		// 자바에서 null이란 "아무 객체도 참조하지 않음"을 의미.
		// 즉 비어있는 개체 참조를 나타내며, 변수가 어떤 객체도 가리키고 있지 않을 때 사용.
		
		Calendar cal = Calendar.getInstance();
		// java.util 패키지에 있는 내장 api인 calendar는 년월일 시분초 값들을 반환한다. 컴퓨터의 날짜와 시간정보를 가진다.
		
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일요일은1,... 토요일은 7까지 정수 숫자 반환.
		System.out.println("반환된 week값 : "+week);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; // 열거 타입 변수 today에 열거 상수 대입 가능하다. 열거타입이름, 열거상수 형태로 작성.
		case 2:
			today = Week.MONDAY;
		case 3:
			today = Week.TUESDAY;
		case 4:
			today = Week.WEDNESDAY;
		case 5:
			today = Week.THURSDAY;
		case 6:
			today = Week.FRIDAY;
		case 7:
			today = Week.SATURDAY;
		break;
			
		}
		
		System.out.println("오늘 요일은 "+today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("자바 공부합니다.");
		}
		

	}

}
