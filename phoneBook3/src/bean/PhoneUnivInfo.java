package bean;

public class PhoneUnivInfo extends PhoneInfo {

	private String major;
	private int year;



	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("학년: " + major + "나이: " + year);
	}

}
