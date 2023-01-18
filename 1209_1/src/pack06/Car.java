package pack06;
//private < (default)<protected(상속)<public
public class Car {
	private String colr;
	private String menu;
	private int door; //1-4 사이만인정
	//모든필드의 get set 자동완성


//	public static void main(String[] args) {
//		Car c1= new Car("red","auto",4) ;
//				c1.showCarInfo();// red auto 4
//		
//		Car c2= new Car("blue","manual",2) ;
//			c2.showCarInfo(); //blue manual 2
//		
//		Car c3= new Car("black",0) ;
//				c3.showCarInfo(); //black auto 2
//		
//		Car c4= new Car();	//	white auto 4
//				c4.showCarInfo();


//}

	private void massege() {
		if(door>4 || door<2) {
			this.door = 0;
			System.out.println("문개수 입력오류 1~4사이 값만 인정됩니다.");
			return;
		}
		
	} //메세지
	public Car(String colr, String menu, int door) {
		this.colr = colr;
		this.menu = menu;
		this.door = door;
		massege();
	}
	public Car(String colr,int door) {
		this (colr,"auto",door);//생성자는 인스턴스 호출할때 1번만 가능하기때문에 여기서 this가아닌 car가 들어가야할 것같지만 this가들어간다.
//		this.colr = colr;
//		this.menu = "auto";
//		this.door = door;
	}
	public Car() {
		this("white","auto",4);
//		this.colr = "white";
//		this.menu = "auto";
//		this.door = 4;
	}

	public void showCarInfo() {
	System.out.println(colr+","+menu+","+door);
	System.out.println("------------");
	}
	
	public void run() {
		
		System.out.println("part1.Car 가 달린다.");
	}
	
	////겟셋
	public String getColr() {
		return colr;
	}
	public void setColr(String colr) {
		this.colr = colr;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
		massege();
	}
	
		
	
}