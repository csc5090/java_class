package net.daum.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //기본생성자 메서드까지 자동생성
@AllArgsConstructor //이 에노테이션은 @Data에 의해 생성된 기본생성자만 없어지고, 나머지 자동생성된 것은 그대로 있음.
					//모든 멤버변수를 인자로 받는 생성자 자동생성(생성자 오버로딩)
@NoArgsConstructor // 파라미터가 없는 기본생성자만 자동 생성



public class DeptDTO {
	
	
	/* 테이블 컬럼명과 DTO 빈클래스 변수명을 같게 한다.
	 * 
	 * DTO 빈클래스 멤버변수명과 테이블 컬럼명을 같게 하는 이유
	 * 
	 * 테이블 컬럼명과 DTO의 변수명이 같으면, DB ↔ Mybatis 간 데이터 매핑이 직관적이고 예측 가능해져서 유지 보수 용이하고 
       빈클래스 변수명을 무엇으로 할까 고민을 덜하게 해준다.
       mybatis 프레임웍 등에서 빈클래스 변수명과 컬럼명이 일치하면 일대일 매핑이 되어서 테이블 컬럼 레코드값을 자동으로 
       가져올수 있게 된다.그만큼 코드라인이 줄어든다.
       
       매핑(mapping)은 서로 다른 구조나 표현 방식을 가진 두 요소를 서로 연결하거나 대응시키는 작업을 의미
       일대일, 일대다, 다대일, 다대다 대응
	 */ 
	
	private int deptno; //부서번호
	private String dname; //부서명
	private String loc;
	
	

}
