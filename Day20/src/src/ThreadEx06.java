package src;

import javax.swing.JOptionPane;

/* 2025 - 09 - 15
 * 개발자 : 최상철
 * 
 * 자바 스윙 GUI를 사용한 멀티스레드 예)
 * 	카운트다운과 스윙 GUI 입력폼 실행이 멀티 스레드에 의해서 동시 작업)
 * 
 * 
 */

class Thread06 extends Thread{
	
	@Override
	public void run() {
		for(int i=10;i>=1;i--) {
			System.out.println(i);
			
			try {
				sleep(1000);//1초간 정지
			} catch(InterruptedException ie) {}
		}//for
	}//스레드 문장 구현
} //Thread06 class 


public class ThreadEx06 {

	public static void main(String[] args) {
		
		Thread06 th=new Thread06();
		th.start();//스레드 시작
		String cityName = JOptionPane.showInputDialog("도시 이름 입력 >>");
		System.out.println("입력한 도시 이름 : "+cityName);

	}

}
