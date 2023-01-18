package pack02;

public class Ex14 {
	public static void main(String[] args) {
//continue 사용해서 2468단만 출력
		//2~9단 8번반복
		//continue 사용해서 2468단만 출력
				for (int a = 2; a < 10; a++) {
					if (a % 2 > 0) {
						continue;
					}
					for (int b = 1; b < 10; b++) {
						System.out.println(a + "x" + b + "=" + a * b);

					}
					System.out.println("---------------");
				
		}

	}
}

// 2~9단 8번반복

//					for (int a = 2; a < 10; a++) {
//						// 1~9 9번반복
//						for (int b = 1; b < 10; b++) {
////				if (a < b) {
////					break;
////				}
//							System.out.println(a + "*" + b + "=" + a * b);
//							if (a == b) {
//								break;
//				}
//			}
