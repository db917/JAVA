package part04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class HashMapTest {
	public static void main(String[] args) {
		
		Map<String,ArrayList<?>> hMap=new HashMap<>();
		
		ArrayList<Member> mList=new ArrayList<>();
		ArrayList<Integer> iList=new ArrayList<>();
		iList.add(10);
		iList.add(20);
		hMap.put("member", mList);
		hMap.put("intList", iList);
		System.out.println(hMap.get("intList"));
		
//		hMap.put("id", "aaa");
//		hMap.put("pw", "1111");
//		hMap.put("age", 5);
//				
//		System.out.println(hMap.get("id"));
//		System.out.println(hMap.get("pw"));
//		System.out.println((Integer)hMap.get("age")-1);
		//System.out.println(Integer.valueOf(hMap.get("age"))-1);
		

	}

}
