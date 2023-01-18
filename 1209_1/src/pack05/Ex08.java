package pack05;

class Data {
	int x;

}

//public 공공의 대표 클래스 라는 뜻을 가지고있다.
//대표클래스는 클래스 이름에맞게 만들어야함
public class Ex08 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main d.x=" + d.x);
		change(d.x);//매개변수
		change2(d);//매개변수
	}

	private static void change2(Data d) {
	d.x++;
	System.out.println("change2 d.x=" + d);
	}

	private static void change(int x) {//인수값
		x++;
		System.out.println("change d.x=" + x);
		
	}
}
