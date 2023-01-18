package park03;

public class PrintStringTest {

	public static void main(String[] args) {
		// 인터페이스형 변수 람다식 대입하기
		PrintString lambdaStr = (s) -> System.out.println(s);
		lambdaStr.showString("hello lambda01");

		// 매개변수로 전달하는 람다식
		showMyString(lambdaStr,"hello~~");
		//반환값으로 쓰이는 람다식
		PrintString reStr = returnString();
		reStr.showString("hellow");

	}

	private static PrintString returnString() {
	
		
		return  s->System.out.println(s+"world");
	}

	private static void showMyString(PrintString lambdaStr,String str) {

		lambdaStr.showString("hello lambda02");
		lambdaStr.showString(str);

	}

}
