package part01;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalTest {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번쨰 실수를 입력하세요");
		BigDecimal e1= new BigDecimal(sc.next());
		System.out.println("두번쨰 실수를 입력하세요");
		BigDecimal e2= new BigDecimal(sc.next());
		
		BigDecimal result=e1.subtract(e2);
		
		System.out.println("두실수의 합"+e1.add(e2));
		System.out.println("두실수의 곱"+e1.multiply(e2));
		System.out.println("두실수의 절대값"+result);
		
		
	}

}
