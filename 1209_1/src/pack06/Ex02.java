package pack06;

public class Ex02 {
	public static void main(String[] args) {
		//get가져오기 메소드set값넣기 메소스 확인
		Point p1 = new Point(10, 20);
//		p1.x = 123;  범위를 넘은 쓰래기값
//		p1.y = 123;
		p1.showPointInfo(); // x=10,y=20

		Point p2 = new Point(10, 200);
		p2.setX(11);
		p2.setY(101);
		System.out.println("x는"+p2.getX());
		System.out.println("y는"+p2.getY());
		p2.showPointInfo(); // x=10,y=20
	}

}
