package park1;

public class Ex01 {
	// 실행 -> JVM ->Ex01.main()
	public static void main(String[] args) {
		try {

			System.out.println(4 / 0);
System.out.println("next");
		} catch (ArithmeticException e) {

			System.out.println("0으로 못나눠요");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e);
			e.printStackTrace(); 
		}

		System.out.println("continue");
	}

}
