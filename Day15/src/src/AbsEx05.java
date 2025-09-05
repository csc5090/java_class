package src;

import net.daum.mode101.ShapeClass;
import net.daum.model02.Circ;
import net.daum.model02.Rect;
import net.daum.model02.Tria;

public class AbsEx05 {

	private static ShapeClass shapeClass;

	public static void main(String[] args) {

		Circ c = new Circ();
		Rect r = new Rect();
		Tria t = new Tria();

		c.draw();
		r.draw();
		t.draw();

		System.out.println("\n ========================== \n");

		ShapeClass ref; // 부모 추상 클래스 타입으로 참조변수 선언 -> 객체주소가 저장 안 된 참조변수

		ref = new Circ(); // 업캐스팅
		ref.draw();// 업캐스팅 이후 오버라이딩 한 메서드 호출

		ref = new Rect();
		ref.draw();

		ref = new Tria();
		ref.draw();

		System.out.println("\n ======================= \n");

		ShapeClass[] arr = new ShapeClass[3];
		arr[0] = new Circ();// 업캐스팅
		arr[1] = new Rect();
		arr[2] = new Tria();

		for (int i = 0; i < arr.length; i++) {
			arr[i].draw(); // 업캐스팅 이후 오버라이딩 한 메서드 호출.
		}

		System.out.println("\n ====================== \n");

		/*
		 * 자바 5에서 추가된 향상 확장 for문을 사용해 배열값을 읽어온 다음 오버라이딩 한 메서드를 호출해보자.
		 */

		for (ShapeClass s : arr) {
			s.draw(); // 업캐스팅된 참조변수로 각 도형의 오버라이딩된 draw() 실행
		}

	}

}
