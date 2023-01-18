package part02;


public class Member {

	private int memverId;
	private String memverName;

	@Override
	public int hashCode() {
		return memverId;
	}

	@Override
	public boolean equals(Object obj) {

		Member cmp = (Member) obj;
		if (this.memverId == cmp.memverId)
			return true;
		return false;

	}

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
