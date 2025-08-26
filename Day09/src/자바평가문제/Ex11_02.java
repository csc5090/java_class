package 자바평가문제;

/* 클래스와 객체 no14 2번 문제
 * 속성으로 자판기에서 취급하는 제품의 정보,가격을 저장하는 변수와 이를 다루기 위한 메서드를 갖는 자판기 클래스 만들기.
 *   출력 : 자판기 => 제품목록 : 커피 150원, 비타500 500원.
 */

class Product {
	private String name; // 상품명
	private int price; // 상품가격

	public void setName(String new_name) {
		name = new_name;
	} // setter 메서드

	public String getName() {
		return name;
	}// getter 메서드 값 반환 메서드

	public void setPrice(int new_price) {
		price = new_price;
	}

	public int getPrice() {
		return price;
	}

} // product class

public class Ex11_02 {

	public static void main(String[] args) {

		Product p01 = new Product();
		Product p02 = new Product();

		p01.setName("커피");
		p01.setPrice(150);
		p02.setName("비타500");
		p02.setPrice(500);

		System.out.println("자판기 => 제품목록");
		System.out.println(p01.getName() + " " + p01.getPrice() + "원, ");
		System.out.println(p02.getName() + " " + p02.getPrice() + "원 ");

	}

}
