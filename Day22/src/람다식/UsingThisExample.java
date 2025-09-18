package 람다식;


/* 문제) UsingThis 외부클래스 객체명 usingThis 생성 후 인스턴스 멤버내부클래스 객체명 inner를 생성해서 멤버내부 클래스에
 * 정의된 method()를 호출하는 과정 코드 작성하기.
 * 
 * 
 */





public class UsingThisExample {

	public static void main(String[] args) {
		
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
	}

}
