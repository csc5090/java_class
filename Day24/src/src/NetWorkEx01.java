package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* 2025 - 09 - 22
 * 개발자 : 최상철
 * 
 * 
 * www.nate.com 이라는 도메인을 가진 웹사이트 주소를 입력하면 이 주소에 대한 ip 주소를 알아내는 소스.
 */

public class NetWorkEx01 {

	public static void main(String[] args) throws Exception {
		
		
		BufferedReader reader;
		String url = null;
		InetAddress addr = null; //ip 번호를 처리할 때 사용하는 클래스
		
		reader = new BufferedReader(new InputStreamReader(System.in));
		/* 1. System.in은 키도브 입력장치와 연결됨.
		 * 2. InputStreamReader는 읽어들인 바이트 스트림을 문자스트림으로 변경
		 * 3. BufferedReader는 읽어들인 문자를 임시메모리에 버퍼링(임시저장)하여 한꺼번에 한 줄 끝까지 문자열로 통으로 읽어들임. 그만큼 효율적.
		 */
		
		System.out.print("사이트 주소 입력(www.nate.com)>> ");
		url = reader.readLine(); //한줄 끝까지 문자열로 읽어들임.
		
		try {
			addr = InetAddress.getByName(url); //인자값으로 주어진 url에 대한 InetAddress 객체 변환
		} catch (UnknownHostException ue ) {
			ue.printStackTrace();
		}
		System.out.println("\n ========== \n");
		System.out.println(url+" 에 대한 ip 주소 반환 : " + addr.getHostAddress());
		
		
	}

}
