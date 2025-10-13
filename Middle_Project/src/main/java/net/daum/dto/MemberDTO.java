package net.daum.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MemberDTO {
	/* 회원관리 데이터 저장 빈 클래스
	 * member테이블의 컬럼명과 데이터 저장 빈 클래스 멤버 변수명(속성명), 네임 파라미터 이름은 같게 한다.
	 * 이로 인해 코드 라인을 줄일 수 있다.
	 * 일대일 매핑이 되어 해당 테이블 컬럼 레코드 값이 mybatis와 연동되어 자동으로 변수명에 설정된다.
	 * 
	 */
	
	private String mem_id;
	private String mem_pwd;
	private String mem_name;
	private String mem_zip;
	private String mem_zip2;
	private String mem_addr;
	private String mem_addr2;
	private String mem_phone01;
	private String mem_phone02;
	private String mem_phone03;
	private String mail_id;
	private String mail_domain;
	private String mem_date;
	private int mem_state;
	private String mem_delcont;
	
	//관리자 회원관리에서 페이징 즉 쪽 나누기 관련 변수
	private int startrow;
	private int endrow;
	
	//검색기능->관리자 회원관리에서 사용
	private String find_name; //검색어
	private String find_field; //검색 필드
	
}
