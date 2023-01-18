package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtil {

	static {
		// System.out.println("스테틱 블럭");
		try {
			// 드라이버 클래스 동적바인딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 동적 바인딩 실패");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {

		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "icia", "1234");
			con.setAutoCommit(false);
			return con;
		} catch (SQLException e) {
			System.out.println("DB접속 예외 발생");
			e.printStackTrace();
		}
		return null;

	}

	public static void close(ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			
		} catch (SQLException e) {
			System.out.println("DB접속종료 예외 발생");
			e.printStackTrace();
		}

	}
	public static void close(PreparedStatement pstmt) {
		try {
			
			if (pstmt != null)
				pstmt.close();
			
		} catch (SQLException e) {
			System.out.println("DB접속종료 예외 발생");
			e.printStackTrace();
		}
		
	}
	public static void close(Connection con) {
		try {
			
			if (con != null)
				con.close();
			
		} catch (SQLException e) {
			System.out.println("DB접속종료 예외 발생");
			e.printStackTrace();
		}
		
	}

	public static void rollBack(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			System.out.println("rollBack 예외 발생");
			e.printStackTrace();
		}
	}

	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {

			System.out.println("commit 예외 발생");
			e.printStackTrace();
		}

	}

}
