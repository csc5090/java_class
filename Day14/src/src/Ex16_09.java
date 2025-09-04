/*
 * 9번문제.,
 * 문제의 코드를 좀 더 합리적인 oop 코드로 바꾸기.,
 * 
 */

package src;

class A2 extends Object{
	
	@Override 
	public String toString() {
		return "4";
	}
}

class B2 extends A2 {
	@Override // 오버라이딩 한 메서드에서는 @Override 에너테이션을 추가한다.
	public String toString() {
		return super.toString()+"3"; // "43"이 반환
	}
}

public class Ex16_09 {
	public static void main(String[] args) {
		
		B2 b01 = new B2();
		System.out.println(b01.toString()); // toString() 메서드는 생략 가능함
		System.out.println(b01);
		
		System.out.println(new B2().toString());
		System.out.println(new B2());
		System.out.println(new A2().toString());
		
	}
}