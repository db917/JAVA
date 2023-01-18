package pack05;

public class Ex03 {
	public static void main(String[] args) {
		int age=10;
		double height=180.5;
		String name="park";
		System.out.println("am");
		showinfo(name,age,height);//인자 파라미터
		lineprint("ㅡ",10);
		System.out.println("pm");
		showinfo(name,age,height);//인자 파라미터
		lineprint("*",20);
	}

	private static void lineprint(String str,int num) {
		String sum="";
		for (int i=0;i<=num;i++) {
         sum+=str;
		}
		System.out.println(sum);
		return;
	}
	private static void showinfo(String name, int age, double height) {//매개 이자 지역변수
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("height="+height);
		
	}

}
