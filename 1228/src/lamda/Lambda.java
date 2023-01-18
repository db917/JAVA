package lamda;

interface Printable {
	void print(String s);
}

class Printer implements Printable {

	public void print(String s) {
		System.out.println(s);
	}
}
//public class Lambda {
//	public static void main(String[] args) {
//		Printable prn = new Printer();
//		prn.print("What is Lambda?");
//	}
public class Lambda {
	public static void main(String[] args) {
		Printable prn = new Printable() {
			@Override
			public void print(String s) {
				System.out.println(s);
			}

		};
		prn.print("What is Lambda?");
	}
}
//public class Lambda {
//	public static void main(String[] args) {
//		Printable prn;
//		prn = (String s) -> {System.out.println(s); }; //람다식1
//		prn = (String s) -> System.out.println(s) ; //람다식2
//		prn = (s) -> System.out.println(s) ; //람다식3
//		prn = s -> System.out.println(s) ; //람다식4를 권장
//		prn.print("What is Lambda?");
//	}
//}

//		Printable prn = new Printable() {
//			@Override
//			public void print(String s) {
//				System.out.println(s);
//			}
//		}
