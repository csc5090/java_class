package src;


/* 매개변수 타입이 기본타입이면 값이 전달된다.
 * 이것을 값에 의한 전달방식이라고 한다.
 * 그러므로 객체주소는 공유하지 않는다. 
 */

class Vm08 {
	void changeNumer(int y) { // int y 매개변수 타입이 기본타입.
		y = 100;
	}
}

public class MethodEx08 {

	public static void main(String[] args) {
		
		Vm08 vm = new Vm08();
		int x = 70;
		System.out.println("changeNumber() 메서드 호출 전 = "+ x); // 70
		vm.changeNumber(x);
		
		
		
		

	}

}
