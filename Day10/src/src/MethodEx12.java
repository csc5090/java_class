package src;

/* 기본 타입 매개변수는 값만 전달된다. 객체주소를  공유하지 않아서 값도 공유할 수 없다. 
 */


class Data12 {
	int x; // 기본값 0으로 초기화
}

public class MethodEx12 {
	static void change(int a) {//int a라는 기본 타입 매개변수
		a=1000;
		System.out.println("change() a = "+a); //1000
		
	}

	public static void main(String[] args) {
		
		Data12 d = new Data12();
		d.x = 100;
		System.out.println("main() x="+d.x);
		
		change(d.x); // change() 메서드 호출하면서 값 100만 전달
		System.out.println("change() 메서드 호출 후 main() x="+d.x);

	}

}
