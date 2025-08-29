/* 2025년 8월 28일
 * 개발자 : 최상철 
 * 
 * static 키워드로 정의된 변수 count를 정적 변수라고 한다.
 * 정적 변수는 클래스 변수로서 해당 클래스로 직접 접근가능 하다.
 * 인스턴스 초기화 블록 { } 을 사용해서 정적변수와 인스턴스변수 초기화를 해보고 그 차이점을 알아본다.
 *
 */

class Product {
	static int count = 0; // 정적 변수, 명시적 코드로 0으로 초기화
	int serialNo; // 인스턴스 변수 -> 생성된 객체마다 따로 관리한다.(생성된 객체마다 주소값이 다르다. 그러므로 다른값을 가진다.)

	{

		++count; // 생산대수를 카운터(생성된 객체마다 값을 공유 가능하다. -> 누적 생산대수)
		serialNo = count;

	}

	public Product() { // 기본생성자

	}

}

public class ConsTest04 {

	public static void main(String[] args) {

		Product p01 = new Product(); // 먼저 인스턴스 초기화 블록을 호출하고 그 다음에 생성자를 호출
		Product p02 = new Product(); // new Product(); 할 때 마다 해당 생성자와 인스턴스 초기화 블록을 호출 수행한다.
		Product p03 = new Product(); // p01, 02, 03은 각 객체주소가 다 다르다. 그러므로 고유한 값을 가진다.

		System.out.println("p01 제품번호(시리얼 번호) = " + p01.serialNo);
		System.out.println("p03 제품번호(시리얼 번호) = " + p02.serialNo);
		System.out.println("p03 제품번호(시리얼 번호) = " + p03.serialNo);
		
		System.out.println("총 생산대수 = " +Product.count+"대"); // 클래스명, 정적변수로 접근한다.
		
		

	}
}
