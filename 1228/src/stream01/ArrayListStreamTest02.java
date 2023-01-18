package stream01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest02 {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
		sList.add("일순신");
		sList.add("이순신");
		sList.add("삼순신");
		sList.add("사순신");
		sList.add("오순신신");

		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		System.out.println();

//		

		Stream<String> stream = sList.stream();
		stream.forEach((n) -> System.out.println(n));

		System.out.println();
		sList.stream().sorted().forEach((n) -> System.out.print(n + "\t"));
		System.out.println();
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		sList.stream().filter(s -> s.length() >= 4).forEach(n -> System.out.print(n + "\t"));
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);

		int sum2 = list.stream().mapToInt(n -> n.intValue()).sum();

		System.out.println("sum=" + sum2);
		

	}

}
