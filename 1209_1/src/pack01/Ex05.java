package pack01;

public class Ex05 {
	public static void main(String[] args) {
		//문제
//		int a = 1000000;
//		int b = 2000000;
//		long c = a * b;
//		System.out.println(c);
//
//		long d = 1000000 * 2000000;
//		System.out.println(d);
//
//		int e = 1000000 * 1000000 / 1000000;
//		System.out.println(e);
		//풀이
		int a = 1000000;
		int b = 2000000;
		long c = (long) a * b;
		System.out.println(c);

		long d = (long) 1000000 * 2000000;
		System.out.println(d);

		int e = 1000000 * (1000000 / 1000000);
		System.out.println(e);
	}
}
