package stream02;

public class TravelCustomer {
	private String name;
	private int age;
	private int price;

	TravelCustomer(String name, int age, int pirce) {

		this.name = name;
		this.age = age;
		this.price = pirce;

	}
	
	@Override
	public String toString() {
	
	return "name: "+name+"age: "+age+"price: "+price;
	
	}
	
	
	
///겟셋
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
