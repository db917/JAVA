package ch1;

import java.io.File;

public class Ex07 {

	public static void main(String[] args) {

//		File myFile = new File("../mybox2/upload3"); // ../(상위폴더)
//		File myFile = new File("./mybox/upload3"); // ./(현재폴더)가 생략되어있다.
		File myFile = new File("mybox/upload3"); 
//		if (!myFile.exists()) {
//
//			System.out.println("upload 폴더가 존재하지않아요");
//			myFile.mkdirs();
//			
//		}
		if (!myFile.isDirectory()) {
			
			System.out.println("upload 폴더가 존재하지않아요");
			myFile.mkdirs();
			
		}
		System.out.println("gogo");

	}

}
