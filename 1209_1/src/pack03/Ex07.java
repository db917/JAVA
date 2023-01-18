package pack03;

public class Ex07 {

		public static void main(String[] args) {
//			// 배열의 인댁스 값을 서로 바꾼다.
			int[] arr = new int[] { 8, 4, 1, 9, 7 };
//			for (int i = 0; i < (arr.length / 2); i++) {
//				int trans=arr[i];
//				arr[i]=arr[arr.length-1-i];
//				arr[arr.length-1-i]=trans;
//			
//			}//배열의 요소값을 순차적을 val변수에 복사//foreach문
//			for(double val:arr)
//			{
//				System.out.println(val);
//			}
			//내가푼거
			int trans = 0;// 5/2=2
			for (int i = 0; i < (arr.length / 2); i++) {
				for (int j = 4 - i; j > (arr.length / 2); j--) {
					trans = arr[j];// trans=7,9
					arr[j] = arr[i];// arr4=8,4
					arr[i] = trans;// arr0=8,9
					// System.out.println(arr[i]);
					break;
				}
				}for (int k = 0; k < 5; k++) {
					System.out.print(arr[k]); // for1
			} // main

		}
}
