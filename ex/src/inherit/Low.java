package inherit;


public class Low implements Animal {
	int speed;
	int num;
	Low(int speed, int num)
	{
		this.speed=speed;
		this.num=num;
		System.out.println("speed"+speed+"num"+num);
	}

	@Override
	public String sta() {
		System.out.println("초식동물입니다.");
		return null;
	}

	public static void main(String[] args) {
			Low low =new Low(1,4);
			low.sta();
						
	}

}
