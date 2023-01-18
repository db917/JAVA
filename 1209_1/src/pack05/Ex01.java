package pack05;

public class Ex01 {
	public static void main(String[] args) {
		final double PI=3.14;//지역 상수변수
		Student s1 = new Student();
		Student.scName="인천일보아카데미";//static (클래스)변수-고유변수
		s1.name="kim";
		s1.sNo=1;
		s1.age=10;
		//s1.scName="인천일보아카데미";이렇게 넣어도되지만 
		//인스턴스 안에 포함되어있는것 처럼 보이기 때문에 지양한다. 
		s1.study();
		s1.exam();
		System.out.println("name="+s1.name);
		System.out.println("sNo="+s1.sNo);
		System.out.println("age="+s1.age);
		System.out.println("scName="+Student.scName);//클레스이름.변수를 넣는다.
		
		Student s2 = new Student();
		s2.name="lee";
		s2.sNo=2;
		s2.age=10;
		s2.study();
		s2.exam();
		
		Student s3 = s1;
		s3.study();
		s3.exam();
		System.out.println("name="+s3.name);
		System.out.println("sNo="+s3.sNo);
		System.out.println("age="+s3.age);
		System.out.println("scName="+s3.scName);
	}

}
