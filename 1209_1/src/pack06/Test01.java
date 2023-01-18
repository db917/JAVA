package pack06;

public class Test01 {
	public static void main(String[] args) {
		Car c1 = new Car("red", "auto", 4);
		c1.showCarInfo();// red auto 4

		Car c2 = new Car("blue", "manual", 2);
		c2.showCarInfo(); // blue manual 2

		Car c3 = new Car("black", 0);
		c3.showCarInfo(); // black auto 2

		Car c4 = new Car(); // white auto 4
		c4.setColr("yellow");
		c4.setDoor(8);
		c4.showCarInfo();
		
		Car c5 = new Car(); // white auto 4
		c5.showCarInfo();
		
		
		
		
		
		
	}

}
