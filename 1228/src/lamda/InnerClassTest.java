package lamda;

class OuterClass {// 외부클래스
	private int num = 10;
	private static int sNum = 10;// 정적변수
	private InnerClass inClass;

	public OuterClass() {
		inClass = new InnerClass();// 외부인스턴스 ->내부인스턴스

	}

	private class InnerClass {// 내부클래스
		private int iNum1 = 100;

		private static int sInNum1 = 10;// 자바 16부터 는 내부클래스에 정적변수 선언가능 

		void inTest() {
			System.out.println("OuterClass num=" + num + " (외부클래스의 인스턴스 변수)");
			System.out.println("OuterClass sNum=" + sNum + " (외부클래스의 정적 변수)");
			System.out.println("InnerClass iNum=" + iNum1 + " (내부클래스의 인스턴스 변수)");
			System.out.println("OuterClass sInNum=" + sInNum1 + " (내부클래스의 정적 변수)");
			System.out.println("OuterClass inClass=" + inClass + " (외부클래스의 인스턴스 변수)");
		}

	}// End inner Class
		// 외부 클래스 메소드

	public void usingClass() {

		inClass.inTest();
	}

	// 내부 정적 클래스
	static class InnerStaticClass {
		int iNum2 = 100;
		static int sInNum2 = 200;

		// 인스턴스 메소드
		void inTest() {
//			num++; //외부클래스의 인스턴스 변수 사용할 수 없음.
			
//			System.out.println("OuterClass num=" + num + " (외부클래스의 인스턴스 변수)");
			System.out.println("OuterClass sNum=" + sNum + " (외부클래스의 정적 변수)");
//			System.out.println("InnerClass iNum=" + iNum1 + " (내부클래스의 인스턴스 변수)");
			System.out.println("InnerClass iNum=" + iNum2 + " (내부클래스의 인스턴스 변수)");
			System.out.println("OuterClass sInNum=" + sInNum2 + " (내부클래스의 정적 변수)");

		}

		// 클래스 메소드
		static void sTest() {

//			iNum++; //내부클래스의 인스턴스 변수 사용할 수 없음.
			
			System.out.println("OuterClass sNum=" + sNum + " (외부클래스의 정적 변수)");
			System.out.println("InnerStaticClass sInNum=" + sInNum2 + " (내부클래스의 정적 변수)");

		}

	}// 내부 정적 클랙스
}// End Outer Class

public class InnerClassTest {

	public static void main(String[] args) {
		OuterClass out = new OuterClass();// 반드시 아웃터 클래스먼저 만들어야한다.
		// 내부클래스에 보통 정보은닉을 붙이기 때문에 아래처럼 잘안쓴다.
//		OuterClass.InnerClass in = out.new InnerClass();
//		in.inTest();
//		out.usingClass();
//		OuterClass outerClass=new OuterClass().new InnerClass();
		
		//내부 정적 클래스
		OuterClass.InnerStaticClass sInClass=new OuterClass.InnerStaticClass();
		sInClass.inTest();//인스턴스메소드
		System.out.println();
		OuterClass.InnerStaticClass.sTest();//클래스 메소드
		

	}

}
