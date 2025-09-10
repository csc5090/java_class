package src;

import java.util.Calendar;

/* 2025 - 09 - 10
 * 개발자 : 최상철
 * 
 * java.util 패키지에 있는 내장 api 추상클래스인 Calendar는 컴퓨터 시스템의 년월일 시분초 값을 반환해 준다.
 * 추상클래스이기 때문에 new 키워드로 객체 생성을 할 수 없다.
 * 
 */

public class InterTest07 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR); // 년도값
		int month = cal.get(Calendar.MONTH)+1; // 월, +1하는 이유는 1월이 0으로 반환되기 때문.
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY); //24시간 값
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year+"년 "+month+"월 "+date+"일");
		System.out.println(hour+"시 "+minute+"분 "+second+"초 입니다.");
		
		

	}

}
