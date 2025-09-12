package src;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* 2025 - 09 - 12
 * 개발자 : 최상철.
 * 
 * java 7버전에서 AutoClose 인터페이스가 추가되었다. 이 인터페이스를 구현상속 받은 자손 API는 try() 내에서 객체를 생성하면 
 * finally문에서 명시적으로 close() 닫지 않아도 자동으로 닫힌다.
 * 
 * 
 */

public class TryCatchEx09 {

	public static void main(String[] args) {

		List<String> cityList = new ArrayList<>(); // 문자열만 저장하는 컬렉션 제네릭 객체 cityList생성

		cityList.add("seoul");
		cityList.add("busan");
		cityList.add("daejeon");

		/*
		 * STS(이클립스) 개발툴에서 기본 경로로 인식하는 것은 프로젝트 경로이다. 여기서는 Day19. ./는 현재 경로를 의미하는 상대경로이다.
		 * 결국 ./는 Day19 프로젝트 경로를 의미한다.
		 * 
		 */

		try (PrintWriter output = new PrintWriter("./src/result.txt")) {
			// PrintWriter는 java.io 입출력 패키지 경로에 있는 문자 출력 스트림API이다.
			// AutoCloseable 인터페이스를 구현 상속받고 있다.

			for (String cityName : cityList) {
				output.println(cityName.toUpperCase());// 영문대문자로 변경해서 result.txt에 기록한다.
			} // 향상된 확장 for

		} // try end

	}

}
