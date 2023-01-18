package part02;

import java.util.HashSet;
import java.util.Iterator;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + "(" + age + "세)";
	}
	@Override
	public int hashCode() {
		return age;
	}
	@Override
	public boolean equals(Object obj) {
		Person cmp=(Person) obj;
		if(this.age== cmp.age && this.name== cmp.name)
			return true;
		return false;
			
		
	}

	public static void main(String[] args) {
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("최순이", 10));
		hSet.add(new Person("최순이", 20));
		hSet.add(new Person("갑돌이", 20));
		hSet.add(new Person("갑돌이", 15));
		hSet.add(new Person("최순이", 20));
		hSet.add(new Person("갑돌이", 20));
		System.out.println("데이터 수:" + hSet.size());
		Iterator<Person> itr = hSet.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

}