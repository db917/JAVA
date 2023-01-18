package pack01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = new String ("java");
		String str2;
		String str3 = "java";
		System.out.println("문자열 입력");
		str2=sc.next();
		sc.close();
		if(str1==str2) {//주소값을 비교
			System.out.println("1,2는 인스턴스 참조값이 같은 문자열");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		}
		if(str1==str3) {
			System.out.println("1,3는 인스턴스 참조값이 같은 문자열");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		}
		if(str2==str3) {
			System.out.println("2,3는 인스턴스 참조값이 같은 문자열");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		}
		if(str1.equals(str2)) {//내용비교 메소드 equals=동일한 ,boolean값이다.
			System.out.println("1,2는 같은 문자열");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		}
		if(str1.equals(str3)) {
			System.out.println("1,3는 같은 문자열");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		}
		if(str2.equals(str3)) {
			System.out.println("2,3는 같은 문자열");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		}
		switch(str2) {
		
		case "java":
			System.out.println("자바문자열");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			break;
		case "C++":
			System.out.println("씨언어");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			break;
		case "기타":
			System.out.println("기타문자열");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		}
		
		
		
	}
}
