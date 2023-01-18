package pack02;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
	
		//반복횟수 많을때 무한루프 응용
		int total=0,val;
		Scanner key=new Scanner(System.in);
		while (true) {
			System.out.print("숫자 입력 (0 to quite) : ");
			val=key.nextInt();
			if(val==0)
				break;//탈출문
			System.out.println(val);
			total+=val;

			
			//			int total=0,val=1;
//			Scanner key=new Scanner(System.in);
//			while (val!=0) {
//				System.out.print("숫자 입력 (0 to quite) : ");
//				val=key.nextInt();
//				System.out.println(val);
//				total+=val;
		}
		System.out.println("합계 : "+total);
	}
}
