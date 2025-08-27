package src;

class Board06 {
	String writer = "홍길동"; // 게시판 글쓴이
	String title = "게시판 제목";
	String cont = "게시판 내용";
}


public class MethodEx10 {

	public static void main(String[] args) {
		
		Board06 board;
		/* 참조변수 board만 선언하고 객체주소를 대입하지 않으면 해당 변수는 지역변수라서 클래스 소속의 멤버변수처럼 기본값 null로 초기화가 안된다.
		 * 이런 경우 해당 참조변수 board로 Board06 클래스 소속의 멤버변수인 속성에 접근하면 초기화가 되지 않아서 컴파일 에러가 발생한다.
		 * 만약 클래스 소속의 멤버변수라면 기본값 null로 초기화가 되고 해당 멤버변수로 인스턴스 변수에 접근하면 컴파일은 되지만, 
		 * NullPointerException 예외 오류가 발생한다.
		 * 
		 * 지역변수는 기본 초기값이 없다. 그러므로 선언과 동시에 명시적인 코드로 초기화를 해야 한다.
		 */
		
		System.out.println(board.writer+","+board.title+","+board.cont);


	}

}
