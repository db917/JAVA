
package part01;

class Point01 {
	private int xPos, yPos;

	public Point01(int x, int y) {
		xPos = x;
		yPos = y;
	}

	@Override
	public boolean equals(Object obj) {
		Point01 cmp = ((Point01) obj);
		if (xPos == cmp.xPos && yPos == cmp.yPos)
			return true;
		return false;

	}

	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
	}
}

class Rectangle {
	Point01 upperLeft, lowerRight;

	public Rectangle(int x1, int y1, int x2, int y2) {

		upperLeft = new Point01(x1, y1);
		lowerRight = new Point01(x2, y2);

	}

	@Override
	public boolean equals(Object obj) {
		Rectangle cmp = (Rectangle) obj;
		if (upperLeft.equals(cmp.upperLeft))
			if (lowerRight.equals(cmp.lowerRight))
				return true;
		return false;
	}

	public void showPosition() {
		System.out.println("직사각형 위치정보...");
		System.out.print("좌 상단: ");
		upperLeft.showPosition();
		System.out.println("");
		System.out.print("우 하단: ");
		lowerRight.showPosition();
		System.out.println("\n");
	}

}

class EncapsulationEquals {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(1, 2, 8, 9);
		Rectangle rec2 = new Rectangle(2, 3, 5, 5);
		Rectangle rec3 = new Rectangle(1, 2, 8, 9);
		if (rec1.equals(rec3))
			System.out.println("rec1과 rec2의 내용 정보는 같다.");
		else
			System.out.println("rec1과 rec2의 내용 정보는 다르다.");
	}

}