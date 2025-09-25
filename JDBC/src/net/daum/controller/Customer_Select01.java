package net.daum.controller;

/* 고객목록 보기)
 * JDBC 쿼리문 수행하는 Statement API를 사용한다. select 문 수행
   JDBC api는 java.sql.* 패키지에서 제공한다. *는 모든 API를 뜻한다.

    1. Class.forName(driver) -> JDBC드라이버 로드
      오라클 JDBC 드라이버 패키지 종류:
      oracle.jdbc.driver.OracleDriver -> 구식(옛날것),Oracle 공식 문서에서도 더 이상 권장되지 않음.
      oracle.jdbc.OracleDriver -> 신식 ,  Oracle이 공식적으로 제공하고 문서화한 JDBC 드라이버 클래스.
      최신 Oracle JDBC 드라이버에서는 이 클래스를 사용하도록 권장함.
   2. Connection con = DriverManager.getConnection(url, user, password); -> db접속주소,사용자,비번으로 DB연결 Connection 생성
   3. Statement stmt=con.createStatement(); -> 쿼리문을 수행할 stmt생성. 이 벙법은 쿼리문의 수행속도가 느리고 요즘은 잘 사용 안한다. 보안면에서 불리하고 가독성이 좋지
   않아 유지 보수면에서 불리하다.
   4. ResultSet rs=stmt.executeQuery("쿼리문"); -> select 검색 쿼리문 수행후 검색 결과를 ResultSet rs에 저장, select문일때는 executeQuery()메서드를 사용해서
   해당 sql문 수행
   5. 검색 결과 레코드가 복수개 일때는 while(rs.next()){}를 사용하고 한개일때는 if(rs.next()){}를 사용한다.
   6. if문과 while반복문에서 테이블 컬럼(필드)레코드를 가져올 때 해당 컬럼 타입에 따라 다음과 같이 가져온다. 해당 컬럼명이 cus_name이고 컬럼타입이 varchar2라면
      rs.get컬럼타입("컬럼명") 즉 rs.getString("cus_name")이다.

      rs.getString("필드명")으로 가져오면 속도는 약간 떨어지지만 가독성이 좋다.
      또는 rs.getInt(select문 뒤에 검색되는 컬럼순번) 대로 가져오면 속도는 조금 빠르지만 가독성이 나쁘다. 속도차는 거의 못느끼는 수준이디. 그러므로 유지 보수 차원에서
      가독성이 더 좋은 방법 rs.getString("필드명") 방법으로 해당 테이블 컬럼(필드) 레코드(컬럼에 저장된 한행의 자료집합)를 가져오는 것이 일반적이다.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Customer_Select01 {
	public static void main(String[] args) {

		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "week";
		String password = "week";

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "SELECT cus_no, cus_name, cus_phone, cus_email, cus_date FROM customer"; 

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			System.out.println(">>>>>>>>>>> 고객 목록 <<<<<<<<<<");
			System.out.println("고객번호 \t 고객이름 \t 고객폰번호 \t 고객이메일 \t 고객등록날짜");
			System.out.println("=====================================================");

			while (rs.next()) {
				int cus_no = rs.getInt("cus_no"); 
				String cus_name = rs.getString("cus_name");
				String cus_phone = rs.getString("cus_phone");
				String cus_email = rs.getString("cus_email");
				String cus_date = rs.getString("cus_date");

				System.out.println(cus_no + "\t" + cus_name + "\t" + cus_phone + "\t" + cus_email + "\t" + cus_date);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
	}
}