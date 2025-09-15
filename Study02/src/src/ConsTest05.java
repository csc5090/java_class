package src;

/* 레퍼런스간의 형변환 중 업캐스팅이란?
 * 1. 업캐스팅을 하려면 사전에 상속관계를 만들어야 한다.
 * 2. 상속관계에서 자손타입이 부모 타입으로 올라가는 것을 말한다. 
 * 
 * 레퍼런스 간의 형변환 중 다운캐스팅이란? 
 * 1. 다운캐스팅을 할려면 사전에 상속 관계를 만들어야 한다.
 * 2. 다운캐스팅을 하기 전 사전에 업캐스팅을 해야 한다.
 * 3. 캐스팅연산자를 사용해서 명시적인 다운캐스팅을 해야 한다.
 * 
 * 업캐스팅 이후 자손에서 오버라이딩 한 메서드를 호출한다.
 */


class Mother05{
	public void m05() {
		System.out.println("부모클래스 m05() 메서드");
	}
	
}

class Child05 extends Mother05{
	
	@Override
	public void m05 () {
		System.out.println("오버라이딩 한 메서드 호출");
	}
	
	public void ch05() {
		System.out.println("자손에서 정의한 ch05() 메서드 호출");
	}
	
}


public class ConsTest05 {

	public static void main(String[] args) {
		
		Mother05 m05=new Child05(); //업캐스팅
		m05.m05();//업캐스팅 이후 오버라이딩 한 메서드 호출
		
		Child05 ch05=(Child05)m05; //명시적인 다운캐스팅
		ch05.ch05(); // 자손에서 정의한 메서드 호출
	}

}
