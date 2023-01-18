package ch1;

import java.io.*;

public class Ex05

{
	public static void performanceTest(DataOutputStream dataOut) throws IOException {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++)
			for (int j = 0; j < 10000; j++)
				dataOut.writeDouble(12.345); // 약 80MB 크기의 데이터를 파일에 저장
//		dataOut.flush(); // 출력버퍼의 마지막 데이터까지 완전히 전송이후 시간측정 위해
		long endTime = System.currentTimeMillis();
		System.out.println("경과시간: " + (endTime - startTime)/1000.0);
	}

	public static void main(String[] args) throws IOException {
		OutputStream out1 = new FileOutputStream("data1.bin");
		DataOutputStream dataOut = new DataOutputStream(out1);
		performanceTest(dataOut);
//		dataOut.close();
		OutputStream out2 = new FileOutputStream("data2.bin");
		BufferedOutputStream bufFilterOut = new BufferedOutputStream(out2, 1024 * 100);
		DataOutputStream dataBufOut = new DataOutputStream(bufFilterOut);
		performanceTest(dataBufOut);
//		dataBufOut.close();//flush()호출후 스트림 종료
	}
}