package pack02;

public class Ex09 {
	public static void main(String[] args) {
		//switch~ case 문
		//장점 가독성이좋다.
		//단점 탈출문이 없다면 충족된 값부터 모두 적용된다.
		
		int n=2;
		switch(n) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		default:
			System.out.println("Etc");

		}//switchend
	}//m_end

}//c_end
