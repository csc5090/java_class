package 람다식;

/* 자바 내장 함수형 인터페이스인 Runnable은 자바 8버전에서 @FunctionalInterface가 추가되어서, 이 인터페이스로 람다식을 구현할 수 있다.
 * 추상메서드가 딱 하나만 나온다. 그것이 바로 run()
 * 결국 멀티스레드, 문장을 람다식 문법으로 구현할 수 있다는 것.
 * 
 * 
 * 문제1) 함수형 인터페이스인 Runnable을 사용하면 람다식 익명객체를 구현할 수 있다.
 * 그러므로 스레드의 스케쥴링 메서드인 sleep()을 잘 활용하여 람다식 문법코드로 1초 간격으로 10부터 1까지 카운터되는 스레드 예제를 for 반복문을
 * 사용해서 구하는 자바 코드를 만들어본다.
 * 
 * 문제 2) Runnable 자손인 Thread 내장 클래스와 for반복문, 스케줄링 메시드 sleep()을 활용해서
 * 명시적 방식 문법으로 동시에 1부터 10까지 카운터 되는 스레드 프로그램을 만들어 보자. 위의 스레드와 동시 카운터 작업이 이뤄져야 한다.
*/

 

public class RunnalbeExample {

	public static void main(String[] args) {

		Runnable run = () -> {
			for(int k=10;k>=1;k--) {
				System.out.println(k);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) { ie.printStackTrace();}
			}
		};
		
		Thread th=new Thread(run);
		
		System.out.println("\n ======================= \n");
		
		
		Thread thr2 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException abc) {
					abc.printStackTrace();
				}
			}
		});
		
		th.start();
		thr2.start();
		
		
		
		
	}
}


