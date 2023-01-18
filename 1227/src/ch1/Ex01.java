package ch1;
import java.io.*;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("org.mp4"); // 자바소스와 같은 폴더에 만들것.
		OutputStream out = new FileOutputStream("cpy.mp4"); // 자동으로 생성된다.
		long start=System.currentTimeMillis();
		
		int copyByte = 0;
		int bData;
		while (true) {
			bData = in.read();
			if (bData == -1)//-1넣은이유는 더이상 불러올 값이 없을때 에러유발 와일분 에서 나오기위헤 
				break;
			out.write(bData);
			copyByte++;
		}
		in.close();
		out.close();
		long end=System.currentTimeMillis();
		System.out.println("복사된 바이트 크기 :" + copyByte);
		System.out.println("복사소요 시간 :" + (end-start)/1000.0);
	}
}


