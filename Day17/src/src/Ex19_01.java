package src;

import net.daum.model01.IShapeClass;
import net.daum.model02.Circ;
import net.daum.model02.Rect;
import net.daum.model02.Tria;

/* 2025 - 09 - 09 
 * 개발자 : 최상철
 * 
 * 1.net.daum.model01 패키지에 부모 인터페이스 IShapeClass.java를 만들고 추상메서드 void draw();를 정의한다.
 * 2.net.daum.model02 패키지에 부모 인터페이스 IShapeClass를 구현 상속한 자손클래스 Circ.java, Rect.java, Tria.java를 생성하고 
 *   부모 인터페이스의 추상메서드 draw();를 오버라이딩을 한 다음 실행문장으로 "타원을 그린다", "사각형을 그린다", "삼각형을 그린다",가 출력하게 한다. 
 * 
 * 그 후 다음과 같은 출력 결과물이 나오게 한다.
 * 
 * 타원을 그린다.
 * 사각형을 그린다.
 * 삼각형을 그린다.
 * ==============
 * 
 */

public class Ex19_01 {

	public static void main(String[] args) {
		

		IShapeClass shape;

        shape = new Circ();
        shape.draw();

        shape = new Rect();
        shape.draw();

        shape = new Tria(); 
        shape.draw();


	}

}
