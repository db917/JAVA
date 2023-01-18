package ch1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

//@Override
//public void write(int b) throws IOException {
//	// TODO Auto-generated method stub
//	
//}

public class MyInfo {

	private String info;

	public MyInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return info;
	}

	public static void main(String[] args) throws IOException { 
//		OutputStream out = new FileOutputStream("a.txt");
//		BufferedOutputStream bOut= new BufferedOutputStream(out); 
//		PrintStream pOut = new PrintStream(bOut);
		PrintStream pOut = new PrintStream(new BufferedOutputStream(new FileOutputStream("a.txt")));

		MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
		pOut.println("제 소개를 하겠습니다.");
		pOut.println(mInfo);
		pOut.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
		pOut.printf("이름 %s", "홍길동");
		
		pOut.close();
//		

	}

}
