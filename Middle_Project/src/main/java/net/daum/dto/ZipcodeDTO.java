package net.daum.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ZipcodeDTO {
	//우편번호 주소 데이터 저장 빈 클래스
	//zipcode 테이블 컬럼명과 저장 빈 클래스 변수명은 일치시킨다.
	
	private int no;
	private String zipcode;
	private String sido;
	private String gugun;
	private String dong;
	private String bunji;
}
