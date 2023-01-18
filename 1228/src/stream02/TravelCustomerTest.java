package stream02;

import java.util.ArrayList;
import java.util.List;

import stream01.ArrayListStreamTest02;

public class TravelCustomerTest {
	public static void main(String[] args) {
		
		TravelCustomer cusIle = new TravelCustomer("일순신", 40, 100);
		TravelCustomer cusLee = new TravelCustomer("이순신", 20, 100);
		TravelCustomer cusSam = new TravelCustomer("삼순신", 10, 50);
		
		List<TravelCustomer> cusList= new ArrayList<>();
		cusList.add(cusIle);
		cusList.add(cusLee);
		cusList.add(cusSam);
		
		
		System.out.println("고객 명단 출력");
		cusList.stream().map(c->c.getName()).forEach(c->System.out.println(c));
		System.out.println("\n여행비용");
		cusList.stream().map(c->c.getPrice()).forEach(c->System.out.println(c));
		System.out.println("\n여행총비용");
		int sum=cusList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println(sum);
		
		System.out.println("\n20세 이상 고객 이름을 정렬해서 출력");
		cusList.stream().filter(c->(c.getAge()>=20)).map(c->c.getName()).sorted().forEach(c->System.out.println(c));
		
	}
	
	

}
