package bean;

public class PhoneInfo {
	private String name;
	private String pNum;
	

	@Override
	public int hashCode() {

//		return  
		return name.hashCode();
	}

	@Override
	public boolean equals(Object pInfo) {
		PhoneInfo cmp = (PhoneInfo)pInfo;
		
		if (this.pNum.equals(cmp.pNum)) {
		
			System.out.println("중복값 입니다. 죄송합니다.");
			return true;
		}
		
		return false;
	}

	public PhoneInfo(String name, String pNum/* , String ass */) {

		this.name = name;
		this.pNum = pNum;
	}


	
	public void showPhoneInfo() {
			
		System.out.println("성명 =" + name + "전화번호 =" + pNum);
	}

	/// 겟셋
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
//		public String getAss() {
//			return ass;
//		}
//		public void setAss(String ass) {
//			this.ass = ass;
//		}

}
