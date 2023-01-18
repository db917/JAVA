package park01;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("로그인 화면");
			System.out.println("아이디:");
			String id= sc.next();
			System.out.println("비번:");
			String pw= sc.next();
			
			LoginService service=new LoginService();
			ArrayList<Member> result=service.login(id,pw);
		
			if(result!=null) {
				System.out.println("로그인 성공");
				for (int i = 0; i < result.size(); i++) {
					System.out.println(result.get(i));
				}
				break;
			}else 
				System.out.println("로그인 실패");
			System.out.println("End");
		}
	}


}
