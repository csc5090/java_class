package src;

import java.util.ArrayList;

/* 2025 - 09 - 16
 * 개발자 : 최상철
 * 
 * 멀티쓰레드 스케줄링 메서드중에서 wait(), notify()에 관한 실습 예제)
 * 
 * 
 */

class Table {
	String[] dishNames = { "donut", "donut", "burger" }; // 음식 이름
	final int MAX_FOOD = 6; // 테이블에 추가할 수 있는 최대 음식
	// final로 선언된 MAX_FOOD는 수정할 수 없는 상수가 된다.
	private ArrayList<String> dishes = new ArrayList<>();// 음식을 추가할 컬렉션 제네릭 객체 dishes 생성

	// 동기화 된 음식 추가
	public synchronized void add(String dish) {
		while (dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName(); // 현재 실행중인 스레드 이름 반환
			System.out.println(name + " is waiting");

			try {
				wait(); // 요리사 스레드 기다리게 하기.
				Thread.sleep(500);
			} catch (InterruptedException ie) {}
		}//while end
		dishes.add(dish); //음식추가
		notify();//기다리고 있는 손님 스레드를 깨워서 음식을 식사하게 한다.
		System.out.println("Dished : "+dishes.toString());// 추가한 음식목록 출력.
	}//add()
	
	//음식 제거
	
	public void remove(String dishName) {
		//특정영역 동기화
		synchronized (this) {
			String name = Thread.currentThread().getName();
			
			while(dishes.size() == 0) { //테이블에 음식이 없는 경우
				System.out.println(name+"is waiting");
			try {
				wait();
				Thread.sleep(500);
			} catch (InterruptedException ie) {}
			}//while end
			
			while(true) {
				for(int i=0; i<dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))); { //음식물 내용이 같다면 참.
						dishes.remove(i); //음식을 먹었다.
						notify(); // 요리사가 음식을 다시 채움.
						return; //종료
					}
				}//for end
				
				try { System.out.println(name+"is waiting");
				wait(); //원하는 음식이 없으면 대기
				Thread.sleep(500);
				} catch(InterruptedException ie) {}
				
			}//while 
		}
	}//remove()
	
	public int dishNum() {
		return dishNames.length;//음식 재료 개수 3을 반환.
	}
}//Table class

//소비자 쓰레드

class Customer implements Runnable {
	private Table table;
	private String food;
	
	
		public Customer(Table table, String food) {
			this.table = table;
			this.food = food;
			
		}
		
		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(100);
				} catch(InterruptedException ie) {}
				String name = Thread.currentThread().getName();
				
				table.remove(food); // 테이블로부터 음식을 식사하여 제거
				System.out.println(name+" ate a " + food);
			}
		
	}//스레드 문장구현
	
} //Customer class 

//요리사 스레드
class Cook implements Runnable{
	
	private Table table;
	
	public Cook(Table table) {
		this.table = table;
	}//생성자 오버로딩 -> 생성자의 주된ㄱ ㅣ능은 클래스 소속의 멤버변수 중 인스턴스 변수 초기화 기능이다.
	
	
	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]); //테이블에 음식 추가
			
			try {
				Thread.sleep(10);
			} catch(InterruptedException ie) {}
		}//무한루프 while 반복문
	}//run()
}//Cook class

public class ThreadEx09 {

	public static void main(String[] args) throws Exception {
		
		Table table = new Table();
		
		new Thread(new Cook(table), "COOK01").start(); // 요리사 스레드 시작
		new Thread(new Customer(table, "donut"),"CUST01").start();//손님스레드 시작
		new Thread(new Customer(table,"burger"), "CUST02").start();
		
		Thread.sleep(2000); //2초뒤에 메인 스레드 종료.
		System.exit(0);//정삭적인 종료 
		
						  
		
	}

}
