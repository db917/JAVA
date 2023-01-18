package pack08;

public class Circle {

	private Point point;
	private double radius;

	public Circle(Point point, double radius) {
		this.point=point;
		this.radius=radius;
		
	}
	public Circle(int x, int y, double r) {
		this.point= new Point(x,y);
		this.radius=r;
		
	}

	public void showCircleInfo() {

		System.out.println();
		this.point.showPointInfo();//재활용
		System.out.println("반지름 :"+radius);
	}


}
