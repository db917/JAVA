package park02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import common.JdbcUtil;
import park01.Member;

public class BoardService {
	Connection con;// Connection는 자바에서 제공하는 jdbc 의 일종인 인터페이스
	PreparedStatement pstmt;
	ResultSet rs;

	// 스테틱 블럭 클래스당 1번 초기화 하는 블럭 생성자에 넣어도되지만 생성자에 넣으면 객체선언할때마다 바인딩이 진행된다.
	public HashMap<String, Object> boardWrite() {
		// 글쓰기 Tx: 회원가입 --> 글쓰기

		
		con = JdbcUtil.getConnection();
		String id = "Y";
		try {
			String sql = "INSERT INTO MEMBER VALUES(?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			con.setAutoCommit(false);
			pstmt.setNString(1, id);
			pstmt.setNString(2, "1111");
			pstmt.setNString(3, "엑스");
			pstmt.setInt(4, 30);
			pstmt.setNString(5, "xxx@naver.com");
			int result = pstmt.executeUpdate();
			HashMap<String, Object> map = new HashMap<>();
			if (result != 0) {
				System.out.println("회원가입 성공");
				sql = "INSERT INTO BOARD VALUES(BOARD_SEQ.NEXTVAL,?,?,?,SYSDATE)";
				pstmt = con.prepareStatement(sql);
				pstmt.setNString(1, id);
				pstmt.setNString(2, "게시물 제목");
				pstmt.setNString(3, "무궁화 꽃이 피었습니다.");
				pstmt.setNull(4, java.sql.Types.NULL);
				result = pstmt.executeUpdate();
				if (result != 0) {
					System.out.println("글쓰기 성공");
					Member member = getMember(id);
					Board board = getBoard(id);
					map.put("member", member);
					map.put("board", board);
					JdbcUtil.commit(con);
					return map;
				} else {
					JdbcUtil.rollBack(con);
					System.out.println("글쓰기 실패");

				}
			} else {
				JdbcUtil.rollBack(con);
				System.out.println("회원가입 실패");

			}

		} catch (SQLException e) {
			JdbcUtil.rollBack(con);// 메소드정의
			System.out.println("boardWrite 예외발생");
			e.printStackTrace();
		} finally {
		
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			JdbcUtil.close(con);

		}
		return null;
	}

	

	private Board getBoard(String id) {
		try {
			String sql = "SELECT * FROM BOARD WHERE B_ID=? AND ROWNUM<=1";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {// 게시글이 존재하면
				Board board = new Board();
				board.setB_no(rs.getInt("B_NO"));
				board.setB_id(rs.getString("B_ID"));
				board.setB_title(rs.getString("B_TITLE"));
				board.setB_contents(rs.getString("B_CONTENTS"));
				board.setB_date(rs.getDate("B_DATE"));
				JdbcUtil.commit(con);
				return board;
			}

		} catch (SQLException e) {
			JdbcUtil.rollBack(con);
			System.out.println("getBoard 예외 발생");
			e.printStackTrace();
		}

		return null;
	}

	private Member getMember(String id) {
		try {
			String sql = "SELECT * FROM MEMBER WHERE ID=? AND ROWNUM<=1";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {// 아이디가 존재하면
				Member member = new Member();
				member.setId(rs.getString("ID"));
				member.setPw(rs.getString("PW"));
				member.setName(rs.getString("NAME"));
				member.setAge(rs.getInt("AGE"));
				member.setEmall(rs.getString("EMALL"));
				JdbcUtil.commit(con);
				return member;
			}

		} catch (SQLException e) {
			JdbcUtil.rollBack(con);
			System.out.println("getMember 예외 발생");
			e.printStackTrace();
		}

		return null;
	}

	
}
