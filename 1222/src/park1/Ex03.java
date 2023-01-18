package park1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {
//고오급 버전
	public static void main(String[] args) {
		// 파일 입력용 인스턴스
		try (FileInputStream fin = new FileInputStream("b.txt")) {
			System.out.println("read");

		} catch (FileNotFoundException e) {//종속관계 상위가 밑으로 가야된다 순서에 유의
			System.out.println("파일없음예외");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일스트림 close 예외");
			e.printStackTrace();
		}
		System.out.println("continue");
	}

}
