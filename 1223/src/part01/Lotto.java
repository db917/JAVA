package part01;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer [][] num;
		System.out.println("게임수를 입력하세요");
		num = new Integer[sc.nextInt()][5];
		Random rNum = new Random();
		for (Integer i = 0; i < num.length; i++) {
			Integer j = 0;
			if (j < 6) {
				num[i][j] = rNum.nextInt(45);
				j++;
				if (j>0) {
					if (num[i][j-1] == num[i][j])
						j--;
				}
			

			}
		}
		for(int i = 0; i < num.length; i++) {
			for (int j = 0; j <6; j++) {
				System.out.println(num[i][j]);
				
			}System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		}
	}

}
