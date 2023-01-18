package part01;

public class MemberListTest {
	public static void main(String[] args) {
		String str1 = "aBcd";
		String str2 = "abc";
		if (str1.compareTo(str2) < 0) {
			System.out.println("str1 앞서다");
		} else if (str1.compareTo(str2) > 0) {
			System.out.println("str2 뒤서다");
		} else if (str1.compareTo(str2) == 0) {
			System.out.println("str1,2 같다");
		}

		MemberArrayList mList = new MemberArrayList();

		Member mIll = new Member(1001, "일순신");
		Member mLee = new Member(1002, "이순신");
		Member mSam = new Member(1003, "삼순신");
		Member mSa = new Member(1004, "사순신");
		Member mO = new Member(1005, "오순신");
//		
//		mList.addMember(new Member(1001,"일순신"));
//		mList.addMember(new Member(1002,"이순신"));
//		mList.addMember(new Member(1003,"삼순신"));
//		mList.addMember(new Member(1004,"사순신"));
//		mList.addMember(new Member(1005,"오순신"));

		mList.addMember(mIll);
		mList.addMember(mLee);
		mList.addMember(mSam);
		mList.addMember(mSa);
		mList.addMember(mO);

		mList.showAllMember();
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		mList.removeMember(1002);
	}

}
