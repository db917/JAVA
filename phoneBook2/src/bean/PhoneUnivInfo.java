package bean;

public class PhoneUnivInfo extends PhoneInfo {

	private String major;
	private int year;

	public PhoneUnivInfo(String name, String pNum, String major, int year) {
		super(name, pNum);
		this.major = major;
		this.year = year;

	}

	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("학년: " + major + "나이: " + year);
	}

}
