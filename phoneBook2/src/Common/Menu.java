package Common;

import java.util.Scanner;

public class Menu {

	public static Scanner sc = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 지우기");
		System.out.println("4.데이터 확인");
		System.out.println("5.프로그램 종료");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("선택 = ");
	}

	public static void subMenu() {
		System.out.println("그룹을 선택하세요");
		System.out.println("1.일반 ");
		System.out.println("2.대학 ");
		System.out.println("3.회사 ");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("선택 = ");
	}
}
