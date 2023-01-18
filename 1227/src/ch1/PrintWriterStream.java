package ch1;

import java.io.*;

// 예제5에서 생성하는 스트림에 BufferedWriter에 의한 버퍼링 기능을 추가해 보자. 그리고
// 파일에 문자열 저장 이후에, 파일에 저장된 문자열 전부를 다시 출력하는 형태로 예제를 확장해 보자.
public class PrintWriterStream {
	public static void main(String[] args) throws IOException {
//		PrintWriter out = new PrintWriter(new FileWriter("printf.txt"));
		BufferedWriter bOut = new BufferedWriter(new PrintWriter(new FileWriter("printf.txt")));
		bOut.write(String.format("제 나이는 %d살 입니다.", 24));
		bOut.write("\n");
		bOut.write("저는 자바가 좋습니다.");
		bOut.newLine();
		bOut.write("특히 I/O 부분에서 많은 매력을 느낍니다.");
		bOut.close();

//		FileReader read = new FileReader("printf.txt");
		BufferedReader bRead = new BufferedReader(new FileReader("printf.txt"));
		String str;
		while (true) {
			{
				str = bRead.readLine();
				if (str == null)
					break;

				System.out.println(str);
			}
		}
		bRead.close();
	}
}