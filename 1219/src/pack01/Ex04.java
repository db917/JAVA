package pack01;

public class Ex04 {
	public void StringBuffer(String str) {

	}

	public static void main(String[] args) {

		char a = 65;
		StringBuilder total = null;
		char sum = 0;

		StringBuilder sb = new StringBuilder();
		for (char b = 0; b <= 25; b++) {
			sum = (char) (a + b);
			total = sb.append(sum);
			total.toString();
		}
		System.out.println("알파벳의 순서는"+total+"입니다.");
		total.reverse();
		System.out.println("알파벳의 역순은"+total+"입니다.");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		String num = "2161516-5156156";
		System.out.println("num의 문자열 길이는"+num.length()+"입니다.");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		StringBuilder sb2 = new StringBuilder(num);

		for (int i = 0; i < num.length(); i++) {
			if (sb2.charAt(i)=='-') {
				sb2.deleteCharAt(i);
				sb2.toString();
				System.out.println("num에서 -를 뺸 값은"+sb2+"입니다.");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				break;
				
			}//System.out.println(sb2);
		}
	}
}
