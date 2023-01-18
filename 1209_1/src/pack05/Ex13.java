package pack05;

public class Ex13 {
	
	//생성자 오버로딩
	public static void main(String[] args) {
									//가로10 세로1 높이1
		System.out.println("박스 부피: "+boxVolum(10));
									//가로10 세로1 높이1
		System.out.println("박스 부피: "+boxVolum(10,20));
									//가로10 세로1 높이1
		System.out.println("박스 부피: "+boxVolum(10,20,30));
	}

	private static int boxVolum(int i) {
		return  boxVolum(i,1);
//		return  i*1*1;
	}
	private static int boxVolum(int i,int j) {
		return boxVolum(i, j, 1);
//		return  i*j*1;
	}
	private static int boxVolum(int i,int j,int k) {
		return  i*j*k;
	}
}
