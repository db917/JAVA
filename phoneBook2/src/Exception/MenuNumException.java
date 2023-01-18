package Exception;

public class MenuNumException extends Exception{
	private int wrongNum;
	public MenuNumException(int num) {
		super("메뉴 선택이 잘못되었습니다.");
		this.wrongNum=num;
	}
	public void showWrongNum() {
		System.out.println(wrongNum+"번 메뉴는 존재하지 않아요!");
	}
}
