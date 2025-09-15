package src;

/* 2025 - 09 - 15
 * 개발자 : 최상철
 * 
 * 출금작업과 같은 특정작업이 이루어 질 때는 synchronized 키워드로 동기화를 처리해야 하는데 이를 하지 않아 출금 후 은행
 * 잔고가 음의 정수가 나오는 예)
 */

class Account{
	private int balance = 1000; //계좌잔액
	
	public int getBalance() { //값 반환 getter 메서드
		return balance; //계좌 잔액 반환
	}
	
	//동기화를 하지 않은 출금 작업
	public void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {}
			
			balance -= money; //잔액 - 출금액
		}
	}
	
}


class Thread08 implements Runnable {
	
	Account acc = new Account(); //계좌 객체 생성
	
	@Override
	public void run() {
		while(acc.getBalance() > 0 ) {
			int money = (int)(Math.random()*3+1)*100;
			
		acc.withdraw(money); //계좌로부터 출금
		System.out.println("출금후 잔액 = "+acc.getBalance());
			
		}		
	}// 스레드 문장 구현
}//Thyread08 class 

public class ThreadEx08 {

	public static void main(String[] args) {
		Thread08 th=new Thread08();
		new Thread(th).start(); // 멀티쓰레드 시작
		new Thread(th).start();

	}

}
