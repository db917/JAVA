package part01;

public class Gc_Test {
	public static void main(String[] args) {
		Student obj1 = new Student(1, "park");
		
		Student obj2 = obj1;
		obj2=obj1=null;
		
		
		
		System.out.println("End");
		System.gc();
		System.runFinalization();
		
	}

}
