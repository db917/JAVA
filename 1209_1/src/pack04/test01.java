package pack04;

public class test01 {
	public static void main(String[] args) {
		String str1 = new String("park");// 이거와
		String str2 = "park";// 이건는 같다.

		System.out.println(str1);
		System.out.println(str2);
		// 인스턴스 배열은 각 요소에 인스턴스 참조값을 저장한다.
		String[] names = new String[3];
		names[0] = "park";
		names[1] = "sark";
		names[2] = "zark";
        //1번 3번 자리 스왑
		String temp = names[0];
		names[0]=names[2];
		names[2]=temp;
		
		for(String name:names) {
		System.out.println(name);
	}
	}
}
