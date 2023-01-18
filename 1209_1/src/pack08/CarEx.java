package pack08;

//import pack06.Car;
// pack06의 모든 글래스를 가져와서 사용가능하다.
// 기본적으로 java.lang.* 이게 임포트 되있다.
import pack06.*;


public class CarEx {
public static void main(String[] args) {
	Car c1= new Car("red","auto",4);
	c1.showCarInfo();
	
	
	pack07.Car c2= new pack07.Car(300,"dmd");
	c2.showInfo();
	
}
}
