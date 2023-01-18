package lamda;

class Outer2 {
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) {// 매개 (지역)변수 final 생략가능
		int num = 10;// 지역변수 final 생략가능
		// 로컬(지역) 내부 클래스
//		class MyRunnable implements Runnable {
//			int instNum = 100;// 인스턴스 변수
//
//			@Override
//			public void run() {
////				i=50;// 상수라 변경금지
////				num++;
//
//				System.out.println("run 재정의");
//				System.out.println("i= " + i);
//				System.out.println("num= " + num);
//				System.out.println("localNum= " + instNum);
//
//				System.out.println("outNum= " + outNum);
//				System.out.println("sNum= " + sNum);
//
//			}
//
//		}// 마이런어블 끝
//		System.out.println("run 재정의");
//		System.out.println("i= " + i);
//		System.out.println("num= " + num);
////		System.out.println("localNum= "+instNum);// 당연히 안된다.
//
//		System.out.println("outNum= " + outNum);
//		System.out.println("sNum= " + sNum);
//
//		return new MyRunnable();

		return new Runnable() {// 조상타입을 구현하는 클래스를 만든다.
//	return		new 조상타입() {구현};

			@Override
			public void run() {
				int instNum = 100;// 인스턴스 지역 변수
				System.out.println("run 재정의");
				System.out.println("i= " + i);
				System.out.println("num= " + num);
				System.out.println("localNum= " + instNum);

				System.out.println("outNum= " + outNum);
				System.out.println("sNum= " + sNum);

			}
		};// 리턴문 선언 종료
		
//		Runnable r = new Runnable() {
//			int instNum = 100;// 인스턴스 지역 변수
//			@Override
//			public void run() {
//				int instNum = 100;// 인스턴스 지역 변수
//				System.out.println("run 재정의");
//				System.out.println("i= " + i);
//				System.out.println("num= " + num);
//				System.out.println("localNum= " + instNum);
//
//				System.out.println("outNum= " + outNum);
//				System.out.println("sNum= " + sNum);
//
//			}
//			
//		};//지역변수 선언문 종료
//		return r;
	

	}// 런에이블 메소드 끝

}// 외부 끝

public class AnonymousInnerTest {
	public static void main(String[] args) {

		Runnable mRun = new Outer2().getRunnable(10);
		mRun.run();

	}
}
