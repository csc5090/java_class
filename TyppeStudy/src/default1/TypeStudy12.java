package default1;

/* 무한 루프문?
 * 반복문 조건식이 무조건 참이어서 영원히 반복하는 반복문.
 * while(true){
 * 실행문장;
 * }
 * 
 * for (;;){
 * 	초기치,조건식,증가치를 생략하면 무한루프문이 됨.
 * }
 */

public class TypeStudy12 {

	public static void main(String[] args) {

		// while 반복문을 이용한 무한루프문
		int i = 1;// 반복문 제어변수
		while (true) {
			System.out.print(" " + i + "번째 while 반복문 반복");
			if (++i == 10) {
				break;
			}
		} // while end
		System.out.println("\n =================================== \n");

		// for반복문을 이용한 무한루프문

		i = 1;
		for (;;) {
			System.out.println(" " + i + " 번째 for 반복문");
			if (++i == 4) {
				break;
			}
		}
	}
}
