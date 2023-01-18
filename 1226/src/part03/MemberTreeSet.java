package part03;

import java.util.Iterator;
import java.util.TreeSet;


public class MemberTreeSet {

	private TreeSet<Member> mTreeSet;

	public MemberTreeSet() {
		mTreeSet = new TreeSet<Member>();

	}

	public void addMember(Member mb) {
		mTreeSet.add(mb);// 회원 저장
		
	}

	public boolean removeMember(int memberId) {
		// 알터리스트로 하는거
		Iterator<Member> ir = mTreeSet.iterator();
		while (ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemverId() == memberId) {
				mTreeSet.remove(member);
				return true;
			}

		}

		System.out.println(memberId + "가 존재하지 않아요");
		return false;

	}

	public void showAllMember() {

		System.out.println("mTreeSet=" + mTreeSet.toString());
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		for (Member mb : mTreeSet)
			System.out.println(mb.toString());

	}

}
