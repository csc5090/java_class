package net.daum.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	
	//게시판 목록
	public List<BoardDTO> getBoardList() {
		List<BoardDTO> blist = new ArrayList<>();
		
		try {
			con = DriverManager.getConnection(url, user, pwd);
			sql = "select * from tbl_board order by bno desc"; //번호를 기준으로 내림차순 정렬
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) { //복수개의 레코드가 검색되는 경우는 while 반복문으로 처리, next() 메서드는 검색된 다음레코드가 존재하면 참.
				BoardDTO b = new BoardDTO();
				
				b.setBno(rs.getInt(1)); // 1의 뜻은 select 문 뒤에 검색되는 컬럼 순번임. 첫번째로 검색되는 컬럼으로부터 정수 숫자로 번호를 가져와 setter()에 저장.
				b.setBname(rs.getString(2)); // 2번째로 검색되는 컬럼으로부터 문자열로 글쓴이를 가져와 setter()에 저장.
				b.setBtitle(rs.getString("btitle"));
				b.setBcont(rs.getString("bcont"));
				b.setBdate(rs.getString("bdate"));
				
				blist.add(b); //복수개의 레코드 행을 컬렉션에 추가
			}
					
		} catch(Exception e) { e.printStackTrace();}
		finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch( Exception e) {e.printStackTrace();}
		}
		return blist;
	}
} // dao class
