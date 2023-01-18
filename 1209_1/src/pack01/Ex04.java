package pack01;

public class Ex04 {
	public static void main(String[] args) {
		
		System.out.println(3/2);
		System.out.println(3.0/2.0);
		System.out.println(3/2.0);//자동형변환
		System.out.println(3.0/2);//자동형변환
		System.out.println(100.0 +3/2 -100);
		System.out.println(100 +3.0/2 -100);
		
		int kor, eng;
		int cnt=0;//과목수
		kor=70;
		cnt=cnt+1; //1
		eng=71;
		cnt=cnt+1; //2
		int tot=kor+eng;
		System.out.println("평균:"+tot/2.0);
		System.out.println("평균:"+tot/2); //정수연산 정수는 정수값만나온다.
		System.out.println("평균:"+(double)tot/cnt); //캐스트연산자=강제 형변환
		System.out.println("평균:"+(double)(tot/cnt)); //우선순위에 따른 오류
	}
	public static void test(String[] args) {
		//심플화 ver
		int kor, eng;
		int cnt=0;//과목수
		kor=70;
		cnt=cnt+1; //1
		eng=71;
		cnt=cnt+1; //2
		int tot=kor+eng;
		double avg=(double)tot/cnt;
		System.out.println("평균:"+tot/2.0);
		System.out.println("평균:"+tot/2); //정수연산 정수는 정수값만나온다.
		System.out.println("평균:"+ avg);
	}
		
	}

