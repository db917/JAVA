package pack04;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 학생수 입력 후
				// n번째 학생 응시 과목수
				// 과목 점수 입력
				// ㅡㅡㅡㅡㅡㅡㅡㅡ
				// n번학생 총점
				// n번학생 평균
				// ㅡㅡㅡㅡㅡㅡㅡㅡ
				// 애들 점수 따로 쭉나오고 점수 쭉나오고로 바꿔보자
				Scanner sc = new Scanner(System.in);
				// 학생수,과목,합계
				System.out.println("총 학생수를 입력하세요");
				int[][] arr = new int[sc.nextInt()][];// arr[][] 정보 학생수 과목수넣을 2차원배열
				int[] sum = new int[arr.length];// 합계 변수
				int i, j;// i는 학생수, j는 과목수
				for (i = 0; i < arr.length; i++) {
					int sums = 0;// arr[i]의 점수
					System.out.println((i + 1) + "번째 학생의 과목수를 입력하세요");
					arr[i] = new int[sc.nextInt()];
					for (j = 0; j < arr[i].length; j++) {
						System.out.println((i + 1) + "번째 학생의 " + (j + 1) + "번 째 과목 점수 입력=");
						arr[i][j] = sc.nextInt();// 해당 행에 키보드에서 입력한 값을 열길이로 지정
						sums += arr[i][j];
					} // 안에 있는값 arr.length 학생수 arr[].length과목수 arr[i][j]점수
					sum[i] = sums;
				}
				for (i = 0; i < arr.length; i++) {
					for (j = 0; j < arr[i].length; j++) {

					}
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
					System.out.println((i + 1) + "번째 학생의 점수의 합은" + sum[i] + "입니다.");
					System.out.println((i + 1) + "번째 학생의 점수의 평균은" + (sum[i] / (arr[i].length)) + "입니다.");
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				}

			}

	}

