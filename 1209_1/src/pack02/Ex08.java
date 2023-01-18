package pack02;

public class Ex08 {
	public static void main(String[] args) {
		//윤년의 조건:2/29
		//4배수년은 윤년
		//100배수년은 제외
		//400배수년은 우년
		int year=2100;
//		if((year%4==0 && year%100!=0) || year%400==0) {
		if(year%4==0) {
			if (year%100!=0 || year%400==0){
				System.out.println("윤년입니다.");
			}else {
				System.out.println("윤년아닙니다.");
			}
			
		}else {
		System.out.println("윤년아닙니다.");
		}
	}//mainend

}//classend
