package pack02;
//Ex01.java(소스파일)->컴파일->Ex01.class(기계어)->실행->실행
public class Ex01// 내가만든 클래스
{
	public static void main(String[] args) {
		// 참조형(Type) 참조변수 대문자로 시작하는 건 클래스
		String name = "박민규"; // 문자열 상수
		// 기본형(Type) 변수
		int age=33; //정수 상수
		double height=173.3;//실수 상수
		age+=1; // 한살 추가
		height+=1.5; // 키 1.5 증가
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("나이:"+age/3.0);
		System.out.println("나이:"+(double)age/3);
		
		System.out.println("키:"+height);
		System.out.println("키:"+height/2.0);
		System.out.println("키:"+(double)height/2.0);
	}//End main 메소스
}//End class
