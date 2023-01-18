package park02;

public class CalcMain {
	public static void main(String[] args) {
		int i =10;
		int j =3;
		
		Calc c = new CompleteCal();
		System.out.println(c.add(i, j));
		System.out.println(c.sustract(i, j));
		System.out.println(c.times(i, j));
		System.out.println(c.divide(i, j));
		
	
	}

}
