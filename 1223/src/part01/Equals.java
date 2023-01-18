package part01;

public class Equals {
	
	public static void main(String[] args) {
		Student std1 = new Student(100, "kim");
		Student std2 = new Student(100, "kim");
		System.out.println(std1==std2);//참조값비교
		System.out.println(std1.equals(std2));//내용비교
	}

}
