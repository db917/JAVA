package pack05;

public class Ex05 {
	public static void main(String[] agrs) {
		divide(4, 2);
		divide(4, 0);

	}

	private static void divide(int i, int j) {

		if (j == 0) {
			System.out.println("0으로 나눌수 없어요");
			return;//메소드 종료
		}
		System.out.println("나눗셈 결과: " + (i / j));

	}

}
