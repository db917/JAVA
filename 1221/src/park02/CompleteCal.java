package park02;

public class CompleteCal extends Calculator{
	
	@Override
	public int times(int i, int j) {
		return i*j;
	}

	@Override
	public int divide(int i, int j) {
		if(j==0)
		return ERROR;
				
				
			return	i/j;
	}
	
public void showInfo() {
	System.out.println("모두구현");
	
}
}
