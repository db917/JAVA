package pack01;

public class Ex02 {
//null 누군가를 참조하고있지않다. 
	public static void main(String[] args) {
		String fullname="";
		String fname="";//Enpty String 빈문자열
//		if(!fname.equals("")){//빈문자열 여부 비교
			if(!(fname==null)){//빈문자열 여부 비교
			System.out.println("성씨가 있음");
			
		}System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		fullname+=fname;
		String lname="mg";
		fullname+=lname;
		
		System.out.println("Fullname="+fullname);
				
	}

}
