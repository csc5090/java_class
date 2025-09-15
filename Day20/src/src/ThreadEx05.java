package src;

/* 2025-09-15
 * 개발자 : 최상철
 * 
 * 특정은행 Atm 계좌에서 출금,입금과 같은 ㄱ특정한 작업이 이루어 질 때는 한번에 하나의 스레드에 의해서만 입/출금 작업이 이루어지도록
 * synchronized 키워드로 동기화. 즉 임계영역을 지정해야 한다.
 * 
 * 
 */

class Atm{
	private int money; //계좌 잔액
	
	public Atm(int money) {
		
		this.money = money; //생성자의 주된 기능인 멤버변수 초기화
	} //생성자 오버로딩
	
	
	//입금작업 동기화 처리
	public synchronized void deposit(int amount, String name) {
		money += amount; //잔액+입금액
		System.out.println(name+" 입금금액 = "+amount);
	}
	
	//출금작업 동기화 처리
	public synchronized void withdraw(int amount, String name) {
		if((money - amount) > 0 ){
			money -= amount;//잔액 - 출금액
			System.out.println(name+" 출금금액 = "+amount);
		} else {
			System.out.println(name+" 잔액부족으로 출금 못 함");
		}// if ~ else
	}//withdraw
	
	
	public void printMoney() {
		System.out.println("계좌 잔액 = "+money);
	}
	
}//Atm 계좌 클래스

class AtmUser extends Thread{
	boolean flag = false; //입금/출금 분기
	Atm obj;
	
	public AtmUser(Atm obj, String name) {
		super(name); // 부모클래스 오버로딩 된 생성자 호출해서 스레드 이름을 반환
		this.obj=obj;
	}//생성자 오버로딩

	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			try {
				sleep(500);
			} catch(InterruptedException ie) {}
			
			if(flag) { // ==true가 생략됨
				obj.deposit((int)(Math.random()*10+2)*100, getName());//입금 작업, 스레드 이름 전달
				} else {
					obj.withdraw((int)(Math.random()*10+2)*100, getName()); // +2하면 2.0이상, 12.0미만 사이 실수 숫자 난수.
																		// int로 캐스팅하면 소수점이하는 버리고 2,12 사이의 정수 숫자 난수
																		// *100하면 1100~1200 사이 정수 숫자 난수.
					obj.printMoney(); //출금 후 계좌 잔액 출력
				}//if~else
			
			flag = !flag; 
		}//for
		
	}
}//AtmUser 스레드 클래스

public class ThreadEx05 {

	public static void main(String[] args) {
		
		Atm obj=new Atm(1000); // 계좌 개설하면서 1000원 입금.
		AtmUser user01=new AtmUser(obj, "홍길동");
		AtmUser user02=new AtmUser(obj, "이순신");
		AtmUser user03=new AtmUser(obj, "강감찬");
		
		user01.start(); //스레드 시작
		user02.start();
		user03.start();
		
	}

}
