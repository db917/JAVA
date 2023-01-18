package part04;

public class Member {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		super();
		this.setMemberId(memberId);
		this.setMemberName(memberName);
	}
	@Override
	public int hashCode() {
		return memberId%3;  //0,1,2
	}
	@Override
	public boolean equals(Object obj) {
		Member cmp=(Member)obj;
		if(this.memberId==cmp.memberId) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return memberId+", "+memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
}
