package pack05;

public class Ex06 {
	public static void main(String[] args) {
		operation(10, 3);
		abs(10, 3);
		abs(3, 10);
		// 실행예
		// 두 수 차의 절대 값은 7
		// 두 수 차의 절대 값은 7
		System.out.println("원 둘레: " + cirRound(2.5));// 원둘레 구하라
		System.out.println("원 넓이: " + cirArea(2.5));// 원넓이 구하라
		for (int i = 1; i < 11; i++) {
			if (isEven(i)) {
				// 실행예 // n은 짝수 입니다.
				System.out.println(i + "는 짝수 입니다.");
			}
		}
	}

	private static boolean isEven(int i) {
		boolean result=((i % 2) == 0)?true:false;
		return result;
//		if (i % 2 == 0) 
//			return true;//리턴일경우 간소화가능
//			return false;
		
//		if (i % 2 == 0) {
//			return true;
//		}else {
//			return false;
//		}

	}

	private static double cirArea(double i) {
		double result = 3.14 * i * i;//math.PI 메스라는 클레스의 파이상수변수를 가져와서 써도된다. 
		return result;
	}

	private static double cirRound(double i) {
		double result = 2 * 3.14 * i;
		return result;
	}

	private static void abs(int i, int j) {
		int max = (i > j) ? (i - j) : (j - i);
		System.out.println("절대값 = " + max);
//		 if(i>j) {
//		   int a=i-j;
//		   System.out.println("절대값 = "+a);
//		   }else {
//			   int a=j-i;
//			   System.out.println("절대값 = "+a);
//		   }
	}

	private static void operation(int i, int j) {
		System.out.println("덧셈 결과:" + (i + j));
		System.out.println("뺄셈 결과:" + (i - j));
		System.out.println("곱셈 결과:" + (i * j));
		System.out.println("나눗셈 결과:" + (i / j));
		System.out.println("나머지 결과:" + (i % j));
		// 덧셈 결과:13
		// 뺄셈 결과:7
		// 곱셈 결과:30
		// 나눗셈 결과:3
		// 나머지 결과:1

	}

}
