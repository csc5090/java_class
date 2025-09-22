package src;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/* 2025 - 09 - 22
 * 개발자 : 최상철
 * * 멀티스레드 기능이 없는 네트워크 클라이언트 채팅 프로그램
 * */

public class EchoClientEx {
	
	Socket client = null; // 서버와 통신하기 위해서 필요한 클라이언트 소켓
	String ip = null;
	static final int PORT = 7000;

	Scanner scan = null;

	InputStream is = null;
	ObjectInputStream ois = null; // 입력스트림

	OutputStream os = null;
	ObjectOutputStream oos = null; // 출력 스트림

	String sendData; // 서버로 보낼 메시지를 저장할 변수
	String receiveData; // 서버에서 받은 메시지를 저장할 변수

	public EchoClientEx(String ip) {
		this.ip = ip;

		try {
			System.out.println("##### 사용자 채팅 프로그램 #####");
			client = new Socket(ip, PORT); // 사용자 소켓 생성 -> 서버 접속이 이루어지는 경우이다.
			scan = new Scanner(System.in);

			os = client.getOutputStream();
			oos = new ObjectOutputStream(os);

			is = client.getInputStream();
			ois = new ObjectInputStream(is);

			System.out.print("입력 >> ");

			while ((sendData = scan.nextLine()) != null) {
				oos.writeObject(sendData); // 서버로 전송
				oos.flush(); // 출력스트림 비움

				if (sendData.equals("exit")) { // 문자열 내용이 'exit'와 같다면 참.
					break; //반복문 종료
				}

				receiveData = (String) ois.readObject();
				System.out.println(client.getInetAddress() + "로 부터 전송 받은 메시지 : " + receiveData);
				System.out.print("입력 >> ");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		} finally {
			try {
				if(ois != null) ois.close();
				if(is != null) is.close();
				if(oos != null) oos.close();
				if(os != null) os.close();
				if(client != null) client.close();
			} catch (IOException e) { e.printStackTrace(); }
		}
	} // 생성자

	public static void main(String[] args) {
		new EchoClientEx(""); // 서버 ip 주소를 입력
		/*
		 * 생성자 인자값으로 서버 ip 주소가 들어간다. localhost는 모든 내 자신 컴퓨터를 의미하는 호스트 이름. 127.0.0.1은 모든
		 * 내 자신 컴퓨터를 의미하는 ip주소임. 결국 내 자신 컴퓨터가 서버이고 클라이언트가 되는 것.
		 * 과제물 ) 1팀,2팀 각 팀장, 부팀장, 팀원이 각각 채팅 서버 프로그램이 되어서 각 팀원이 클라이언트가 되어
		 * 다중 사용자 접속이 이루어지는 테스트를 해본다. 
		 * 에러가 난다면 디버깅을 해야 함.
		 * * */
	}
}