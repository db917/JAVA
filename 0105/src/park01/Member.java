package park01;

public class Member {
	private String id;
	private String pw;
	private String name;
	private int age;
	private String emall;
	
	
	
@Override
	public String toString() {
	String info="";
	info+="아이디 : "+id;
	info+=",비번 : "+pw;
	info+=",이름 : "+name;
	info+=",나이 : "+age;
	info+="이메일 : "+emall;
	
	return info;
	}
	//겟셋 구간
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmall() {
		return emall;
	}
	public void setEmall(String emall) {
		this.emall = emall;
	}

	
	
	
	
	
}
