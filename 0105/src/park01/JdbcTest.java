package park01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class JdbcTest {
	Connection con;// Connection는 자바에서 제공하는 jdbc 의 일종인 인터페이스
	Statement stmt;
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
			System.out.println("con=" + con);

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

	private void select() {

		try {
			stmt = con.createStatement();
			String sql = "SELECT*FROM MEMBER";
			rs = stmt.executeQuery(sql); // 셀렉트문일때만 사용
			while (rs.next()) {
				System.out.println("아이디:" + rs.getString("ID") + ",비번:" + rs.getString("PW") + ",이름:"
						+ rs.getString("NAME") + ",나이:" + rs.getInt("AGE") + ",이메일:" + rs.getString("EMALL"));
			}
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		} catch (SQLException e) {
			System.out.println("select 예외 발생");
			e.printStackTrace();
		}

	}

	private void insert() {
		try {
			stmt = con.createStatement();
			String sql = "INSERT INTO MEMBER VALUES('F','1111','에프',15,'F@NAVER.COM')";
			int cnt = stmt.executeUpdate(sql); // insert,update,delete
			if (cnt != 0) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
		} catch (SQLException e) {
			System.out.println("INSERT 예외 발생");
			e.printStackTrace();
		}

	}
	private void delete() {
		try {
			stmt = con.createStatement();
			String sql= "DELETE FROM MEMBER WHERE ID='F'";
			int cnt = stmt.executeUpdate(sql);
			if (cnt != 0) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
		} catch (SQLException e) {
			System.out.println("DELETE 실패");
			e.printStackTrace();
		}
		
		
	}
	private void update() {
		try {
			stmt = con.createStatement();
			String sql= "UPDATE MEMBER SET AGE=30,PW=2222 WHERE ID='F'";
			int cnt = stmt.executeUpdate(sql);
			if (cnt != 0) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
		} catch (SQLException e) {
			System.out.println("UPDATE 실패");
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		JdbcTest db = new JdbcTest();

		db.connect();// 접속
		db.select();
		db.insert();
		db.select();
		db.update();
		db.select();
		db.delete();
		db.select();
		db.close();// 접속해제

	}

}
