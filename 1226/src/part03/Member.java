package part03;
//정렬 기준 정의 : Comparable 또는 Comparator 구현함
public class Member implements Comparable<Member>{

	private int memverId;
	private String memverName;
//	정렬 기준
	//this는 현재 추가인스턴스, mb는 기존 인스턴스
	@Override
	public int compareTo(Member mb) {
//	return this.memverId.compareTo(mb.memverId);
	if (this.memverId>mb.memverId)
		return 1;
	else if (this.memverId<mb.memverId)
		return -1;
	else return 0;
		
	}
//
//	@Override
//	public int hashCode() {
//		return memverId;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//
//		Member cmp = (Member) obj;
//		if (this.memverId == cmp.memverId)
//			return true;
//		return false;
//
//	}

	public Member(int memverId, String memverName) {
		super();
		this.memverId = memverId;
		this.memverName = memverName;

	}

	@Override
	public String toString() {

		return memverId + memverName;

	}

	public int getMemverId() {
		return memverId;
	}

	public void setMemverId(int memverId) {
		this.memverId = memverId;
	}

	public String getMemverName() {
		return memverName;
	}

	public void setMemverName(String memverName) {
		this.memverName = memverName;
	}


}
