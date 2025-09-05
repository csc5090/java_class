package src;

/*
 * 추상클래스 특징)
 * 1. 추상클래스는 abstract class 키워드로 정의한다.
 * 2. 추상클래스는 new 키워드로 객체 생성을 할 수 없다. 
 */

abstract class Abs01 {
	//abstract class 키워드로 추상클래스 정의
}


public class AbsEx01 {

	public static void main(String[] args) {
		
		Abs01 abs = new Abs01();
		//new 키워드로 추상클래스는 객체생성을 할 수 없음.  abstract 키워드 때문. abstract : 직접 개체를 만들면 안 된다는 키워드.
		//abstract : 상속 전용 베이스 클래스로 의도했고, 이 클래스는 단독으로 쓰라고 만든 게 아니니까 하지마라.
	

	}

}
