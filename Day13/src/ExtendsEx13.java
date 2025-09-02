/* 2025 - 09 - 02
 * 개발자 : 최상철
 *
 * static import 문
 * static improt 문을 사용하면 static 멤버(정적변수, 정적메서드)를 호출할 때 클래스 이름을 생략할 수 있다.
 * 그만큼 코드 라인이 줄어들고 간결해진다.
 * 
 */

import static java.lang.System.out;
import static java.lang.Math.*;
// java.lang은 기본패키지 경로이다. 기본 패키지 경로는 자바 코드상에서 생략해도 된다.
// import 키워드는 외부 패키지의 api를 읽어올 때 사용한다.

public class ExtendsEx13 {

	public static void main(String[] args) {

		out.println("난수 : " + random()); // System.이 생략됨, Math. 생략.
		out.println("원주율 : " + PI);

	}

}
