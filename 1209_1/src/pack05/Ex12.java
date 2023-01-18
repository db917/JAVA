package pack05;

public class Ex12 {
public static void main(String[] args) {
	//메소드 오버로딩:매개변수의 타입 또는 갯수 상이해야함
	System.out.println();
	System.out.println(10);
	System.out.println('A');
	System.out.println(true);
	System.out.println("aaa");
	
	
	
	showData();
	showData(10);
	showData(3.4);
	showData(10,20);
	showData("cha",30);
	
	
}

private static void showData(String name, int age) {
	System.out.println("name="+name);
	System.out.println("name="+age);
	System.out.println("------------");
	
}

private static void showData(int i, int j) {
	System.out.println("i="+i);
	System.out.println("j="+j);
	System.out.println("------------");
	
}

private static void showData(double d) {
	System.out.println("d="+d);
	System.out.println("------------");
}

private static void showData(int i) {
	System.out.println("i="+i);
	System.out.println("------------");
}

private static void showData() {
	System.out.println("없으");
	System.out.println("------------");
}
}
