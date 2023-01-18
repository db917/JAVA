package pack05;

public class Ex11 {
public static void main(String[] args) {
	Student2.showTitle();
	
	Student2 s1=new Student2();//1
	s1.name="park";
	s1.age=20;
	s1.showInfo();
	//참조형 참조변수 선언  1과 2는 같아 보여도 다른 인스턴스다.
	Student2 s2=new Student2();//2
	s2.name="sark";
	s2.age=10;
	s2.showInfo();

	
	
}
}
