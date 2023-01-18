package stream01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest01 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		for (int num : arr) {
			System.out.print(num);
		}
		System.out.println("\nㅡㅡㅡㅡ");
		//스트림을 활용한 배열
		IntStream is=Arrays.stream(arr);
		is.forEach(n->System.out.print(n));
//		is.forEach(n->System.out.print(n));//위에서 소비됬기때문에 재사용 x
		System.out.println("\nㅡㅡㅡㅡ");
		

//		//재사용이 불가능하기때문에 다시생성해서 합계를 구한다.
		int sum =Arrays.stream(arr).sum();
		System.out.println("sum="+sum);
		
		//재사용이 불가능하기때문에 다시생성해서 합계를 구한다.
		long count =Arrays.stream(arr).count();
		System.out.println("count="+count);
			
	}

}
