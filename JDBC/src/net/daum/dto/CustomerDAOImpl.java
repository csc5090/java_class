package net.daum.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*  JDBC api는 java.sql.* 패키지에서 제공한다. *는 모든 API를 뜻한다.
PreparedStatement JDBC 쿼리문 수행하는 api를 사용해서 customer 테이블의 고객정보를 고객번호를 기준으로 검색하는 부분과 수정 삭제하는 jdbc코드를 작성한다. 
insert,update,delete SQL문일때는 executeUpdate()메서드로 해당 쿼리문을 수행하고 반환값은 해당 쿼리문 수행후 성공한 레코드 행의 개수가 반환한다.
select 쿼리문일 때는 executeQurey() 메서드로 해당 검색 쿼리문을 수행하고 결과 레코드를 ResultSet rs에 저장한다.
ResultSet rs = pstmt.executeQuery(); 검색 결과 레코드가 복수개이면 while(rs.next()){} 반복문으로 처리하고, 한개 레코드이면 if(rs.next())로 처리한다.
if문과 while반복문에서 테이블 컬럼(필드)레코드를 가져올 때 해당 컬럼 타입에 따라 다음과 같이 가져온다. 해당 컬럼명이 cus_name이고 컬럼타입이 varchar2라면
   rs.get컬럼타입("컬럼명") 즉 rs.getString("cus_name")이다.

   rs.getString("필드명")으로 가져오면 속도는 약간 떨어지지만 가독성이 좋다.
   또는 rs.getInt(select문 뒤에 검색되는 컬럼순번) 대로 가져오면 속도는 조금 빠르지만 가독성이 나쁘다. 속도차는 거의 못느끼는 수준이디. 그러므로 유지 보수 차원에서
   가독성이 더 좋은 방법 rs.getString("필드명") 방법으로 해당 테이블 컬럼(필드) 레코드(컬럼에 저장된 한행의 자료집합)를 가져오는 것이 일반적이다.

1. Class.forName(driver) -> JDBC드라이버 로드
2. Connection con = DriverManager.getConnection(url, user, password); -> db접속주소,사용자,비번으로 DB연결 Connection 생성
3. PreparedStatement pt=con.prepareStatement(sql); -> 쿼리문을 미리 컴파일해서 수행할 pt생성(보안이 좋고 실행속도가 빠르다. 실무에서 대부분 이 방법을 사용한다.)
4. pt.set컬럼타입(1,저장될 값); 으로 해당 update 테이블명 set 컬럼명=?,... where cus_no=?; SQL문에서 임의의 모르는 ?값 순번에서 첫번째 물음표에 해당 컬럼타입으로
저장할 값을 저장한다.
5. 쿼리문 ?순번대로 모든 값을 저장한 다음 int re=pt.executeUpdate(); 매서드로 해당 삭제 쿼리문을 수행한다. 저장 쿼리문 수행후 성공한 레코드 행의 개수 주로 정수값 1
을 반환
 */

public class CustomerDAOImpl {

	String driver = "oracle.jdbc.driver.OracleDriver"; // oracle.jdbc.driver는 패키지명, OracleDriver는 오라클 jdbc 드라이버 클래스명.
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // 오라클 접속 주소, 1521은 오라클 연결 포트번호, xe는 데이터베이스명
	String user = "week";
	String pwd = "week";

	Connection con = null; // 데이터베이스 연결할 커넥션 오픈
	PreparedStatement pstmt = null; // 쿼리문 수행 담당
	ResultSet rs = null; // 오라클에서 내준 결과를 저장할 rs
	String sql = null; // 쿼리문이 담길 변수

	public CustomerDAOImpl() {
		try {
			Class.forName(driver); // JDBC 드라이버 클래스 로드.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// 기본생성자

	public CustomerDTO getFindCusNo(int cus_no) {
		CustomerDTO cusNo = null;

		try {
			con = DriverManager.getConnection(url, user, pwd);
			sql = "select cus_no from customer where cus_no=?"; // 고객번호 기준 해당테이블로부터 검색
			pstmt = con.prepareStatement(sql); // 쿼리문을 미리 컴파일하여 수행할 pstmt 생성. 객체생성용?
			pstmt.setInt(1, cus_no); // 쿼리문 첫번째 물음표에 값 초기화.
			rs = pstmt.executeQuery(); // select 검색 쿼리문 수행 후 결과문을 rs에 저장. 변수 sql의 값들이 저장됨.
			if (rs.next()) { // next() 메서드는 검색된 다음레코드가 존재하면 참.
				cusNo = new CustomerDTO();
				cusNo.setCus_no(rs.getInt(1)); // 1의 의미 : select문 뒤 검색되는 컬럼 순번. 검색된 첫번째 컬럼 레코드를 정수 숫자1로 가져와서 (getInt(1))
				// setter() 메서드에 저장됨.

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cusNo;
	} // getFindCusNo

	// 고객번호를 기준으로 정보 삭제.
	public int delCus(int cus_no) {
		int re = -1; // 삭제 실패시 반환값

		try {
			con = DriverManager.getConnection(url, user, pwd);
			sql = "delete from customer where cus_no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, cus_no);

			re = pstmt.executeUpdate(); // 삭제 쿼리문 수행 후 성공한 레코드 행의 개수 반환.

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return re;
	}// delCus - 삭제 메서드

}
