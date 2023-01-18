package part02;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet mHashSet= new MemberHashSet();
		Member mIll= new Member(2001,"일순신2");
		Member mLee =new Member(2002,"이순신2");
		Member mSam= new Member(2003,"삼순신2");
		Member mSa= new Member(2004,"사순신2");
		Member mO= new Member(2004,"오순신2");

		
		mHashSet.addMember(mIll);
		mHashSet.addMember(mLee);
		mHashSet.addMember(mSam);
		mHashSet.addMember(mSa);
		mHashSet.addMember(mO);
		
		
		
		mHashSet.showAllMember();
		mHashSet.removeMember(2002);
	}

}
