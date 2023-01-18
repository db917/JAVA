package pack03;

public class Ex05 {
	public static void main(String[] args) {
		// 알고리즘: max, min
		//답안지
		int[] arr = new int[] { 3, 90, 11, 3, 4};
		int max,min;
		max=min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("max =" + max + "입니다.");
		System.out.println("min =" + min + "입니다.");
		
		//내가푼거
//		int[] arr = new int[] { 3, 90, 11, 3, 4};
//		int max = 0;
//		double min = 999999999999999999999D;
//		for (int i = 0; i < 5; i++) {
//			if (max <= arr[i]) {
//				max = arr[i];
//			
//			}if (min >= arr[i]) {
//				min=arr[i];
//			}
//
//		}
//		System.out.println("max =" + max + "입니다.");
//		System.out.println("min =" + (int)min + "입니다.");
	}
}
