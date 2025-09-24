package net.daum.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDAOImpl {

	String driver = "oracle.jdbc.driver.OracleDriver";// oracle.jdbc는 패키지명, OracleDriver는 오라클 jdbc
	// 드라이버클래스명
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";// 오라클 접속 주소, 1521은 오라클 연결 네트워크 포트번호, xe는 데이터베이스명
	// 127.0.0.1은 모든 내자신 컴퓨터 IP 주소
	String user = "week";// 오라클 접속 사용자
	String pwd = "week";// 사용자 비번

	Connection con = null;// 데이터베이스 연결 con
	PreparedStatement pstmt = null;// 쿼리문을 수행할 pstmt
	ResultSet rs = null;// 검색 결과 레코드를 저장할 rs
	String sql = null;// 쿼리문 저장 변수

	public BoardDAOImpl() {
		try {
			Class.forName(driver);// JDBC 드라이버 클래스 로드
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// 기본 생성자

	public int insertBoard(BoardDTO b) {
		int re = -1;

		try {

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con = DriverManager.getConnection(url, user, pwd); // 인자값으로 db 로그인.
				sql = "insert into tbl_board values(bno_seq.nextval,?,?,?,sysdate)";
				pstmt = con.prepareStatement(sql); // 쿼리문을 미리 컴파일.
				pstmt.setString(1, b.getBname());
				pstmt.setString(2, b.getBtitle());
				pstmt.setString(3, b.getBcont());

				re = pstmt.executeUpdate();

				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return re;
	}

} // dao class
