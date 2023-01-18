package part01;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex01 {
	public static void main(String[] args) {
//		set 중복값 인정하지 않음. 저장순서 의미 없음
		HashSet<String> set = new HashSet<>();
		set.add("일");
		set.add("이");
		set.add("이");
		set.add("삼");
		set.add("사");
		Iterator<String> ir = set.iterator();
		System.out.println(set.size());
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		while(ir.hasNext()) {
			
			String curString=ir.next();
			System.out.println(curString);
			if(curString.equals("이"))
			ir.remove();
		}

	}

//		//List : 중복값 인정, 순서대로 저장(출력)
//		LinkedList<Integer> list=new LinkedList<>(); ArrayList랑 비슷하다.
//		ArrayList<Integer> list=new ArrayList<>();
//		list.add(new Integer(10));
//		list.add(20);
//		list.add(20);
//		list.add(30);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//			
//		}System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		for (Integer e: list) {
//			System.out.println(e);
//			
//		}System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		
//		list.remove(1);//삭제
//		
//		for (Integer e: list) {
//			System.out.println(e);
//		}System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

	// 제네릭스 예제1
//		ArrayList<String> list=new ArrayList<>();
//		list.add("aaa");
//		list.add("bbb");
//		list.add("ccc");
//		String str1=list.get(0);
//		String str2=list.get(1);
//		String str3=list.get(2);
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);

	// 에제2
//		ArrayList list=new ArrayList();
//		list.add("aaa");
//		list.add("bbb");
//		list.add(10);
//		String str1=(String)list.get(0);
//		String str2=(String)list.get(1);
//		Integer str3=(Integer)list.get(2);
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
}
