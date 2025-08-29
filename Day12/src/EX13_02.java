/*
 * 2025 - 08 - 29
 * 개발자 : 최상철
 * 
 * 문제 2번.
 */

class Product2 {

	String name;
	int price;

	public Product2(String name) {
		this(name, 800);
	}

	public Product2(int price) {
		this("커피", 800);
	}

	public Product2(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void pr() {
		System.out.println(name + "," + price);
	}

}

public class EX13_02 {
	public static void main(String[] args) {
		Product2 p1 = new Product2("웰치스", 700);
		Product2 p2 = new Product2("커피");
		Product2 p3 = new Product2("물", 500);

		p1.pr();
		p2.pr();
		p3.pr();
	}
}
