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

public class PhoneBookManager_Test {
	Connection con;// Connection는 자바에서 제공하는 jdbc 의 일종인 인터페이스
	PreparedStatement pstmt;
	ResultSet rs;
	int groupNum;
	ArrayList<PhoneInfo> pInfoList = new ArrayList<>();
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
		if (groupNum < NORMAL || groupNum > COMPANY)
			throw new MenuNumException(groupNum);
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

	}

	private void inputCompany() {
		inputNormal();
		try {
			if (inputNormal() != 0) {

				String sql = "INSERT INTO PHONE_COMPANYINFO VALUES(?,?)";
				pstmt = con.prepareStatement(sql);
				int c_kind = groupNum;
				pstmt.setInt(1, c_kind);
				System.out.print("회사 입력: ");
				String c_companyinfo = Menu.sc.next();
				pstmt.setString(2, c_companyinfo);
				int result = pstmt.executeUpdate();

				if (result != 0) {
					JdbcUtil.commit(con);
				}
			} else if (inputNormal() == 0) {
				JdbcUtil.rollBack(con);
			}

		} catch (SQLException e) {
			JdbcUtil.rollBack(con);
			System.out.println("정보입력 오류3");
//			e.printStackTrace();
		}

		return;
	}

	private void inputUniv() {

//		PhoneUnivInfo uInfo = new PhoneUnivInfo();
		inputNormal();
		try {
			if (inputNormal() != 0) {

				String sql = "INSERT INTO PHONE_UNIVERSE VALUES(?,?,?)";
				pstmt = con.prepareStatement(sql);
				int u_kind = groupNum;
				pstmt.setInt(1, u_kind);
				System.out.print("전공 입력: ");
				String u_major = Menu.sc.next();
				pstmt.setString(2, u_major);
				System.out.print("학년 입력: ");
				String u_year = Menu.sc.next();
				pstmt.setString(3, u_year);
				int result = pstmt.executeUpdate();

				if (result != 0) {
					JdbcUtil.commit(con);
				}
			} else if (inputNormal() == 0) {
				JdbcUtil.rollBack(con);
			}

//
		} catch (SQLException e) {
			JdbcUtil.rollBack(con);
			System.out.println("정보입력 오류2");
//			e.printStackTrace();
		}

		return;
	}

	private int inputNormal() {

		try {
			String sql = "INSERT INTO PHONE_INFO VALUES(?,?,?)";
			pstmt = con.prepareStatement(sql);
			int p_kind = groupNum;
			pstmt.setInt(1, p_kind);
			System.out.print("이름 입력: ");
			String p_name = Menu.sc.next();
			pstmt.setString(2, p_name);
			System.out.print("전화번호 입력: ");
			String p_num = Menu.sc.next();
			pstmt.setString(3, p_num);
			rs = pstmt.executeQuery();
			int result = pstmt.executeUpdate();

			if (result != 0) {
				JdbcUtil.commit(con);
			}
			System.out.println("정보입력 완료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		} catch (SQLException e) {
			JdbcUtil.rollBack(con);
			System.out.println("정보입력 오류1 재입력 해주세요");
//			e.printStackTrace();
			return 0;
		}

		return 1;
	}

	// 검색 또는 삭제할 배열의 인덱스를 반환 함수

	// 검색 또는 삭제할 배열의 인덱스를 반환 함수
	public ArrayList<PhoneInfo> arrSet(int num) {
		ArrayList<PhoneInfo> infoSet = new ArrayList<>();
		PhoneInfo pInfo = new PhoneInfo();
		String sql = "SELECT COUNT(*) FROM DBSEARCH";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			int arrLen = rs.getInt("COUNT(*)");
			for (int i = 0; i < arrLen; i++) {
				sql = "SELECT * FROM DBSEARCH WHERE K_NUM= " + i;
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					if (num >= 1) {
						ArrayList<PhoneInfo> pInfoList = new ArrayList<>();
						pInfo.setpKind(rs.getInt("P_KIND"));
						pInfo.setName(rs.getString("P_NAME"));
						pInfo.setpNum(rs.getString("P_NUM"));
						
						if (num > 1 && num < 3) {
							ArrayList<PhoneInfo> uInfoList = new ArrayList<>();
							pInfo.setpKind(rs.getInt("P_KIND"));
							pInfo.setuMajor(rs.getInt("U_MAJOR"));
							pInfo.setuYear(rs.getInt("U_YEAR"));
							uInfoList.add(pInfo);
							infoSet = uInfoList;
						} else if (num == 3) {
							ArrayList<PhoneInfo> cInfoList = new ArrayList<>();
							pInfo.setpKind(rs.getInt("P_KIND"));
							pInfo.setcCompanyInfo(rs.getString("C_COMPANYINFO"));
							cInfoList.add(pInfo);
							infoSet = cInfoList;
						} else if (num == 1) {
							pInfoList.add(pInfo);
							infoSet = pInfoList;
						}
					}
					
				}
			}
		} catch (SQLException e) {
		System.out.println("저장오류");
			e.printStackTrace();
		}
		return infoSet;
	}

	public void searchData() {
		String name;
		String num;
		System.out.print("검색할 이름 입력: ");
		name = Menu.sc.next();
		System.out.print("검색할 전화 번호 입력: ");
		num = Menu.sc.next();
		String sql = "SELECT * FROM DBSEARCH WHERE P_NAME= '" + name + "' AND P_NUM = '" + num + "'";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			System.out.println(rs);// 알에스 인쇄되는지 추적//트라이케치 해야됨 이름검색했을떄 없으면
		} catch (SQLException e) {
			System.out.println("Search 오류");
			e.printStackTrace();
		}

	}

	public void deleteData() {
		String name;
		int num;
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("소속 번호 입력: ");
		num = Menu.sc.nextInt();
		System.out.print("삭제할 이름 입력: ");
		name = Menu.sc.next();
		// 삭제 요청시 데이터를 0으로 바꾼다.
		// 트라이 케치
		String sql = "ALTER TABLE PHONE_INFO MODIFY P_KIND=0 WHERE P_NAME='" + name + "' AND  P_KIND='" + num + "'";
		try {

			pstmt = con.prepareStatement(sql);
			int result = pstmt.executeUpdate();
			if (result != 0) {
				System.out.println("삭제에 성공하셨습니다.");
			} else {
				System.out.println("삭제 대상이 없습니다.");
			}

		} catch (SQLException e) {
			System.out.println("DELETE 오류");
			e.printStackTrace();
		}
//		System.out.println(rs);// 알에스 인쇄되는지 추적//트라이케치 해야됨 이름검색했을떄 없으면

	}

	public void showAllList() {
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("그룹 선택: ");
		groupNum = Menu.sc.nextInt();
		// a입력시 예외 발생
		if (groupNum < NORMAL || groupNum > COMPANY) {
			arrSet(groupNum).toString();
			}else {
				
				System.out.println("노출 대상이 없습니다.");
			}
		


	}
}