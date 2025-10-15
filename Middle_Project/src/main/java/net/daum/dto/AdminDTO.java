package net.daum.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AdminDTO {//Admin 관리자 테이블의 컬럼명과 빈 클래스 변수명을 같게 한다.
	
	private int admin_no;
	private String admin_id;
	private String admin_pwd;
	private String admin_name;
	private String admin_date;
	
}
