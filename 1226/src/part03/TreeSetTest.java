package part03;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet<>();
		treeset.add(8);
		treeset.add(9);
		treeset.add(6);
		treeset.add(2);
		treeset.add(2);
		System.out.println(treeset + "개");
		Iterator<Integer> ir= treeset.iterator();//오름차순 참조반복자
		Iterator<Integer> ir2= treeset.descendingIterator();//내림차순 참조반복자
		while(ir.hasNext()) {
			System.out.println(ir.next());
			System.out.println(ir2.next());
		}
	}

}
