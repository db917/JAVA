package park01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LoginService {
	Connection con;// Connection는 자바에서 제공하는 jdbc 의 일종인 인터페이스
	PreparedStatement pstmt;
	ResultSet rs;

	// 스테틱 블럭 클래스당 1번 초기화 하는 블럭 생성자에 넣어도되지만 생성자에 넣으면 객체선언할때마다 바인딩이 진행된다.
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

	private void connect() {

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "icia", "1234");
			con.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("DB접속 예외 발생");
			e.printStackTrace();
		}

	}

	private void close() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("DB접속종료 예외 발생");
			e.printStackTrace();
		}

	}

	public ArrayList<Member> login(String id, String pw) {
		connect(); // 디비접속
		try {
			String sql = "SELECT *FROM MEMBER WHERE ID=? AND PW=?";
			pstmt = con.prepareStatement(sql);// 1번 파싱(분석)
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			ArrayList<Member> memList = new ArrayList<>();
			Member mem;

			if (rs.next()) {
				if (rs.getString("id").equals("admin")) {
					sql = "SELECT *FROM MEMBER";
					pstmt = con.prepareStatement(sql);
					rs = pstmt.executeQuery();
					while (rs.next()) {
						mem = new Member();
						mem.setId(rs.getString("id"));
						mem.setPw(rs.getString("pw"));
						mem.setName(rs.getString("name"));
						mem.setAge(rs.getInt("age"));
						mem.setEmall(rs.getString("Emall"));
						memList.add(mem);
					}
				} else {
					mem = new Member();
					mem.setId(rs.getString("id"));
					mem.setPw(rs.getString("pw"));
					mem.setName(rs.getString("name"));
					mem.setAge(rs.getInt("age"));
					mem.setEmall(rs.getString("Emall"));
					memList.add(mem);
				}
				return memList;
			}

		} catch (

		SQLException e) {
			System.out.println("login 예외 발생");
			e.printStackTrace();
		} finally {
			close();
		}

		return null;
	}

}
