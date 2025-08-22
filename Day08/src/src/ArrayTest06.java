package src;

public class ArrayTest06 {

	static void sum(int count) { // void는 반환값이 없는 타입. 즉 리턴 타입이 없는 자료형. sum()은 메서드명.

		int total = 0;// 누적합을 저장하는 변수이다. 지역변수 선언과 동시에 초기화 과정을 해야한다.

		for (int i = 1; i <= count; i++) {
			total += i;
		}

		System.out.printf("1부터 %d까지의 누적합 = %d \n", count, total);
		System.out.println("\n ===================== \n");

	}

	public static void main(String[] args) {

		ArrayTest06.sum(7); // 클래스명, 정적메서드()
		sum2(10); // 같은 클래스 내에서 정적메서드를 호출할 때는 해당 클래스명을 생략하면 된다.
		
		

		// 문제) 리턴타입이 없는 void형으로 1부터 10까지의 누적합을 구하는 정적메서드 static void sum2(int cnt){}를
		// 정의한다.
		// 이 메서드 실행문장으로 while 반복문을 사용해서 누적합을 구하는 코드를 완성한다.

	}

	static void sum2(int cnt) {

		int sum = 0;
		int i = 1;

		while (i <= cnt) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + cnt + "까지의 합" + sum);

	}

}
