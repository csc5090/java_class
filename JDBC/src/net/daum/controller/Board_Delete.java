package net.daum.controller;

import java.util.Scanner;

import net.daum.dto.BoardDAOImpl;
import net.daum.dto.BoardDTO;

/* 게시판 삭제)
 * 스캐너로 게시판 번호를 입력받아서 tbl_board 테이블로부터 검색한 다음, 번호가 있다면 번호를 기준으로 삭제되게 한다.
 * 없다면 유효성 검증 메시지를 띄우게 한다.
 * 
 */

public class Board_Delete {

	public static void main(String[] args) {

		BoardDAOImpl bdao = new BoardDAOImpl();
		Scanner scan = new Scanner(System.in);

		System.out.println("###### 게시판 삭제 ######");
		System.out.print("기준이 되는 게시판 번호 입력 >> ");
		int bno = Integer.parseInt(scan.nextLine());

		// 오라클로부터 번호값 검색  
		BoardDTO find_Bno = bdao.getFindNo(bno);

		if (find_Bno == null) {
			System.out.println("해당 게시판 번호가 없어서 삭제 불가능.");
		} else {
			bdao.deleteBoard(bno);
			System.out.println("삭제 완료");
		}

	}

}
