package Day01;

public class YT_PRACTICE {
	public static void main(String[] args) {

		/*
		 * for (int i = 1; i <=10; i ++) { System.out.println(i); }
		 * 
		 * for (int i = 0; i <= 100; i += 2) System.out.println(i);
		 */

		/*
		 * // do while
		 * 
		 * int distance = 25; int move = 0; int height = 3;
		 * 
		 * 
		 * do { System.out.println("발차기를 계속 합니다."); System.out.println("현재 이동 거리 : " +
		 * move); move += 3; } while ( move + height < distance );
		 * System.out.println("도착했습니다."); }
		 */
		// 이중 반복문

		// 피라미드
		//

		int height = 5;

        for (int i = 1; i <= height; i++) {
            // 1. 공백 출력
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            // 2. 별 출력 (2*i - 1 개)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // 3. 줄 바꿈
            System.out.println();
        }

		
		
		
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

// 조건문 if else

/*
 * int hour = 10; if (hour < 14) { System.out.println("아이스 아메리카노 + 1"); } else {
 * System.out.println("아이스 아메리카노 디카페인 +1");
 * 
 * } System.out.println("커피 주문 완료 # 1 ");
 */

// 오후 2시 이거나 모닝 커피를 마신 경우?

/*
 * int hour = 14;
 * 
 * boolean MorningCoffee = true; if (hour > 14 || MorningCoffee == true ) {
 * System.out.println("아이스 아메리카노 디카페인 + 1 "); } else {
 * System.out.println("아이스 아메리카노 + 1");
 */

// 밥먹은지 얼마나 지남?

/*
 * int min = 40 ; if ( min > 30 ) { System.out.println( "양치 ㄱ." ); } else {
 * System.out.println( "아직 ㄱㅊ" ); }
 */

// 철수가 있음. 철수 점수 60 점. 60>합격 60<불합격
// 결과 출력.

/*
 * int score = 60; if ( score >= 60) { System.out.println("합격."); } else {
 * System.out.println("불합격"); }
 */

// 철수 점수 60점 60 > = a, 50~60 = b. 50 < = c
// 성적을 출력.

/*
 * int score = 39; if (score >= 60) { System.out.println("A입니다."); } else
 * if(score > 50 || score < 60){ System.out.println("b입니다."); } else {
 * System.out.println("c입니다.");
 */

// 이름은 상철 로 입력. 최상철로 받으면 "최상철입니다."
// 상철로 받으면 "최상철이 아입니다."
// 그 외엔 전부 출력 x

/*
 * String name2 = "상철"; if ( name2 == "상철" ) { System.out.println("최상철이 아닙니다.");
 * } else if (name2 == "최상철") { System.out.println("최상철입니다."); }
 */

/*
 * int day = 3; switch (day) { case 1: System.out.println("월요일"); break; case 2:
 * System.out.println("화요일"); break; case 3: System.out.println("수요일"); break;
 * default: System.out.println("알 수 없는 요일");
 */

/*
 * int day = 1; switch ( day ) { case 1 : System.out.println("1입니다."); break;
 * case 2 : System.out.println("2입니다."); break; case 3 :
 * System.out.println("3입니다."); break; default :
 * System.out.println("아무것도 아닙니다.");
 */

// 성적 입력. 80점 이상이면 a.
// 70점 b, 60점 c,

/*
 * int press = 1; switch (press) { case 1: System.out.println("아메리카노"); break;
 * case 2: System.out.println("카페라떼"); break; case 3:
 * System.out.println("카푸치노"); break; case 4: System.out.println("에스프레소");
 * break; default: System.out.println("없는 메뉴 입니다.");
 * 
 * }
 */

/*
 * switch ( age / 10 ) { case 1 : System.out.println("틀딱이 아닙니다."); break; case 2
 * : System.out.println("틀딱이 아닙니다."); break; default :
 * System.out.println("개틀딱입니다.");
 * 
 * }
 * 
 * if ( age > 28 ) { System.out.println("틀딱입니다."); } else {
 * System.out.println("틀딱이 아닙니다."); }
 */
