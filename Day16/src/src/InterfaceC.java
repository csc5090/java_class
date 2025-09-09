package src;

/* 2025 - 09 - 09
 * 개발자 : 최상철
 * 
 * InterfaceB 비봉인 부모 인터페이스를 상속받은 일반 자손 인터페이스인 InterfaceC
 * 
 * 
 */



public interface InterfaceC extends InterfaceB {
	
	public abstract void methodC();//추상메서드 정의 -> public abstract 생략 가능

}
