package src;

import net.daum.mode101.ShapeClass;
import net.daum.model02.Circ;
import net.daum.model02.Rect;
import net.daum.model02.Tria;

/* 2025-09-08
 * 
 * 개발자 : 최상철
 * 
 * 1. 상속, 업캐스팅 등 자바 OOP 문법이 적용된 매개변수 다형성이 적용되면 자손클래스 개수만큼 메서드 오버로딩을 안해도 된다.
 * 그만큼 중복코드를 안 하게 되고 코드가 간결해진다. 부모 타입 매개변수로 모든 자손 타입을 받을 수 있다.
 * 
 * 2. 매개변수 다형성 문법이 적용되지 않으면 자손 클래스 개수만큼 매개변수 타입을 적용해서 오버로딩을 해야 한다.
 * 따라서 그만큼 중복코드 라인이 늘어난다.
 * 결국 자손 클래스 개수만큼 자손의 매개변수 타입을 다르게 한 메서드를 오버로딩 해주어야 한다.
 * 
 */

public class AbsEx06 {
	//매개변수 다형성 문법이 적용된 경우 -> 업캐스팅
	static void 입고01(ShapeClass ref) {//매개변수 타입을 부모 추상클래스로 하면 모든 자손을 업캐스팅 하면서 받을 수 있다.
		ref.draw(); // 업캐스팅 이후 오버라이딩 한 메서드 호출
		
	} //입고01()
	
	static void 입고02(Circ c) { // 불필요하게 자손클래스 타입을 다르게 한 메서드 오버로딩을 해야한다.
		c.draw();
		
	}
	
	static void 입고02(Rect r) {
		r.draw();
	}
	
	static void 입고02(Tria t) {
		t.draw();
	}

	public static void main(String[] args) {
		
		Circ c = new Circ();
		Rect r = new Rect();
		Tria t = new Tria();
		
		입고01(c); 입고01(r); 입고01(t);

		System.out.println("\n --------------> \n");
		
		입고02(new Circ()); 입고02(new Rect()); 입고02(new Tria());
		
	}

}
