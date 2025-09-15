package src;

/* 2025 - 09 - 15
 * 개발자 : 최상철
 * 
 * 첫번째 자바 멀티스레드 구현법)
 * 1. Thread 클래스를 상속하는 법.
 * 2. run()메서드를 오버라이딩 해서 쓰레드 문장을 구현
 * 3. Thread 클래스를 상속받아서 멀티쓰레드 프로그램을 만들면 기능이 간단 프로그램을 만들 때 유리하고, 단점으로는 단일상속만 가능.
 * 
 */

class Thread01 extends Thread {

	Thread01(String name) {// 생성자 오버로딩
		super(name); // 부모클래스 오버로딩 된 생성자 호출해서 스레드 이름을 반환
	}

	@Override
	public void run() {
		for (int num = 1; num <= 5; num++) {
			for (int k = 1; k < 100000000; k++)
				;
			System.out.println(getName() + " " + num); // getName() 메서드로 스레드 이름을 반환.
		}
	}// 멀티 스레드 문장 구현

}

public class ThreadEx01 {

	public static void main(String[] args) {

		Thread01 th01 = new Thread01("첫번째 스레드");
		Thread01 th02 = new Thread01("두번째 스레드");
		th01.start(); // 멀티스레드가 시작되고 실행대기 상태에 있다가 자기 차례가
		th02.start();
	}

}
