package pack06;

public class Person {
	public Person(String name2, int age2, String birth2) {
		name = name2;
		age = age2;
		birth = birth2;

		// TODO Auto-generated constructor stub
	}

	// 인스턴스 변수
	String name;
	String birth;
	String set;
	int time;
	String bd;
	int iq;
	int age;
    static String nationality="Korea";
    
	// 인스턴스 메소드
	public void sleep() {
		String name="홍길동";

		System.out.println(this.name + "가" + time + "시간잔다.");
		System.out.println(name + "가" + time + "시간잔다.");

	}

	public void eat() {
		System.out.println(name + "가 세끼를 먹는다");

	}

	public void showInfo(String set1, int iq1, String bd1) {
		//this.현재 내가 작업하고있는 인스턴스를 가르키는 참조변수
		this.set=set1;
		this.iq=iq1;
		this.bd=bd1;
	
		System.out.println("iq"+iq);
		System.out.println("혈액형"+bd);
		System.out.println("성향"+set);
		System.out.println(nationality);
		
	}
	public void showInfo(String set1, int iq1) {
		this.set=set1;
		this.iq=iq1;
		System.out.println("iq"+iq);
		System.out.println("성향"+set);
		System.out.println(nationality);
	}
	public void showInfo(String set1) {
		this.set=set1;

		System.out.println("성향"+set);
	}

}
