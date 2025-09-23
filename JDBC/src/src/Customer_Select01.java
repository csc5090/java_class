package src;

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