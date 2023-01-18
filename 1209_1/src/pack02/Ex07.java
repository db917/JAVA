package pack02;

public class Ex07 {
	// 한문장일 경우 {} 생략 가능하다.
	public static void main(String[] args) {
//		int num=10;
//		if(num<0) System.out.println("음수");
//		if(num>0)System.out.println("양수");
//		
//		if(num==0) {
//			System.out.println("제로");
//			System.out.println("num:"+num);
//		}
//		System.out.println("-------------");
//		
//		//if~else문
//		if(num<0) {
//			System.out.println("음수");
//		}
//		else { //num>=0
//			if(num>0) {
//				System.out.println("양수");
//			}
//			else {
//			System.out.println("제로");
//		}
//		}
//		System.out.println("-------------"); 
		// 90점 이상 :A, 80점 이상 :B.....70점 미만 :F
		int jumsu = 85;
		String grade;
		if (jumsu >= 90 && jumsu <= 100) {
			grade = ("a");
			System.out.println(grade);
		} else {
			if (jumsu >= 80) {
				grade = ("b");
				System.out.println(grade);
			}else {
				if (jumsu >= 70) {
					grade = ("c");
					System.out.println(grade);
				}else {
					if (jumsu < 70) {
						grade = ("f");
						System.out.println(grade);
					}
				}
			}
		}

	}// main end
}
// class end
