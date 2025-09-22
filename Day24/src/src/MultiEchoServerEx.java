package src;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/* 2025 - 09 - 22
 * 개발자 : 최상철
 * * 다중 사용자 접속을 채팅서버 프로그램이 받기 위해서는 멀티스레드 기능이 있어야 함.
 * 그러므로 멀티쓰레드 기능이 들어간 다중 사용자 접속을 받을 수 있는 네트워크 채팅서버 프로그램임.
 * */

public class MultiEchoServerEx {

	ServerSocket server;
	static final int PORT = 7000;

	// 1. 모든 클라이언트의 출력 스트림을 저장할 공유 리스트를 추가했습니다.
	List<ObjectOutputStream> clientList = Collections.synchronizedList(new ArrayList<>());

	public MultiEchoServerEx() {
		try {
			server = new ServerSocket(PORT);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

		System.out.println("###### 다중 사용자 접속을 기다리기 위한 멀티채팅 서버 ######");
		System.out.println("멀티채팅서버는 사용자 접속을 항상 기다리고 있음.");

		while (true) {
			try {
				Socket child = server.accept();

				// 2. 각 스레드에 공유 리스트를 전달하도록 수정했습니다.
				EchoServerThread childThread = new EchoServerThread(child, clientList);
				Thread th = new Thread(childThread);
				th.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new MultiEchoServerEx();
	}
}

class EchoServerThread implements Runnable {
	Socket child;
	List<ObjectOutputStream> clientList;

	InputStream is;
	ObjectInputStream ois;
	OutputStream os;
	ObjectOutputStream oos;
	String receiveData;

	public EchoServerThread(Socket child, List<ObjectOutputStream> clientList) {
		this.child = child;
		this.clientList = clientList;

		try {
			System.out.println(child.getInetAddress() + "로 부터 연결 요청");

			is = child.getInputStream();
			ois = new ObjectInputStream(is);
			os = child.getOutputStream();
			oos = new ObjectOutputStream(os);

			// 3. 새로 접속한 클라이언트의 출력 스트림을 공유 리스트에 추가합니다.
			clientList.add(oos);

		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				receiveData = (String) ois.readObject();
				System.out.println(child.getInetAddress() + "로부터 받은 메시지: " + receiveData);

				if (receiveData.equals("exit")) {
					break;
				}

				// 4. 받은 메시지를 모든 클라이언트에게 전송합니다.
				broadcast(receiveData);
			}
		} catch (Exception e) {
			System.out.println("사용자 연결 종료: " + child.getInetAddress());
		} finally {
			try {
				// 5. 연결이 끊긴 클라이언트의 스트림을 리스트에서 제거합니다.
				clientList.remove(oos);
				if (oos != null)
					oos.close();
				if (os != null)
					os.close();
				if (ois != null)
					ois.close();
				if (is != null)
					is.close();
				if (child != null)
					child.close();
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}

	// 6. 모든 클라이언트에게 메시지를 보내는 메서드(브로드캐스팅)를 추가했습니다.
	public void broadcast(String message) {
		synchronized (clientList) {
			for (ObjectOutputStream clientStream : clientList) {
				try {
					clientStream.writeObject(message);
					clientStream.flush();
				} catch (IOException e) {
					// 오류가 발생하면 해당 클라이언트의 연결이 끊긴 것으로 간주합니다.
				}
			}
		}
	}
}