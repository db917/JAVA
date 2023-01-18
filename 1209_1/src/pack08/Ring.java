package pack08;

//캡슐화는 클래스단위로하고 기본적으로 정보은닉을 한다.(private)설계도(클래스를 ) 재활용을 하려는 목적도 있다.
public class Ring {

	private Circle inCir;
	private Circle outCir;

	public Ring(Circle circle, Circle circle2) {

		this.inCir = circle;
		this.outCir = circle2;

	}

	public Ring(int x, int y, double hef, int x1, int x2, double hef2) {
		{
			this.inCir = new Circle(x, y, hef);
			this.outCir = new Circle(x1, x2, hef2);
		}
	}

	public void showRingInfo() {

		System.out.println();
		this.inCir.showCircleInfo();// 재활용
		this.outCir.showCircleInfo();// 재활용

	}

}
