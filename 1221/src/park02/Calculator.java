package park02;

public abstract class Calculator implements Calc{
	@Override
	public int add(int i, int j) {
		return i+j;
	}
	@Override
	public int sustract(int i, int j) {
		return i-j;
	}
	

}
