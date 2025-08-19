package src;

public class Break_Ex02 {

	public static void main(String[] args) {

		// 자바의 이중 for 반복문에서 맨 안쪽 반복문 안에서 break문을 사용하면 가장 근접한 안쪽 반복문만
		// 중간다혹 바깥 반복문은 중단 못 한다.
		// 이런 경우 바깥 반복문까지 중단하고 싶을 때는 맨 바깥 반복문위에 임의의 레이블명을 지정하면 된다.

		int a, i;

		// 이중 반복문에서 맨 안쪽 반복문만 중단
		for (a = 1; a < 10; a++) {
			for (i = 1; i <= 10; i++) {
				if (i % 3 == 0) {
					break; // 안쪽 반복문만 중단
				}
				System.out.print(" i->" + i);
			}
			System.out.println("\n a->"+a);
		}

		//이중 반복문 중단
		exit_for: // 임의의 레이블명 지정
			for(a=1;a<9;a++) {
				for(i=1;i<=9;i++) {
					if(i % 3 == 0) {
						break exit_for; //이중 for 반복문 중단
					}
					System.out.print(" i->"+i);
				}
				System.out.println("\n a->"+a); // 반복 안함 -> 실행 안함
			}
		
		
	}

}
