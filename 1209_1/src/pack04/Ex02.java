package pack04;

public class Ex02 {
	public static void main(String[] args) {
		//2차원 배열이상 (다차원 배열)
		//3행 4열
		int[][] arr= new int[3][4];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=i+j;
			
			}		
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" | ");
			}		
			System.out.println("");
			System.out.println("---------------");
		}
	}
}
