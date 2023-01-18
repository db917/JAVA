package pack05;


public class test02 {
	public static void main(String[] args) {
		String str1 = new String("joker");
		String str2 = new String("joker");
		if(str1 == str2){
			System.out.println("같은 주소값 입니다.");
		}else{
			System.out.println(str1);
			System.out.println(str2);
		}
	}
}
