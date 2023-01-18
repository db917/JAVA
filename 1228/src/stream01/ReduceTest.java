package stream01;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		} else

			return s2;
	}

}

public class ReduceTest {

	public static void main(String[] args) {

		String greetings[] = { "안녕하세요", "hello", "good mornig", "반가워요" };
		//람다식을 활용
		String str1=Arrays.stream(greetings).reduce("끄아아아아아아아아아아앙",(s1,s2)->{if (s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		} else

			return s2;
	});
		System.out.println(str1);
		
		// 구현된 클래스를 이용 //""는 비교기준값
		String str2 = Arrays.stream(greetings).reduce("", new CompareString());
		System.out.println(str2);
		// Optional<String> 활용
		String str3 = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str3);
	}
}
