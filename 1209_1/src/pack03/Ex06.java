package pack03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		String[] names=new String[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<names.length;i++) {
			System.out.println((i+1)+"번학생이름");
			names[i]=sc.next();
		}
		
		names[0]="park";
		names[1]="sark";
		names[2]="zark";
		
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
			
		}
		
		
		
	}
}
