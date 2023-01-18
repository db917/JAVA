package ch1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("data.bin");

		DataOutputStream filterOut = new DataOutputStream(out);
//	DataOutputStream filterOut = new DataOutputStream(new FileOutputStream("data.bin");
		// 출력 스트림과 필터 스트림과의 연결!
		filterOut.writeInt(275);
		filterOut.writeDouble(45.79);
		filterOut.close();
		InputStream in = new FileInputStream("data.bin");
		DataInputStream filterIn = new DataInputStream(in);
		// 입력 스트림과 필터 스트림과의 연결!
		int num1 = filterIn.readInt();
		double num2 = filterIn.readDouble();
		filterIn.close();
		System.out.println(num1);
		System.out.println(num2);
	}

}
