package bean;

public class PhoneInfo {
	private String kName;
	private String name;
	private String pNum;
	private int pKind;
	private String uMajor;
	private int uYear;
	private String cCompanyInfo;

	public String getkName() {
		return kName;
	}

	public void setkName(String kName) {
		this.kName = kName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getpNum() {
		return pNum;
	}

	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	public int getpKind() {
		return pKind;
	}

	public void setpKind(int pKind) {
		this.pKind = pKind;
	}

	public String getuMajor() {
		return uMajor;
	}

	public void setuMajor(String uMajor) {
		this.uMajor = uMajor;
	}

	public int getuYear() {
		return uYear;
	}

	public void setuYear(int uYear) {
		this.uYear = uYear;
	}

	public String getcCompanyInfo() {
		return cCompanyInfo;
	}

	public void setcCompanyInfo(String cCompanyInfo) {
		this.cCompanyInfo = cCompanyInfo;
	}

	@Override
	public String toString() {
		

		
		return name+","+pNum;
	}

//	public PhoneInfo(String name, String pNum,int pKind) {
//
//		this.name = name;
//		this.pNum = pNum;
//		this.pKind = pKind;
//		
//	}

	/// 겟셋
//	public void showPhoneInfo() {
//			
//		System.out.println("성명 =" + name + "전화번호 =" + pNum);
//	}

	/// 겟셋

}
