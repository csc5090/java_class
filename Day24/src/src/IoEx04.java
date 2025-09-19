package src;

import java.io.File;

/* java.io 패키지의 File 클래스 api 특징)
 * 1. File 클래스를 활용하면 일반 게시판에 파일 첨부기능이 있는 자료실을 만들 수 있다. 여기서는 이 클래스 하위의 내장메서드 중
 * 	  list()에 대해서 알아본다.
 * 이 메서드 기능은 해당 경로에 있는 파일 목록을 문자열 배열로 반환한다.
 * 
 */



public class IoEx04 {

	public static void main(String[] args) {
		
		File dirFile = new File("./src");
		//이클립스 계열의 sts 개발툴에서 ./는 현재 경로를 의미하는 상대 경로인데, 인식하는 현재 경로는 프로젝트 경로인 Daty24이다.
		
		String[] fileList = dirFile.list();
		
		//일반 for반복문으로 파일목록을 가져와서 출력한다.
		for(int i=0; i<fileList.length; i++) {
			System.out.print(" "+ fileList[i]);
		} //for
		
		System.out.println("=================== \n");
		
		//자바 5버전에서 추가된 향상된 확장 for 반복문을 이용해서 파일목록을 출력
		for(String fileName:fileList) {
			System.out.print(" "+fileName);
		}
		
		System.out.println("\n ================ \n");
	}

}
