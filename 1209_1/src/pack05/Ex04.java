package pack05;

public class Ex04 {
	public static void main(String[] args) {

//		int[] result=new adder[i];
//		System.out.println("result*10="+result*10);
//		System.out.println("result="+adder(20,30));
//		System.out.println("result="+adder(200,300));
//		System.out.println(result);
//		
		int result = adder(10, 20);
		System.out.println("result*10=" + result * 10);
		System.out.println("result=" + adder(20, 30));
		result = adder(200, 300);
		System.out.println("result=" + result);
		System.out.println("result=" + result);// 같다 System.out.println("result="+adder(200,300));
		System.out.println("result=" + result);// 같다 System.out.println("result="+adder(200,300));
		System.out.println("result=" + result);// 같다 System.out.println("result="+adder(200,300));
		System.out.println("result=" + result);// 같다 System.out.println("result="+adder(200,300));
		double rt = square(5.5);// 5.5 제곱 리턴
		System.out.println("rt=" + rt);
		System.out.println("sq=" + square(6.0));
//		

	}

	private static double square(double i) {
		return i * i;// 리턴값(반환값)

	}

	private static int adder(int i, int j) {
//		int result=i+j;
//		return result;이거와 하기는 같다.
		return i + j;
	}

}
