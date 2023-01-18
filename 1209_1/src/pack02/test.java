package pack02;

public class test {
	public static void main(String[] args) {
//		for문을 이용해서 1부터 100까지의 정수 
//		중에서 3의 배수의 총합을 구하는 코
//		드를 작성하시오.(출처 : 이것이 자바다 p133 3번 문제
		int a,sum=0,b=3,d=1;
		for(a=1;a<=100;a++) {
//			System.out.println(a);
			d=a*b;
			sum+=d;
			System.out.println(sum);
			if (sum-100>0)break;
			}
			
			System.out.println("합계는 ="+sum);
		
		//답안지
//		int sum = 0;
//
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				sum = sum + i;
//			}
//		}
//		System.out.printf("3의 배수의 합 : %d", sum);
	}//m_end
}//c_end
