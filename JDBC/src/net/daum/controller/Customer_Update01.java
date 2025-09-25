package net.daum.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/* PreparedStatement JDBC 쿼리문 수행
Class.forName(driver) -> JDBC 드라이버 로드

1. Connection con = DriverManager.getConnection(url, user, password); ->
DB 접속 주소, 사용자, 비번으로 DB 연결 Connection 생성

2. PreparedStatement pstmt = con.prepareStatement(sql); ->
쿼리문을 미리 컴파일해서 수행할 pstmt 생성(보안이 좋고 실행속도가 빠르다. 실무에서 대부분 이 방법을 사용한다.)

3. pstmt.set컬럼타입(순번, 저장될 값); ->INSERT INTO 테이블명 (원하는 컬럼목록) VALUES(?, ...);
SQL문에서 저장될 임의의 ?값 순번에서 첫 번째 물음표에 해당 컬럼 타입으로 저장할 값을 설정한다.

int re = pstmt.executeUpdate(); ->INSERT, UPDATE, DELETE SQL문일 때
executeUpdate() 메서드로 해당 쿼리문을 수행하고, 반환값은 쿼리 수행 후 성공한 레코드 행의 개수가 반환된다.
 */

/* 스캐너를 사용하여 고객번호를 입력받아 오라클 customer테이블로부터 검색한 후 해당 고객 번호가 있다면 수정할
 * 고객이름, 고객 폰번호, 고객 이메일을 입력받아서 고객번호를 기준으로 수정되게 한다.
 * 없다면, 유효성 검증(validate) 경고 메시지를 출력하게 한다.
 * 
 */

public class Customer_Update01 {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "week";
		String password = "week";

		Connection con = null;
		PreparedStatement pt = null;
		ResultSet rs = null;
		String sql = null;

		try {
			Class.forName(driver); // 오라클 jdbc드라이버 클래스 로드
			con = DriverManager.getConnection(url, user, password); // 메서드 인자값으로 db접속주소, db 사용자, 비번을 전달해서 db연결.
			// con 생성
			Scanner scan = new Scanner(System.in);
			System.out.println(">>> 고객 정보 수정 <<<");
			System.out.print("기준이 되는 고객번호 입력 >> ");
			int cus_no = Integer.parseInt(scan.nextLine()); // 고객번호 문자열로 입력받아 정수로 변환.
			sql = "select cus_no from customer where cus_no=?"; // 고객번호를 기준으로 오라클DB로부터 고객번호를 검색.
			pt = con.prepareStatement(sql); // 쿼리문을 미리 컴파일하여 수행할 pt 생성.
			pt.setInt(1, cus_no); // 쿼리문의 첫번째 물음표에 정수 숫자로 고객번호 저장
			rs = pt.executeQuery();// 검색 쿼리문 수행 후 결과 레코드를 rs에 저장

			if (rs.next()) { // 검색된 레코드가 하나이면 if문으로 처리, next()메서드는 검색된 다음레코드가 존재하면 참.
				System.out.print("수정할 고객이름 입력 >> ");
				String cus_name = scan.nextLine();// 문자열로 입력받음
				System.out.print("수정할 고객 폰번호 입력 >> ");
				String cus_phone = scan.nextLine();
				System.out.print("수정할 고객 전자우편주소 입력");
				String cus_email = scan.nextLine();

				sql = "updata customer set cus_name=?, cus_phone=?, cus_email=?" + "where cus_no=?"; // 고객번호를 기준으로
				// 고객이름,고객폰번호,고객이메일주소를
				// 수정, 변경함.
				
				pt = con.prepareStatement(sql);
				pt.setString(1, cus_name); //수정 쿼리문 첫번째 물음표에 수정할 고객이름을 문자열로 저장
				pt.setString(2, cus_phone);
				pt.setString(3, cus_email);
				pt.setInt(4, cus_no);

				int re = pt.executeUpdate(); // 수정 쿼리문 수행 후 성공한 레코드 업데이트.

				if (re == 1) {
					System.out.println("고객정보 수정 성공");
				}
			} else {
				System.out.println("검색된 고객번호가 없습니다. 올바른 고객번호를 입력하세요.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pt != null)
					pt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
