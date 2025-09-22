package src;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* 2025 - 09 - 22
 * 개발자 : 최상철
 * 
 */


public class IoEx10 {

	public static void main(String[] args) {
		
		Customer cus = new Customer(7,"홍길동",25,173.7); //전달인자 4개짜리 오버로딩 된 생성자를 호출하면서 멤버변수 초기화
		
		try {
			System.out.println(cus.toString()); //.toString메서드는 생략 가능
			FileOutputStream fos = new FileOutputStream("./src/src/output.txt"); //생성자 인자값으로 주어진 파일 경로 속 파일의 바이트 단위로 기록하기 위한 fos 객체 생성
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cus);//객체 단위로 기록
			
			oos.close();
		} catch(IOException ie) {
			ie.printStackTrace();
		}

	}

}
