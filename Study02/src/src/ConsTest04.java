package src;

/* 2025 - 09 - 15
 * 개발자 : 최상철
 * 
 * 부모클래스 생성자가 오버로딩 되면 기본생성자 묵시적 제공하지 않음.
 * 이런경우 자손에서 부모의 기본 생성자를 호출하면 컴파일 에러가 남.
 * 이를 해결하는 가장 합리적인 두 번째 방법은 자손에서 부모의 오버로딩 된 생성자를 호출하면 됨.
 * 
 */



class Mother04 extends Object {
	protected int x;
	protected int y;
	
	public Mother04(int x, int y) {
		this.x=x;
		this.y=y;
	}
}


class Child04 extends Mother04 {
	int z;
	
	public Child04() {
		super(100,200); // 부모의 오버로딩 된 생성자 호출
		this.z=300;
	}
	
	public void print() {
		System.out.println("x="+x+",y="+y+",z="+z);
	}
	
}

public class ConsTest04 {

	public static void main(String[] args) {
		Child04 ch04 = new Child04();//기본생성자 호출.
		ch04.print();

	}

}
