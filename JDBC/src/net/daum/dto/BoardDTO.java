package net.daum.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter 
public class BoardDTO { // 중간 데이터 저장 빈 클래스 DTO -> tbl_board 테이블의 컬럼명(필드명)과 DTO 빈 클래스 멤버변수명을 일치시킨다.
	
	private int bno; //게시판 번호
	private String bname; //게시판 글쓴이
	private String btitle;
	private String bcont;
	private String bdate;
}
