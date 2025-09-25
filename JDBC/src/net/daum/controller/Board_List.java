package net.daum.controller;

import java.util.List;

import net.daum.dto.BoardDAOImpl;
import net.daum.dto.BoardDTO;

//게시판 목록 보기

public class Board_List {

	public static void main(String[] args) {

		BoardDAOImpl bdao = new BoardDAOImpl();
		List<BoardDTO> blist = bdao.getBoardList();

		System.out.println(">>>>>> 게시판 목록 <<<<<<");
		System.out.println("번호 \t 제목 \t 글쓴이 \t ");
		System.out.println("=====================");

		if (blist != null && blist.size() > 0) { // size()는 컬렉션 원소 개수를 반환
			for (BoardDTO b : blist) {
				System.out.println(b.getBno() + "\t" + b.getBtitle() + "\t" + b.getBname() + "\t" + b.getBcont() + "\t"
						+ b.getBdate());
			}
		} else {
			System.out.println("게시판 목록이 존재하지 않음.");
		} // if
	}

}
