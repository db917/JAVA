package part03;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet mTreeSet= new MemberTreeSet();
		Member mIll= new Member(2001,"일순신2");
		Member mLee =new Member(2002,"이순신2");
		Member mSam= new Member(2003,"삼순신2");
		Member mSa= new Member(2004,"사순신2");
		Member mO= new Member(2004,"오순신2");

		
		mTreeSet.addMember(mIll);;
		mTreeSet.addMember(mIll);
		mTreeSet.addMember(mLee);
		mTreeSet.addMember(mSam);
		mTreeSet.addMember(mSa);
		mTreeSet.addMember(mO);
		
		
		
		mTreeSet.showAllMember();
		mTreeSet.removeMember(2002);
	}

}
