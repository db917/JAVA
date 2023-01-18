package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import bean.PhoneInfo;
import static Common.INIT_MENU.*;
import Common.Menu;
import Exception.MenuNumException;

public class PhoneBook {
	public static void main(String[] args) {
		//싱글톤(singleton)
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		
		while (true) {
			try {
				Menu.showMenu();
				int menuNum = Menu.sc.nextInt();
				
				if(menuNum<INPUT||menuNum>EXIT)
					throw new MenuNumException(menuNum);
				
				switch (menuNum) {
				case INPUT:
					manager.inputData();
					break;
				case SEARCH:
					manager.searchData();
					break;
				case DELETE:
					manager.deleteData();
					break;
				case ALL:
					manager.showAllList();
					break;
				case EXIT:
					System.out.println("프로그램 종료합니다.");
					return; // main 메소드 종료-->프로그램 종료
				// System.exit(0);
				}
			}catch (MenuNumException e) {
				System.out.println(e.getMessage());
				e.showWrongNum();
			}
			catch(InputMismatchException e) {
				Menu.sc.nextLine();
				System.out.println("메뉴는 정수입니다.");
			}
			System.out.println("메뉴 선택을 처음부터 다시합니다.");
		} // End while
	}// End main

}// End class
