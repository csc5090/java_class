/*
 * 래퍼런스 간의 형변환 중 업캐스팅 특징)
 * 1. 업캐스팅을 하려면 사전에 상속 관계가 반드시 필요.
 * 2. 업캐스팅이란 자손타입이 부모타입으로 올라가는 현상을 말함.
 * 업캐스팅은 암묵적인 자동 형변환을 해줌.
 * 
 * 
 */


package src;


class Mother01{
	public void m01() {
		System.out.println("부모클래스 m01() 메서드");
	}
}

class Child01 extends Mother01 {
	public void ch01() {
		System.out.println("자손클래스 ch01() 메서드");
	}
}



public class RefCast01 {

	public static void main(String[] args) {
		Mother01 m01; // 부모클래스 타입 참조변수 선언 --> 객체주소가 저장 안 된 참조변수 m01
		m01=new Child01();
		m01.m01();
		
		System.out.println("\n ======================= \n");
		
		Mother01 m02=new Child01();
		m02.m01();

	}

}
