/* 상속.dpf no.4문제
 * 
 * 
 */

class Animal04 {
	protected String kind;
	protected int leg;

	public Animal04() {
	}

	public Animal04(String Kind, int leg) {
		this.kind = Kind;
		this.leg = leg;
	}

	public void printKind() {
		if (kind.equals("소녀")) {
			System.out.println(kind + "는 사람이다.");
		}
	}

	public void walk() {
		if (leg == 2) {
			System.out.println("사람은 " + leg + "발로 걷는다.");
		}
	}
}

class Dog04 extends Animal04 {
	public Dog04() {
	}

	public Dog04(String kind, int leg) {
		super(kind, leg);
	}
	
	@Override 
	public void printKind() {
		if (kind.equals("강아지")) {
			System.out.println(kind + "는 동물이다");
		}
	}
	
	@Override 
	public void walk() {
		if (leg == 4) {
			System.out.println("강아지는 " + leg + "발로 걷는다.");
		}
	}

}// 생성자 오버로딩

class Human04 extends Animal04 {
	public Human04() {
	}

	public Human04(String kind, int leg) {
		super(kind, leg);
	}

}

public class Ex16_4 {
	public static void main(String[] args) {

		Dog04 d = new Dog04("강아지", 4);
		d.printKind();
		d.walk();

		Human04 h = new Human04("소녀", 2);
		h.printKind();
		h.walk();

	}
}