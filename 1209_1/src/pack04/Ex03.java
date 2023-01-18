package pack04;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 빌라 층별 인원 구하라
		int a, b;//a는 층 b는 호수
		Scanner sc = new Scanner(System.in);
		System.out.println("해당 아파트는 몇층 입니까? : ");
		a = sc.nextInt();
		System.out.println("해당 아파트는 몇호 까지 있습니까? : ");
		b = sc.nextInt();
		int[][] arr = new int[a][b];// 각 호수의 인원
		int[] sums = new int[a];// 층별합계의 합계
		int total = 0;//최종합계 변수
		for (a = (arr.length - 1); a >= 0; a--) {
			for (b = 0; b < arr[a].length; b++) {
				System.out.println((a + 1) + "층" + (b + 1) + "호에는 몇명이있나요?");
				arr[a][b] = sc.nextInt();
				sums[a] += arr[a][b];
			}
			System.out.println((a + 1) + "층 에는" + sums[a] + "명 이 거주합니다.");
			System.out.println("================");
			total += sums[a];// 아파트 인원 총합
		}
		System.out.println("해당 아파트의 총원은 :" + total + "입니다.");

	}
}
