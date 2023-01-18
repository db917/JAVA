package park01;
//함수형 인터페이스
@FunctionalInterface
public interface AddInterface {//추상 메소드가 2개이상이면 에러
	//함수형 프로그래밍: 매개변수만으로 독립적인 실행을 한다.
	
	public int add(int x, int y);
//	public int add2(int x, int y);
//	public default int sub(int x, int y) {return 0;}디폴트 메소드로 가능
}
