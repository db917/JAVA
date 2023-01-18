package pack02;

public class EX06 {

public static void main(String[] args) {
	int num1=10,num2=20;
//	//if(!(num1==num2)
//	if(num1!=num2 ) {
//		System.out.println("두 수는 같지 않다.");
//	}
//	else {
//		System.out.println("두 수는 같다");
//	}
	if (num1==num2) {
		System.out.println("두 수는 같다.");
	}
	else {
		System.out.println("두 수는 같지않다.");
	}
	
//	//삼황(조건)연산자 ? :
	int a,b,max,mini;
	a=10; b=20;
	max=(a>b) ? a : b;
	mini=(a<b) ? a : b;
	System.out.println("max는="+max);
	System.out.println("mini는="+mini);
	
	if(a>b) {
		max=a;
	}
	else {//a<=b
		max=b;
	}
	System.out.println("if_max는="+max);
}
//	
//	//삼황(조건)연산자 ? :
//	int a,b,c,max;
//	a=10; b=20; c=30;
//	max=(a>b) ? (a>c) ?a:c: (b>c)?b:c;
//	System.out.println("응용_max는="+max);
//
//	
//	if(a>b) {
//		max=a>c?a:c;
//	}
//	else {//a<=b
//		max=b>c?b:c;
//	}
//	System.out.println("응용_if_max는="+max);
//}
}
