package pack02;

public class Ex02 {
public static void main(String[] args) {
//	//5-10+5 연산순서 -> 왼쪽에서 오른쪽으로
//	int a, b;
//	//연산 순서 <-오른쪽에서 왼쪽으로
//	a=b=10;
//	System.out.println(a);
//	System.out.println(b);
	int n1=10, n2=3;
	int result=n1+n2;
	System.out.println("덧셈 결과:"+result);
	System.out.println("덧셈 결과:"+(n1+n2));// "덧셈결과: 10"+n2
	System.out.println("뺄셈 결과:"+(n1-n2));//우선순위 변경
	System.out.println("곱셈 결과:"+(n1*n2));// 가독성이 좋다.
	System.out.println("나눗셈 결과:"+(n1/n2));
	System.out.println("나머지 결과:"+(n1%n2));
}
}
