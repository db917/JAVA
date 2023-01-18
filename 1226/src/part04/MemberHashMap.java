package part04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap=new HashMap<>();
	}
	public MemberHashMap(int size) {
		hashMap=new HashMap<>(size);
	}
	public void addMember(Member mb) {
		hashMap.put(mb.getMemberId(), mb); //회원 저장
	}
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) { // 내부반복 검색
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId+"가 존재하지 않아요");
		return false; //삭제 실패
	}
	public void showAllMember() {
		Collection<Member> mList=hashMap.values();
		System.out.println(mList);
		
		Iterator<Integer> ir=hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key=ir.next();
			Member mb=hashMap.get(key);
			System.out.println(mb);
		}
	}
	
	
}
