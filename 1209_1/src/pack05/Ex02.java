package pack05;

public class Ex02 {
	//메소드 
	public static void main(String[] args) {
		Student s1= new Student();
		System.out.println("name="+s1.name);
		System.out.println("age="+s1.age);
		System.out.println("height="+s1.height);
		System.out.println("sNo="+s1.sNo);
		System.out.println("SNAME="+Student.scName);
	
		
		int age=10;
		double height=173.5;
		String name="park";
		System.out.println("am");
		showInfo(name,age,height);
		System.out.println("pm");
		showInfo("kim",12,180.1);
		
	}

	private static void showInfo(String name, int age, double height) {
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("height="+height);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
	}
}
