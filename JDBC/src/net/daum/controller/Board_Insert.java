package net.daum.controller;

import java.util.Scanner;

import net.daum.dto.BoardDAOImpl;
import net.daum.dto.BoardDTO;

/* 게시판 입력 폼과 저장)
 * 스캐너로 게시판 글쓴이, 글제목, 글내용을 입력받아서 BoardDTO 빈 클래스에 저장한 다음 BoardDAOImpl로 전달해서 tbl_board테이블에 저장되게 한다.
 * 저장 후 반환값으로 정수 숫자 1을 리턴받아 if 조건문으로 1일 때 "게시판 저장에 성공했습니다."라는 메시지가 출력되게 한다.
 */

public class Board_Insert {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		BoardDAOImpl bdao = new BoardDAOImpl();

		System.out.println("######### 게시판 입력 ##########");
		System.out.println("-----------------------------");
		System.out.print("글쓴이 입력 >> ");

		String bname = scan.nextLine(); // 문자열로 입력받음

		System.out.print("글제목 입력 >> ");
		String btitle = scan.nextLine();
		System.out.print("글내용 입력 >> ");

		String bcont = scan.nextLine();

		BoardDTO b = new BoardDTO();
		b.setBname(bname);
		b.setBtitle(btitle);
		b.setBcont(bcont);

		int result = bdao.insertBoard(b); // 게시판 저장

		if (result == 1) {
			System.out.println("게시판 저장에 성공했습니다.");
		} // if

	}

}
