package part01;

class Point{
	
	private int x,y;
}
class Circle extends Point{
	
}

public class ObjectTest {
	
	public static void main(String[] args) {
		Object obj = new Point();
		obj = new int[5];
		fct(new Point());
		fct(new Circle());
		
	}

	private static Object fct(Object p) {
		return new Point();
	//	return "aaa";
		
		
	}
	
	

}
