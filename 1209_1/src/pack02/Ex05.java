package pack02;

public class Ex05 {
	public static void main(String[] args) {
		//산술>관계(비교)>논리
		
		
		//관계(비교) 연산자
//		boolean result=(10>=5);
//		System.out.println(result);
//		System.out.println(10==10);//같다
//		System.out.println(10!=5);//같지않다
		
		//논리연산자(&&:and(곱하기로본다), ||:or(더하기로본다), !:not)
		//예시 true(1), false(0)
		System.out.println(10>5 && true);//1*1=1
		System.out.println(true && true);//1*1=1
		System.out.println(true && false);//1*0=0
		System.out.println(false && true);//0*1=0
		System.out.println(false && false);//0*0=0
		System.out.println("-----------------");
		//||:or(더하기로본다)
		System.out.println(10>5 || true);//1+1=2
		System.out.println(true || true);//1+1=2
		System.out.println(true || false);//1+0=1
		System.out.println(false || true);//0+1=1
		System.out.println(false || false);//0+0=0
		System.out.println(!(false || false));//0+0=0결과를 뒤집는다 

		
	}

}
