package controller;

import bean.PhoneCompanyInfo;
import bean.PhoneInfo;
import bean.PhoneUnivInfo;

import static Common.GROUP_MENU.*;

import java.util.HashSet;
import java.util.Iterator;

import Common.Menu;
import Exception.MenuNumException;
//제어 클래스

public class PhoneBookManager {
	HashSet<PhoneInfo> pHashSet = new HashSet<>();

	static PhoneBookManager inst = null;

	// 팩토리 메소드
	public static PhoneBookManager createManagerInst() {
		if (inst == null)
			inst = new PhoneBookManager();
		return inst;
	}

	private PhoneBookManager() {

//		int cnt = 0;// ?
	}

	public void inputData() throws MenuNumException {
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("그룹 선택: ");
		int groupNum = Menu.sc.nextInt(); // a입력시 예외 발생
		if (groupNum < NORMAL || groupNum > COMPANY)
			throw new MenuNumException(groupNum);

		PhoneInfo info = null;
		switch (groupNum) {
		case NORMAL:
			info = inputNormal();
			break;
		case UNIV:
			info = inputUniv();
			break;
		case COMPANY:
			info = inputCompany();
			break;
		}
		info.showPhoneInfo();
		pHashSet.add(info);
	}

	private PhoneInfo inputCompany() {
		System.out.print("이름 입력: ");
		String name = Menu.sc.next();
		System.out.print("전화번호 입력: ");
		String phoneNum = Menu.sc.next();
		System.out.print("회사 입력: ");
		String company = Menu.sc.next();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("저장되었습니다.");

		return new PhoneCompanyInfo(name, phoneNum, company);
	}

	private PhoneInfo inputUniv() {
		System.out.print("이름 입력: ");
		String name = Menu.sc.next();
		System.out.print("전화번호 입력: ");
		String phoneNum = Menu.sc.next();
		System.out.print("전공 입력: ");
		String major = Menu.sc.next();
		System.out.print("학년 입력: ");
		int year = Menu.sc.nextInt();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("저장되었습니다.");

		return new PhoneUnivInfo(name, phoneNum, major, year);
	}

	private PhoneInfo inputNormal() {
		System.out.print("이름 입력: ");
		String name = Menu.sc.next();
		System.out.print("전화번호 입력: ");
		String phoneNum = Menu.sc.next();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("저장되었습니다.");
		return new PhoneInfo(name, phoneNum);
	}

	// 검색 또는 삭제할 배열의 인덱스를 반환 함수
	public PhoneInfo search(String name) {
		Iterator<PhoneInfo> scName = pHashSet.iterator();
		while (scName.hasNext()) {
			PhoneInfo pInfo = scName.next();
			if (pInfo.getName().equals(name))
			return pInfo;

		}

		return null;

	}

	// searchIdx를 활용할것
	public void searchData() {
		System.out.print("검색할 이름 입력: ");
		PhoneInfo scResult = search(Menu.sc.next());

		if (scResult != null) {
			scResult.showPhoneInfo();
			System.out.println("검색이 완료됨!");
			return;
		}else {
			System.out.println("검색할 데이터가 없음!");
			return;
		}
		 // 동명이인이 없다면 반복 중단
	}

	// searchIdx를 활용할것
	public void deleteData() {
		System.out.print("삭제할 이름 입력: ");
		PhoneInfo deResult = search(Menu.sc.next());

		if (deResult == null) {
			System.out.println("삭제할 데이터가 없음!");
			return;
		} // 쑈인표해도되네
		pHashSet.remove(deResult);
		return; // 동명이인이 없다면 반복 중단
	}

	public void showAllList() {
		System.out.println("=== 전체 리스트 ===");
		for (PhoneInfo info : pHashSet) {
			info.showPhoneInfo();
		}

	}
}