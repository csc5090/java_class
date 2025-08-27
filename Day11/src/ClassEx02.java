/* 2025년 8월 27일
 * 개발자 : 최상철
 * 
 * # 메서드 리턴타입을 참조형으로 한 경우
 */

class Data13 {
	int x;
}

public class ClassEx02 {

	public static void main(String[] args) {

		Data13 d = new Data13();
		d.x = 10;

		Data13 d2 = copy(d); // d2와 d는 서로 다른 객체주소를 가진다. d2=tmp, 즉 d2와 tmp는 같은 객체주소를 가진다.
		System.out.println("d.x=" + d.x);
		System.out.println("d2.x=" + d2.x);
	}

	static Data13 copy(Data13 d) { // 메서드 반환타입이 Data13 클래스형 참조타입인 경우
		Data13 tmp = new Data13(); // 새로운 객체명 tmp를 생성하면 새로운 객체주소가 할당된다.
		tmp.x = d.x; // tmp와 d는 서로 다른 객체주소를 가진다. 값만 복사

		return tmp;

	}

}
