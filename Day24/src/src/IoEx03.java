package src;

import java.io.InputStream;
import java.io.OutputStream;

/* java.io 입출력 패키지의 API인 InputStream,OutputStream 을 활용해서 입력문자가 
 * 영문 단일 소문자 'x'이거나 단일 대문자 'X'이면 while반복문을 중단함	.
 * 
 */


public class IoEx03 {

	public static void main(String[] args) {
		
		int data = 0;
		InputStream myIn = System.in;
		OutputStream myOut = System.out;
		
		System.out.print("문자 입력>>");
		
		try {
			
			while((data = myIn.read()) != -1 ){
				if(data == 'x' || data == 'X') {
					break; 
				}
				myOut.write((char)data);
			}
			
		} catch(Exception e) {e.printStackTrace();}

	}

}
