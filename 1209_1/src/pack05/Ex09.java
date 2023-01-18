package pack05;

class Data2 {
	int max;
	int min;

}

public class Ex09 {
	public static void main(String[] args) {
		int[] arr;
		arr = new int[] { 10, 20, 30, 40, 50, };
		arr = createIntArr(10);
		addAllArr(arr, 7);
		showArr(arr);
		Data2 data = showMaxMinArr(arr);
		System.out.println("max=" + data.max);
		System.out.println("min=" + data.min);

	}

	private static Data2 showMaxMinArr(int[] arr) {
		Data2 data1 = new Data2();
		int max1, min1;
		max1 = min1 = arr[0];
		for (int val : arr) {
			if (max1 > val)
				max1 = val;
			if (max1 < val)
				min1 = val;

		}
		data1.max = max1;
		data1.min = min1;
		return data1;
//		for (int i = 0; i < arr.length; i++) {
//		int	max= arr[i]<arr[(arr.length-1)]?arr[(arr.length-1)]:arr[i];
//		return data.max=max;
//		}

	}

	private static int[] createIntArr(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 10;

		}
		return arr;

	}

	private static void showArr(int[] arr) {
		for (int e : arr) {
			System.out.println(e);
		}
	}

	private static void addAllArr(int[] arr, int i) {
		for (int trans = 0; trans < (arr.length); trans++) {
			arr[trans] += i;

		}

	}
}
