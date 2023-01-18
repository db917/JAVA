package park03;

import java.util.Arrays;
import java.util.Comparator;

public class StreamEx {

	public static void main(String[] args) {
		int[] data = { 5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8 };
		int[] result =Arrays.stream(data) // IntStream을 생 성 한 다.
//				1. Arrays.stream(data)로 정수 배열을 IntStream 으로 생성한다.
				.boxed() // IntStream을 Stream<Integer>로 변 경 한 다.
//				2. .boxed() 로 IntStream 을 Integer 의 Stream 으로 변경한다. 이렇게 하는 이유는 뒤에서 사용할
//				Comparator.reverseOrder 메서드는 원시타입인 int 대신 Integer 를 사용해야 하기 때문이
//				다.
				.filter((a) -> a % 2 == 0) // 짝 수 만 뽑 아 낸 다.
//				3. .filter((a)-> a % 2 == 0)로 짝수만 필터링한다. 이 때 사용한 ‘(a) ‑> a % 2 == 0‘ 구문은
//				위에서 공부한 람다 함수이다. 입력 a 가 짝수인지를 조사하는 람다함수로 짝수에 해당되는 데이터
//				만 필터링한다.
				.distinct() // 중 복 을 제 거 한 다.
//				4. .distinct()로 스트림에서 중복을 제거한다.
				.sorted(Comparator.reverseOrder()) // 역 순 으 로 정 렬 한 다.
//				5. .sorted(Comparator.reverseOrder())로 역순 정렬한다.
				.mapToInt(Integer::intValue) // Stream<Integer>를 IntStream으로 변 경 한 다.
//				6. .mapToInt(Integer::intValue)로 Integer 의 Stream 을 IntStream 으로 변경한다. 왜냐
//				하면 최종적으로 int[] 타입의 배열을 리턴해야 하기 때문이다.
				.toArray() // int[] 배 열 로 반 환 한 다.
//				7. .toArray()를 호출하여 IntStream 의 배열인 int[] 배열을 리턴한다.
		;
	}

}
