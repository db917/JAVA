package part01;

public class Boxing_Unboxing {

	public static void main(String[] args) {
		Integer intgr = 10;//autoboxing
		Double db = new Double(1.3);//boxing
		System.out.println(intgr);
		System.out.println(db);

		Integer num = intgr + 10;//autounboxing
		int num3= num;//autounboxing
		
		double num2 = db.doubleValue() + 10;//unboxing
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
	}

}
