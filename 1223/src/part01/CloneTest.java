package part01;

public class CloneTest {
	
	public static void main(String[] args) {
		Student org=new Student(10,"lee");
		try {
			Student cpy=(Student)org.clone();
			System.out.println(System.identityHashCode(cpy));
			System.out.println(System.identityHashCode(org));
		} catch (CloneNotSupportedException e) {
			System.out.println("복제 예외 발생");
			e.printStackTrace();
		}
		System.out.println("continue");
		
	}

}
