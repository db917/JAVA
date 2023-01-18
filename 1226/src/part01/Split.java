package part01;

public class Split {
	
	
	public static void main(String[] args) {
		String str = "aaa,bbb,ccc";
		String[] arr= str.split(",");
		for (String s : arr) {
			
			System.out.println(s);
		}
	}

}
