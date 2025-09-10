package src;

import java.util.HashSet;
import java.util.Set;

/* 2025 - 09 - 10
 * 개발자 : 최상철
 * 
 * java.util 패키지의 컬렉션 Set 인터페이스의 특징)
 * 1. 저장되는 순서를 보장하지 않는다.
 * 2. 중복 원소값을 허용하지 않는다.
 * 
 */

public class ListEx01 {

	public static void main(String[] args) {
		Set set = new HashSet();// 부모 타입으로 업캐스팅한 컬렉션 객체 set 생성
		set.add(100); // int->Integer타입으로 오토박싱 된 다음 다시 최상위 부모 클래스 타입으로 업캐스팅 됨.
		set.add(10.3); // 오토박싱과 업캐스팅
		set.add(100); // 중복원소값 허용 안함.
		set.add("홍길동");//String -> Object 타입으로 업캐스팅
		set.add(true);
		
		System.out.println("컬렉션 크기인 원소 개수:"+set.size()); //size()메서드는 컬렉션 크기인 원소 개수 반환 -> 원래 개수는 5지만, 100중복 원소값을 허용 안해서 4로 변환.
		
		System.out.println(set);
		
	}

}
