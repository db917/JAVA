package pack02;

public class Ex03 {
	public static void main(String[] args) {
		//(복합)대입 연산자
//		int kor;
//		int eng;
//		int tot=0;
//		kor=70;
//		// tot=tot+kor;
//		tot+=kor;
//		eng=71;
//		// tot=tot+eng;
//		tot+=eng;
//		System.out.println("tot="+tot);
//		System.out.println("avg="+(tot/2.0));
//		
//		int n=5;
//		 //n=(int)(n*2.2);
//		n*=2.2;
//		System.out.println(n);
//		
//		System.out.println(10/3); //몫
//		System.out.println(10&3); //나머지
		
//		int money=1000;
//		money%=300;
//		System.out.println(money/300+"개");
		
		//실행예 
//		만원권 1개
//		오천원권 0개
//		천원권 2개
//		오백원 0개
//		백원 3개
//		오십원 0개
//		십원 4개
		int money=12340;
		int a=10000;
		int b=5000;
		int c=1000;
		int d=500;
		int e=100;
		int f=10;
		System.out.println("12340원으로 살 수 있는 물건은");
		System.out.print(money/a+"개");
		System.out.println(",짤잘이는"+money%a+"입니다.");
		money%=a;
		System.out.print(money/b+"개");
		System.out.println(",짤잘이는"+money%b+"입니다.");
		money%=b;
		System.out.print(money/c+"개");
		System.out.println(",짤잘이는"+money%c+"입니다.");
		money%=c;
		System.out.print(money/d+"개");
		System.out.println(",짤잘이는"+money%d+"입니다.");
		money%=d;
		System.out.print(money/e+"개");
		System.out.println(",짤잘이는"+money%e+"입니다.");
		money%=e;
		System.out.print(money/f+"개");
		System.out.println(",짤잘이는"+money%f+"입니다.");
		money%=f;

		
		
	}

}
