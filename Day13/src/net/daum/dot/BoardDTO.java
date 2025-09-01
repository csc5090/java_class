package net.daum.dot;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // 기본생성자, canEqual(), equals(), getter(), hashCode(), setter(), toString() 메서드 자동 추가
@AllArgsConstructor // Constructor는 생성자란 뜻이고, @AllArgsConstructor 에노테이션을 사용하면 기본생성자는 사라지고 멤버변수 개수만큼
					// 오버로딩 된 생성자가 자동으로 추가됨.

public class BoardDTO {
	private String Writer; // 글쓴이
	private String title; // 글제목
	private String content; // 글내용

}
