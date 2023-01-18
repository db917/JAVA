package part02;

import java.util.HashSet;
import java.util.Iterator;


public class MemberHashSet {

	private HashSet<Member> mHashSet;

	public MemberHashSet() {
		mHashSet = new HashSet<Member>();

	}

	public void addMember(Member mb) {

		mHashSet.add(mb);// 회원 저장
	}

	public boolean removeMember(int memberId) {
		// 알터리스트로 하는거
		Iterator<Member> ir = mHashSet.iterator();
		while (ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemverId() == memberId) {
				mHashSet.remove(member);
				return true;
			}

		}

		System.out.println(memberId + "가 존재하지 않아요");
		return false;

	}

	public void showAllMember() {

		System.out.println("mList=" + mHashSet.toString());
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		for (Member mb : mHashSet)
			System.out.println(mb.toString());

	}

}
