package controller;

import bean.PhoneInfo;
import Common.JdbcUtil;

import static Common.GROUP_MENU.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Common.Menu;
import Exception.MenuNumException;
//제어 클래스

public class PhoneBookManager {
	Connection con;// Connection는 자바에서 제공하는 jdbc 의 일종인 인터페이스
	PreparedStatement pstmt;
	ResultSet rs;
	int groupNum;
	ArrayList<PhoneInfo> List = new ArrayList<>();
	
//

	public void inputData() throws MenuNumException {
		con = JdbcUtil.getConnection();

		try {
			con.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("오토커밋 오류");
			e.printStackTrace();
		} // 오토 커밋종료
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("그룹 선택: ");
		groupNum = Menu.sc.nextInt();
		// a입력시 예외 발생
		if (groupNum < NORMAL || groupNum > COMPANY) {
			throw new MenuNumException(groupNum);
		}
		switch (groupNum) {
		case NORMAL:
			inputNormal();
			break;
		case UNIV:
			inputUniv();
			break;
		case COMPANY:
			inputCompany();
			break;
		}
		System.out.println("정보입력 완료");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		JdbcUtil.commit(con);
		JdbcUtil.close(con);

	}

	private void inputCompany() {
		inputNormal();
		try {
			System.out.print("회사 입력: ");
			String c_companyinfo = Menu.sc.next();

			String sql = "INSERT INTO PHONE_COMPANYINFO VALUES(?,?)";
			pstmt = con.prepareStatement(sql);
			int c_kind = groupNum;
			pstmt.setInt(1, c_kind);
			pstmt.setString(2, c_companyinfo);
			int result = pstmt.executeUpdate();
			if (result != 0) {
				JdbcUtil.commit(con);
			}

		} catch (SQLException e) {
			JdbcUtil.rollBack(con);
			System.out.println("정보입력 오류3");
//			e.printStackTrace();
		}

		return;
	}

	private void inputUniv() {
		inputNormal();
		try {
			System.out.print("전공 입력: ");
			String u_major = Menu.sc.next();
			System.out.print("학년 입력: ");
			String u_year = Menu.sc.next();

			String sql = "INSERT INTO PHONE_UNIVERSE VALUES(?,?,?)";
			pstmt = con.prepareStatement(sql);
			int u_kind = groupNum;
			pstmt.setInt(1, u_kind);
			pstmt.setString(2, u_major);
			pstmt.setString(3, u_year);
			int result = pstmt.executeUpdate();
			if (result != 0) {
				JdbcUtil.commit(con);
			}

		} catch (SQLException e) {
			JdbcUtil.rollBack(con);
			System.out.println("정보입력 오류2");
			return;
//			e.printStackTrace();
		}

		return;
	}

	private void inputNormal() {
		System.out.print("이름 입력: ");
		String p_name = Menu.sc.next();
		System.out.print("전화번호 입력: ");
		String p_num = Menu.sc.next();
		String sql = "INSERT INTO PHONE_INFO VALUES(?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			int p_kind = groupNum;
			pstmt.setInt(1, p_kind);
			pstmt.setString(2, p_name);
			pstmt.setString(3, p_num);
			int result = pstmt.executeUpdate();
			if (result != 0) {
				JdbcUtil.commit(con);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<PhoneInfo> arrSet(int num) {
		try {
			ArrayList<PhoneInfo> pInfoList = new ArrayList<>();
			con = JdbcUtil.getConnection();
			String sql = "SELECT * FROM (SELECT * FROM DBSEARCH ORDER BY K_NUM) WHERE K_NUM =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				PhoneInfo pInfo = new PhoneInfo();
				pInfo.setpKind(rs.getInt("P_KIND"));
				pInfo.setName(rs.getString("P_NAME"));
				pInfo.setpNum(rs.getString("P_NUM"));
				pInfoList.add(pInfo);
			}
			this.List = pInfoList;

		} catch (SQLException e) {
			System.out.println("저장오류");
			e.printStackTrace();
		}
		return null;
	}

	public void searchData() {
		con = JdbcUtil.getConnection();
		String name;
		int kind;
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("검색할 대상 소속 번호 입력: ");
		kind = Menu.sc.nextInt();
		System.out.print("검색할 이름 입력: ");
		name = Menu.sc.next();
		ArrayList<PhoneInfo> pInfoList = new ArrayList<>();
		try {
			String sql = "SELECT * FROM DBSEARCH WHERE P_NAME=? AND P_KIND=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, kind);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				
				PhoneInfo pInfo = new PhoneInfo();
				pInfo.setpKind(rs.getInt("P_KIND"));
				pInfo.setName(rs.getString("P_NAME"));
				pInfo.setpNum(rs.getString("P_NUM"));
				pInfoList.add(pInfo);
			}
			this.List = pInfoList;
			List.stream().forEach(list -> System.out.println(list));
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		} catch (SQLException e) {
			System.out.println("Search 오류");
			e.printStackTrace();
		}

	}

	public void modifyData() {
				try {
					modify();
					JdbcUtil.commit(con);
				} catch (MenuNumException e) {
					e.printStackTrace();
				}
		
		JdbcUtil.close(con);
	}

	public void modify() throws MenuNumException {
		con = JdbcUtil.getConnection();
		String name;
		String num;
		String mName;
		String mNum;
		try {
			System.out.print("이름 입력: ");
			name = Menu.sc.next();
			System.out.print("전화번호 입력: ");
			num = Menu.sc.next();
			System.out.print("변경할 이름 입력: ");
			mName = Menu.sc.next();
			System.out.print("변경할 전화번호 입력: ");
			mNum = Menu.sc.next();
			String sql = "UPDATE PHONE_INFO SET P_NAME =?,P_NUM=? WHERE P_NAME=? AND P_NUM=?";
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, name);
			pstmt.setString(2, num);
			pstmt.setString(3, mName);
			pstmt.setString(3, mNum);

		} catch (SQLException e) {

			System.out.println("NMAL MData 오류");
			System.out.println("다시입력해주세요");

			e.printStackTrace();
		}

	}

	public void deleteData() {
		con = JdbcUtil.getConnection();
		String name;
		String num;
		System.out.print("삭제할 이름 입력: ");
		name = Menu.sc.next();
		System.out.print("전화번호 입력: ");
		num = Menu.sc.next();
		String sql = "UPDATE PHONE_INFO SET P_KIND =0 WHERE P_NAME=? AND P_NUM=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, num);
			int result = pstmt.executeUpdate();
			if (result != 0) {
				JdbcUtil.commit(con);
				JdbcUtil.close(con);
				System.out.println("삭제에 성공하셨습니다.");
			} else {
				JdbcUtil.rollBack(con);
				JdbcUtil.close(con);
				System.out.println("삭제 대상이 없습니다.");
			}

		} catch (SQLException e) {
			System.out.println("DELETE 오류");
			e.printStackTrace();
		}

	}

	public void showAllList() {

		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("그룹 선택: ");
		groupNum = Menu.sc.nextInt();
		// a입력시 예외 발생
		if (groupNum < NORMAL || groupNum > COMPANY) {
			System.out.println("노출 대상이 없습니다.");
		} else {
			arrSet(groupNum);
			List.stream().forEach(list -> System.out.println(list));

		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

	}
}