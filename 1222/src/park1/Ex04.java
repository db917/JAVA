package park1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		// 파일 입력용 인스턴스
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("a.txt");
			System.out.println("read");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if (fin!=null) 
			try {
				fin.close();
			} catch (IOException e) {
				System.out.println("입력스트림 닫기 실패");
				e.printStackTrace();
			}
		System.out.println("finally");
		}
		System.out.println("continue");

	}

}
