package pack06;

public class Point {// 좌표

//private 내부접근만 가능함: 정보은닉
	private int x;// 0~100
	private int y;// 0~100
	public int getX() {
		return x;
	}
	public void setX(int x) {
		if(x<0 || x>100) {
			System.out.println("오류입니다.");
			return;}
		this.x = x;
	}
	public int getY() {
		
		return y;
	}
	public void setY(int y) {
		if(y<0 || y>100) {
			System.out.println("오류입니다.");
			return;}
		this.y = y;
	}

	public Point(int x, int y) {
		//경계검사
		setX(x);
		setY(y);
		
		
	}

	public void showPointInfo() {
		System.out.println("좌표는");
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("---------------");
		
	}
//
//	public void setX(int x) {
//		if(x<0 || x>100)return;
//		this.x = x;
//		
//	}
//	public void setY(int y) {
//		if(y<0 || y>100)return;
//		this.y = y;
//		
//	}
//	public getX() {
//	return x;
//		
//	}
//	
}
