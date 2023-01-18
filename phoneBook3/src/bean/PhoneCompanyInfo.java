package bean;

public class PhoneCompanyInfo extends PhoneInfo{
	private String company;

//	public PhoneCompanyInfo(String name, String pNum, String company) {
//		super(name, pNum);
//		this.company = company;
//	}

	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("company: "+company);
	} 
	
	

}
