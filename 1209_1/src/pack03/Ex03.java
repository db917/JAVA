package pack03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//실행예 
		//1번째정수입력 = 10엔터
		//2번째정수입력 = 20엔터
		//3번째정수입력 = 5엔터
		//4번째정수입력 = 5엔터
		//5번째정수입력 = 10엔터
		//총합=??
		//평균=??.??
//		int[] arr=new int[5];
//		int sum=0;
//		Scanner score= new Scanner(System.in);
//		for(int i=0; i<arr.length; i++) {
//			System.out.println((i+1)+"번째 정수 입력 :");
//			arr[i] = score.nextInt();
//			sum+=arr[i];
//		}System.out.println("합계"+sum);
//		System.out.println("평균"+(double)sum/arr.length);
        // 내가푼거
		int sum=0;
		int[] arr=new int[5];
		Scanner score= new Scanner(System.in);
		for (int i=0;i<5;i++) {
		System.out.println((i+1)+"번째 정수 입력 :");
		arr[i] = score.nextInt();
		sum+=arr[i];
		}System.out.println("합계"+sum);
	}
//문제 배열 요소값을 역순으로 스왑하시오
	}

