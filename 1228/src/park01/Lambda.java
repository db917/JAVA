package park01;

public class Lambda {

	public static void main(String[] args) {
//		AddInterface add = new AddInterface() {
//
//			@Override
//			public int add(int x, int y) {
//
//				return x + y;
//			}
//
//		};
//		System.out.println(add.add(10, 20));
		AddInterface add2=(x,y)-> {return x + y;};//리턴문 이있으면 중괄호 생략 불가능
		AddInterface add3=(x,y)-> x + y;
		AddInterface add4=Integer::sum;
		
		System.out.println(add2.add(100,200));
		System.out.println(add3.add(100,200));
		System.out.println(add4.add(100,200));

	}

}
