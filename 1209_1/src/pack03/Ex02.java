package pack03;


public class Ex02 {
	public static void main(String[] args) {
//		int[] arr = new int [5];// = new int []{0,0,0,0,0} 기본적으로 자바가 기본값으로 초기화되어있다.
//		int[] arr = {7,8,9,6,4,3};// 변수모양 지정한 배열에는 이렇게 간소화 가능
		int[] arr = {7,8,9,6,4,3};
		//위배열의 합과 평균 소수점이하 구하시오
		int j=0;
		double avg;
		for (int i=0; i < arr.length; i++) {
			j+=arr[i];
		}			System.out.println("합계="+j);
		avg=(double)j/arr.length;
		System.out.println("평균"+avg);
	}			
					

	}


