/* 2025 - 09 - 01
 * 개발자 : 최상철
 * 
 * lombok을 이용해 작성한 DTO 작성.
 * 
 */

import net.daum.dot.BoardDTO;

public class BoardMain {

	public static void main(String[] args) {

		BoardDTO board = new BoardDTO("홍길동", "게시판제목입니다.", "게시판 내용입니다."); // 전달인자 3개짜리 오버로딩된 생성자를 호출.

		System.out.println("글쓴이 : " + board.getWriter());
		System.out.println("글제목 : " + board.getTitle());
		System.out.println("글내용 : " + board.getContent());

	}

}
