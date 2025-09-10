package src;

import java.util.Enumeration;
import java.util.Vector;

/* java.util 패키지의 Enumeration 인터페이스 특징)
 * 1. jdk 1.0 에서 추가된 인터페이스로 컬렉션에 저장된 복수개의 원소값을 순방향으로 읽어오는 용도로 사용되고 저장 되는 쓰임새로는 사용하지 않는다.
 * 2. Iterator 구버전으로 한 번 사용된 것을 다시 사용 할 수 없다. 다시 사용하려면 재생성해야 함.
 * 3. jdk 1.0에서 추가된 컬렉션 api하고 잘 맞는다.
 * 
 * 
 */
public class ListEx05 {

	public static void main(String[] args) {
		
		Vector<E> vec = new Vector();
		
		for(int i=1; i<=7; i++) {
			vec.add(new Integer(i&10));
		}
		
		Enumeration enu2 = vec.elements();
		while(enu2.hasMoreElements()) { // 벡터에 요소가 있다면
			System.out.println(enu2.nextElement());
		}

	}

}
