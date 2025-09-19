package src;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/* 원본 이미지를 복사하는 예제
 * 
 */

public class IoEx07 {

	public static void main(String[] args) throws IOException {

		System.out.println("컬러 이미지까지 그대로 복사하는 예제");

		Scanner scan = new Scanner(System.in);

		System.out.print("원본 이미지 파일명(./src/src/images/apple.jpg>>");
		String inputFileName = scan.nextLine();

		System.out.print("복사되어질 이미지 파일명(./src/src/images/apple_copy.jpg)>>");
		String outputFileName = scan.nextLine();

		try (InputStream inputStream = new FileInputStream(inputFileName);
				OutputStream outputStream = new FileOutputStream(outputFileName)) {
			// java 7버전에서 추가된 AutoCloseable 인터페이스를 구현상속 받은 자손은 try()내에서 객체를 생성하면 finally문에서
			// 명시적으로 close() 닫지 않아도 자동으로 닫힘.

			int data;
			while ((data = inputStream.read()) != -1) {
				outputStream.write(data); // 파일에 기록 즉 복사된다.
			} // while end
		} // try

		System.out.println(inputFileName + "을(를) " + outputFileName + " 으로 이미지를 복사했다.");
	}

}
