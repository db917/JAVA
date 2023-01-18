package inherit;

public class Top implements Animal {
	int power;
	int num;

	public Top(int power, int num) {
		this.power = power;
		this.num = num;
		System.out.println("power"+power+"\nnum"+num);
		
	}

	@Override
	public String sta() {
		System.out.println("육식동물입니다.");
		return null;
	}

	public static void main(String[] args) {
		Top top = new Top(1,2);
		top.sta();
	}
}
