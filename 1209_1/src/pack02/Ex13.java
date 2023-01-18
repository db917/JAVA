package pack02;

public class Ex13 {
	//break 예시
	public static void main(String[] args) {
		int num=1;
		boolean search=false;
		while (num<101) {
			if(num%5==0 && num%7==0) {//35배수
				search=true;//검색성공
				break;
			}
			num++;
		}

	if (search) {
		System.out.println("검색성공"+num);
	}else {
		System.out.println("검색실패"+num);
	}
	}
}
