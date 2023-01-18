package pack03;

import java.net.Socket;

public class Ex01 {
	public static void main(String[] args) {
		//score-참조변수 
		//배열요소의 합을 구하시오
		int[] score= new int[10];//인트로 되어있는 변수 10묶음 을 만들어라 -배열 인스턴스
		System.out.println("배열의길이"+score.length);
		for (int i=0; i<score.length;i++) {
		score[i]=i+10;}
		int k=0;
		for (int i=0;i<score.length;i++) {			
//			System.out.println(score[i]);
			
			k+=score[i];
			System.out.println(k);
			
			
		}System.out.println("배열의 합은"+k+"입니다.");
	
	
	
	}

}
