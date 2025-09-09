package src;

/* 2025 - 09 - 09
 * 개발자 : 최상철
 * 
 * 봉인된/비봉인된 인터페이스를 활용하는 예제
 */

public class InterEx12 {
	public static void main(String[] args) {

		ImpClass imp = new ImpClass();

		InterfaceA ia = imp;
		ia.methodA();// 업캐스팅 이후 오버라이딩 한 메서드를 호출

		System.out.println("\n ============================ \n");

		InterfaceB ib = imp;
		ib.methodA();
		ib.methodB();

		System.out.println("\n =========================== \n");

		InterfaceC ic = imp;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
