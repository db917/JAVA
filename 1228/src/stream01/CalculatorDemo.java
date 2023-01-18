package stream01;

interface Calculate<T> {
	T cal(T a, T b);
}
//아래 코드에서 주석에 명시된 연산의 결과를 출력하기 위한 calAndShow 메소드의 호출문을 람다식 기반으로 작성해보자.
public class CalculatorDemo {
	public static <T> void calAndShow(Calculate<T> op, T n1, T n2) {
		T r = op.cal(n1, n2);
		System.out.println(r);
	}

	public static void main(String[] args) {
		
		// 3 + 4
		// 2.5 + 7.1
		// 4 -2
		// 4.9 - 3.2
	}
}
