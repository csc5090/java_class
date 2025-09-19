package src;

import java.io.OutputStream;

/* java.io 패키지의 OutputStream API 특징)
 * 1. OutputStream은 바이트 출력 스트림의 최상위 추상 클래스임.
 * 2. System.out은 모니터 출력장치와 연결됨.
 * 3. 
 * 
 */

public class IoEx02 {

	public static void main(String[] args) throws Exception {
		
		int data = 0; // 읽어들인 데이터를 저장할 변수
		System.out.print("이름 입력 >>");
		OutputStream myOut = System.out;
		
		while((data = System.in.read()) != -1) {
			myOut.write((char)data);
		} 
	}

}
