package controller;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random rand = new Random();
		//rand.setSeed(System.currentTimeMillis());자바가 기본적으로 시간을 기준으로 난수를 설정해준다.
		for (int i = 0; i < 100; i++) {

			System.out.println(rand.nextInt(100));

		}
	}

}
