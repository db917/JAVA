package pack08;

public class ShapeEx {
	public static void main(String[] args) {

		
		Ring r1 = new Ring(1,1,2.2,3,3,4.4);
		Ring r2 = new Ring(new Circle(1,1,2.2),new Circle(3,3,4.4));
		
		r1.showRingInfo();
		r2.showRingInfo();
		
		//		Circle cir1 = new Circle(new Point(5,5),4.5);
//		
//		Circle cir2 = new Circle(5,5,4.5);
//		cir1.showCircleInfo();
//		cir2.showCircleInfo();
	

	}
	
}	