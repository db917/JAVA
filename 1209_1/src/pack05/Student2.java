package pack05;

public class Student2 {
//필드 (멤버변수)
	//-인스턴스 변수:인스턴스 생성후 사용가능
	String name;
	int age;
	//클래스 변수
	static String scName="인하대학교";
	//클래스 메소드: 인스턴스 생성과 상관없이 사용가능하다.인스턴스와 관련없는 일을 하는 메소드
	static void showTitle() {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("소속="+scName);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		//age+10;에러
		//System.out.println(name);에러
		//showInfo();에러
		
	}
	//메소드
	//인스턴스 메소드:인스턴스 생성후 사용가능
	void study() {
		System.out.println(name+"가 공부를 한다.");
		
	}
	void showInfo() {
		System.out.println("소속="+scName);
		System.out.println("이름="+name);
		System.out.println("나이="+age);
		System.out.println("----------------");
		
		
		
	}
	//
}
