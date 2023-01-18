package pack05;

public class Ex07 {
	public static void main(String[] args) {
		//자바에서는 상위에서 선언한 변수를 하위에서 쓸수 없다.
		//오류=Duplicate local variable num
		//같은 항열에서는 사용가능 하기의 if문 for문 예시 
//		int num = 10;
		if (true) {
			int num = 20;
			System.out.println(num);//20
			
		}	
		int num;//변수의 사용범위 넓다고 관리하기 편한게 아닌다.
		for (num=0;num<10;num++) {
			System.out.println(num);//10
			
		}		
		System.out.println("End"+num);//10
	}
}
