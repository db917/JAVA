package pack04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성씨 갯수 : ");
		int first_Name_Cnt = sc.nextInt();
		String[][] arr = new String[first_Name_Cnt][];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 성씨의 이름 갯수 :");
			arr[i] = new String[sc.nextInt()];
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("이름입력 :");
				arr[i][j] = sc.next();
			}
		}
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]+",");
		
		//for each문 이해하기
		for (String[] row : arr) {// arr[]의 참조값을 row로 가져와라
			for (String name:row) {// arr[]의 참조값을 가져왔더니 배열이니 row가 참조한 arr의[] 가 가르키는 값을 name 으로 가져와라 
			System.out.print(name+",");
			}
			System.out.println("");//개행-줄바꿈
		}

	}

}
