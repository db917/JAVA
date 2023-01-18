package part04;

public class MemberListTest {

	public static void main(String[] args) {
		MemberHashMap mHashSet=new MemberHashMap();
		Member mLee=new Member(1001, "이순신");
		Member mKim=new Member(1002, "김유신");
		Member mKang=new Member(1003, "강감찬");
		Member mHong=new Member(1003, "홍길동");
		mHashSet.addMember(mLee);
		mHashSet.addMember(mKim);
		mHashSet.addMember(mKang);
		mHashSet.addMember(mHong);
		
		mHashSet.showAllMember();
		mHashSet.removeMember(mKim.getMemberId());  //김유신 삭제
		mHashSet.showAllMember();

	}

}
