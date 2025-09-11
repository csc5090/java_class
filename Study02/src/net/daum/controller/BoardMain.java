package net.daum.controller;

import net.daum.dto.BoardDTO;

/* 람복 라이브러리가 적용된 BoardDTO 데이터 저장 빈 클래스를 활용하는 예제)
 * 
 * 
 */


public class BoardMain {

	public static void main(String[] args) {
		
		BoardDTO board = new BoardDTO();
		
		board.setWriter("홍길동");
		board.setTitle("게시판 제목입니다.");
		board.setContent("게시판 내용입니다.");
		
		System.out.println("글쓴이 : "+board.getWriter());
		System.out.println("글제목 : " +board.getTitle());
		System.out.println("글내용 : "+board.getContent());

	}

}
