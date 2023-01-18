package pack01;

public class Ex03 {
	public static void main(String[] args) {
	//자료형(Type) 변수= 정수 값
		int age=30;
		age-=1;//age=age-1;
		System.out.println("나이는:"+age);
		System.out.println("만 나이:"+(age-1));
		
		int num1=10,num2=20;//초기화 이니셜라이즈
		int num3=num1+num2;
		System.out.println("num1="+num1+",num2="+num2+",num3="+num3);
	
		double val1,val2,result;
		val1=1.00000001;
		val2=2.00000001;
		result=val1+val2;
		System.out.println(result);
		
		long a=10000000000L; //100억
		System.out.println(a);
	}

}
