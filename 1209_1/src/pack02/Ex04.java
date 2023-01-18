package pack02;

public class Ex04 {
	public static void main(String[] args) {
		//다항 연산자:++ --(증감연산자)   일씩 증가할때 쓴다.
		//      전위식(prefix) 후위식(postfix)	결과
		//a=10  ++a			 a++			a=a+1(a+=1)
		//b=10  --b			 b--			b=b-1(b-=1)
		//연산자가 앞에있으면 선증감후 연산 
		//연산자가 뒤에있으면 선연산후 증감
		
		
		//전위식(참조전 증가) 대입
		int a=10,b;
		b= ++a*4;
		System.out.println(a);
		System.out.println(b);

		//후위식(참조 후 증가) 대입
		int c=10,d;
		d= c++*4;
		System.out.println(c);
		System.out.println(d);
		
		
		System.out.println(d++);//40 출력 후 41로 증가
		System.out.println(d);
		
		int num1=7, num2;
//		num2= (num1--) +5;
		num1--;
		num2= (num1)+5;
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		
	}

}
