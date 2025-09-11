package src;

import java.util.ArrayList;
import java.util.List;

/* 2025 - 09 - 11
 * 개발자 : 최상철
 * 
 * 컬렉션에서 제네릭이 나온 배경에대해서 살펴 볼 수 있는 예제)
 * 
 * 1.<제네릭타입>은 레퍼런스 참조타입만 가능하고, 기본 타입으로는 지정할 수 없다. <제네릭타입>은 자바 5버전에서 추가되었다.
 * 2. 제네릭(지네릭스) 타입을 지정하면 지정한 자료형으로만 저장 가능하다.
 * 3. 제네릭 타입을 지정하지 않으면 불필요한 레퍼런스 간의 업캐스팅과 캐스팅 형변환 연산자를 사용한 명시적인 다운캐스팅을 해야하는 불편함이 있다.
 * 그만큼 프로그램 실행속도는 느려지고 코드는 복잡해져 가독성까지 떨어진다. 데이터의 안정성도 마찬가지.
 * 
 */

public class ListEx08 {

	public static void main(String[] args) {

		List cityList = new ArrayList(); // 제네릭타입을 지정하지 않은 상태에서 컬렉션 객체 cityList생성

		cityList.add("seoul"); // Object타입으로 업캐스팅 하면서 저장
		cityList.add("busan");
		cityList.add("daejeon");

		String temp = null;

		for (int i = 0; i < cityList.size(); i++) {
			if (cityList.get(i) instanceof String) { // 다운캐스팅이 가능한가?
				temp = (String)cityList.get(i); // 명시적인 다운캐스팅, get(i)메서드로 컬렉션 주소 인덱스 번호에 해당하는 원소값을 Object타입으로 가져옴.
			}
			System.out.print("도시이름을 영문 대문자로:"+ temp.toUpperCase() + "\t");
		}

	}

}
