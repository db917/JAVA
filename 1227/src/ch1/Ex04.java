package ch1;


import java.io.*;
public class Ex04 {
	
	Ex04(){
		
	}
	
	
	public static void main(String[] args) throws IOException {
//		InputStream in = new FileInputStream("org.mp4");
//		OutputStream out = new FileOutputStream("cpy3.mp4");
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream("org.mp4"));
		BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("cpy3.mp4"));
		
		long start=System.currentTimeMillis();
		int copyByte = 0;
		int bData;
		while (true) {
			bData = bin.read();
//			byte buf[] = new byte[1024];
//			while (true) {
//				bData = bin.read(buf);
			if (bData == -1)
				break;
			bout.write(bData);
			copyByte++;
		}
		bin.close();
		bout.close();
		long end=System.currentTimeMillis();
		System.out.println("복사된 바이트 크기 " + copyByte);
		System.out.println("복사소요 시간 :" + (end-start)/1000.0);
	}
}
