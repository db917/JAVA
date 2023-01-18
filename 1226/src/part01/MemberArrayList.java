package part01;
import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> mList;

	public MemberArrayList() {
		mList = new ArrayList<Member>();

	}

	public void addMember(Member mb) {

		mList.add(mb);// 회원 저장
	}

	public boolean removeMember(int memberId) {
		//알터리스트로 하는거
		Iterator<Member> ir = mList.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			if (member.getMemverId()==memberId) {
				mList.remove(member);
				return true;
			}
			
			
		}
		//포문
		
//		for (int i = 0; i < mList.size(); i++) {
//			Member member = mList.get(i);
//			if (member.getMemverId() == memberId) {
//				mList.remove(i);
//				return true;
//			}
//
//		}
		System.out.println(memberId + "가 존재하지 않아요");
		return false;

	}

	public void showAllMember() {

		System.out.println("mList=" + mList.toString());
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
	for(Member mb:mList)
		System.out.println(mb.toString());
	
	}

}
