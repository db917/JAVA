package pack08;
class SimpleAdder{
	
	private int num;
	
	public SimpleAdder(int num) {
		this.num=num;
	}

	public SimpleAdder add(int num) {
		this.num+=num;
		return this;//체이닝 호출을 가능하게하기위해서
	}
	public SimpleAdder sub(int num) {
		this.num-=num;
		return this;//체이닝 호출을 가능하게하기위해서
	}
	public SimpleAdder mul(int num) {
		this.num*=num;
		return this;//체이닝 호출을 가능하게하기위해서
	}

	public void showResult() {
		System.out.println("num="+num);
		
	}




	
}

public class ThisEx {

	public static void main(String[] args) {
		SimpleAdder adder=new SimpleAdder(10);//num=0
	
		adder.add(20).sub(20).mul(20);//체이닝
		
		adder.showResult();
	
		
//		adder.showResult();/num=40
		
	}
	
}
