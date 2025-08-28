
/* 2025년 8월 28일
 * 개발자 : 최상철 
 * 
 * 생성자의 특징)
 * 생성자가 오버로딩이 되면 자바 컴파일러는 더이상 묵시적인 기본생성자를 제공하지 않는다.
 */

class Board06{
	private String writer; //게시판 글쓴이
	private String title; //게시판 글제목
	
	// 생성자를 오버로딩해서 매개변수가 없는 기본생성자를 더이상 묵시적 제공하지 않 음.


public Board06(String new_writer, String new_title) {
	writer = new_writer;
	title = new_title;
} //전달인자 개수를 다르게 한 생성자 오버로딩

public void print() {
	System.out.println("게시판 글쓴이 : "+ writer +", 게시판 제목 : "+title);
}
}


public class ConsEx06 {

	public static void main(String[] args) {
		Board06 b=new Board06(); // 묵시적으로 제공하지 않는 기본생성자를 호출하려다가 컴파일 에러가 남.
		b.print();
		
		Board06 b2=new Board06("홍길동", "게시판 제목입니다.");
		b2.print();
		
		

	}

}
