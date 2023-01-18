package pack05;

class Data3 {
	int max;
	int min;//전역변수 필드에 변수 

}

public class Test01 {
	public static void main(String[] args) {
//		int[] arr;
//		arr = new int[] { 10, 20, 30, 40, 50, };
		Data3 data1 = new Data3();
		data1.max=2;
		System.out.println(data1.max);
//		Data3 data = showMaxMinArr(arr);
//		System.out.println("max=" + data.max);
//		System.out.println("min=" + data.min);

//	}

//	private static Data3 showMaxMinArr(int[] arr) {
//		Data3 data1 = new Data3();
//		int max, min;//지역변수
//		max = min = arr[0];
//		for (int val : arr) {//10//20
//			if (max > val)//10,10//10,20//
//				max = val;//10//20//50
//			if (min < val)//10//10,20//
//				min = val;//10//10
//
//		}
//		data1.max = max;
//		data1.min = min;
//		return data1;


	}

}
