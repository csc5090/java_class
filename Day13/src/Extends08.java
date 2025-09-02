/* 2025 - 09 - 01
 * 개발자 : 최상철
 * 
 * 1. 생성자는 상속되지 않는다.
 * 2. 상속관계에서 부모클래스의 생성자를 호출할 때는 super();
 * 3. 
 * 
 */


class Parent08 extends Object { // extends Object는 생략 가능.
	protected int x=10;
	protected int y=20;
	
	public Parent08() { // 매개변수가 없는 기본생성자
		super();//생략 가능. 최고 조상 OPbject클래스의 기본 생성자를 호출하면 끝이 난다.
		System.out.println("부모 Parent08 기본생성자 호출");
	}
}

class Child08 extends Parent08{
	protected int z=30;
	
	public Child08() {
		//super();가 생략됨. 부모클래스 Parent08 기본생성자를 먼저 호출.
		System.out.println("자손 Child08의 기본생성자");
	}
	
	public void pr() {
		System.out.println("x="+x+" ,y="+y+" ,z="+z);
	}
}



public class Extends08 {

	public static void main(String[] args) {
		
		Child08 ch08=new Child08();  // new Child08(); 에 의해서 자손클래스 Child08 기본 생성자 호출
		ch08.pr();

	}

}
